package workspace.eliana.sampler.read;

import health_care_provider.HealthCareInfoProvider;
import health_care_provider.errors.InvalidIdException;
import health_care_provider.models.PersonInsured;
import workspace.eliana.sampler.objects.LabTest;
import workspace.eliana.sampler.transform.LabTestTransformer;

import java.io.IOException;

public class LabTestsCsvReader extends CsvReader{

    public LabTestsCsvReader(String fileName) {
        super(fileName);
    }

    @Override
    public Object createObject(String[] rec) throws IOException, InvalidIdException {

        LabTestTransformer transformer = new LabTestTransformer();
        String id = transformer.fixedId(rec[0]);

        HealthCareInfoProvider healthInfo = new HealthCareInfoProvider();
        PersonInsured person = healthInfo.fetchInfo(Integer.parseInt(id),
                Integer.parseInt(rec[1]));

        String joinDate = person.getJoinDate().toString();
        String healthCareId = ""+person.getHealthCareId();
        String healthCareName = person.getHealthCareName();

        return new LabTest(rec[0],rec[1],rec[2],rec[3],rec[4],rec[5],rec[6],rec[7],
                rec[8],rec[9],rec[10],joinDate,healthCareId,healthCareName);
    }
}
