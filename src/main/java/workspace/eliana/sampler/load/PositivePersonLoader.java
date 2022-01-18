package workspace.eliana.sampler.load;

import health_care_provider.errors.InvalidIdException;
import workspace.eliana.sampler.ConfigLoader;
import workspace.eliana.sampler.transform.CrossedPositivePeople;
import workspace.eliana.sampler.write.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PositivePersonLoader implements Loader{


    @Override
    public void load(String fileName) throws IOException, InvalidIdException {

    }

    @Override
    public void load() throws IOException, InvalidIdException {

        CrossedPositivePeople cd = new CrossedPositivePeople();
        List list = cd.getListOfCrossed();

        List<List> listOflists = new ArrayList<>();
        listOflists.add(list);

        JsonWriter writer = new JsonWriter();
        String path = (new ConfigLoader().load().getProperty("positiveFilePath"));
        writer.writeToFiles(listOflists, path);
    }
}
