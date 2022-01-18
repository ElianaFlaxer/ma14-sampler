package workspace.eliana.sampler.write;

import workspace.eliana.sampler.ConfigLoader;

import java.io.IOException;
import java.util.List;

public class XmlWriter implements FileTypeWriter{

    @Override
    public void writeToFiles(List listOfLists, String beginPath) throws IOException {

        String xmlEnd = new ConfigLoader().load().getProperty("xmlEnd");
    }
}
