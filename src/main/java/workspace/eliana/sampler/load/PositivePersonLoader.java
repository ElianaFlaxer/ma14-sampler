package workspace.eliana.sampler.load;

import health_care_provider.errors.InvalidIdException;
import workspace.eliana.sampler.ConfigLoader;
import workspace.eliana.sampler.read.PositiveReader;
import workspace.eliana.sampler.transform.CrossedPositivePeople;
import workspace.eliana.sampler.write.JsonWriter;

import java.io.IOException;

public class PositivePersonLoader implements Loader{


    @Override
    public void load(String fileName) throws IOException, InvalidIdException {

    }

    @Override
    public void load() throws IOException, InvalidIdException {

        CrossedPositivePeople cd = new CrossedPositivePeople();

        PositiveReader reader = new PositiveReader();

        JsonWriter writer = new JsonWriter();

        String path = (new ConfigLoader().load().getProperty("positiveFilePath"));

        writer.writeToFiles(reader.objectsByFiles(cd.getListOfCrossed()), path);
    }
}
