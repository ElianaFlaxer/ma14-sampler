package workspace.eliana.sampler.compare;

import workspace.eliana.sampler.objects.LabTest;
import workspace.eliana.sampler.objects.Report;

public class CmpReportAndTest<E,T> implements CompareObjects{

    @Override
    public boolean areSame(Object obj1, Object obj2) {

        Report report = (Report) obj1;
        LabTest labTest = (LabTest) obj2;

        if((report.getIdNum().equals(labTest.getIdNum()))
                &&(report.getIdType().equals(labTest.getIdType())))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
