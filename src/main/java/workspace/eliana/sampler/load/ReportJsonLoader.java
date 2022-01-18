package workspace.eliana.sampler.load;

import health_care_provider.errors.InvalidIdException;
import workspace.eliana.sampler.ConfigLoader;
import workspace.eliana.sampler.read.FileTypeReader;
import workspace.eliana.sampler.read.ReportCsvReader;
import workspace.eliana.sampler.write.FileTypeWriter;
import workspace.eliana.sampler.write.JsonWriter;

import java.io.IOException;

public class ReportJsonLoader implements Loader{

    @Override
    public void load(String fileName) throws IOException, InvalidIdException {

        FileTypeReader reader = new ReportCsvReader(fileName);

        FileTypeWriter writer = new JsonWriter();

        writer.writeToFiles(reader.objectsByFiles(),
                new ConfigLoader().load().getProperty("reportsFilePath"));
    }

    @Override
    public void load() throws IOException, InvalidIdException {

    }
}
