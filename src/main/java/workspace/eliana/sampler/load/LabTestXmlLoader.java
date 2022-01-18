package workspace.eliana.sampler.load;

import health_care_provider.errors.InvalidIdException;
import workspace.eliana.sampler.ConfigLoader;
import workspace.eliana.sampler.read.FileTypeReader;
import workspace.eliana.sampler.read.LabTestsCsvReader;
import workspace.eliana.sampler.write.FileTypeWriter;
import workspace.eliana.sampler.write.XmlWriter;

import java.io.IOException;

public class LabTestXmlLoader implements Loader {

    @Override
    public void load(String fileName) throws IOException, InvalidIdException {

        FileTypeReader reader = new LabTestsCsvReader(fileName);

        FileTypeWriter writer = new XmlWriter();

        writer.writeToFiles(reader.objectsByFiles(),
                new ConfigLoader().load().getProperty("labTestsFilePath"));
    }

    @Override
    public void load() throws IOException, InvalidIdException {

    }
}
