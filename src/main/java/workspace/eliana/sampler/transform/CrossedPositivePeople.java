package workspace.eliana.sampler.transform;

import health_care_provider.errors.InvalidIdException;
import workspace.eliana.sampler.compare.CmpReportAndTest;
import workspace.eliana.sampler.compare.CompareObjects;
import workspace.eliana.sampler.objects.LabTest;
import workspace.eliana.sampler.objects.PositivePerson;
import workspace.eliana.sampler.objects.Report;
import workspace.eliana.sampler.read.FileTypeReader;
import workspace.eliana.sampler.read.LabTestsCsvReader;
import workspace.eliana.sampler.read.ReportCsvReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CrossedPositivePeople implements CrossedData{

    @Override
    public PositivePerson createCrossedObject(Object obj1, Object obj2) {

        Report r = (Report) obj1;
        LabTest l = (LabTest) obj2;

        return new PositivePerson(l.getIdNum(),l.getIdType(),l.getFirstName(),l.getLastName(),
                r.getCity(),r.getStreet(),r.getBuildingNumber(),r.getBarcode(),
                l.getBirthDate(),l.getLabCode(),r.getResultDate(),r.getTakeDate(),
                l.getStickerNumber(),l.getResultTestCorona(),l.getVariant(),l.getTestType());
    }

    @Override
    public List<PositivePerson> getListOfCrossed() throws IOException, InvalidIdException {

        ReportCsvReader reportReader = new ReportCsvReader("src/main/resources/madaReports.csv");
        List<Report> reports = reportReader.allObjects();

        LabTestsCsvReader testReader = new LabTestsCsvReader("src/main/resources/LabTests.csv");
        List<LabTest> labTests = testReader.allObjects();

        CmpReportAndTest<Report,LabTest> cmp = new CmpReportAndTest<>();
        List<PositivePerson> positiveList = new ArrayList<>();

        for(LabTest currTest : labTests)
        {
            if(currTest.isPositive())
            {
                for(Report currReport : reports)
                {
                    if(cmp.areSame(currReport,currTest))
                    {
                        positiveList.add(this.createCrossedObject(currReport,currTest));
                    }
                }
            }
        }

        return positiveList;
    }
}
