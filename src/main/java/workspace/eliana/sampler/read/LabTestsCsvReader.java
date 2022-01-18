package workspace.eliana.sampler.read;

import workspace.eliana.sampler.objects.LabTest;

public class LabTestsCsvReader extends CsvReader{

    public LabTestsCsvReader(String fileName) {
        super(fileName);
    }

    @Override
    public Object createObject(String[] rec) {

        return new LabTest(rec[0],rec[1],rec[2],rec[3],rec[4],rec[5],rec[6],rec[7],
                rec[8],rec[9],rec[10]);
    }
}
