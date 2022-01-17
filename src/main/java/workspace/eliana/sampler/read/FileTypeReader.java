package workspace.eliana.sampler.read;

import workspace.eliana.sampler.ConfigLoader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class FileTypeReader<T> {

    protected String fileName;

    public FileTypeReader(String fileName) {
        this.fileName=fileName;
    }

    public abstract List<T> allObjects() throws IOException;

    public List<List<T>> objectsByFiles() throws IOException {

        List<T> allObjects = this.allObjects();
        int maxRecordsNum = Integer.parseInt((new ConfigLoader()).load().getProperty("maxRecordsNum"));
        int numFiles = allObjects.size()/maxRecordsNum;
        int counter;
        List<List<T>> listByFiles = new ArrayList<>();

        for(int i=0; i<numFiles ; i++)
        {
            counter = i*maxRecordsNum;
            List<T> list = allObjects.subList(counter, counter+maxRecordsNum-1);
            listByFiles.add(list);
        }

        listByFiles.add(allObjects.subList(numFiles*maxRecordsNum,allObjects.size()-1));

        return listByFiles;
    }
}
