package workspace.eliana.sampler.read;

import health_care_provider.errors.InvalidIdException;
import org.openjdk.jol.vm.VM;
import workspace.eliana.sampler.ConfigLoader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PositiveReader<T> {

    /**
     * the same function of fileTypeReader but without needing to read
     * @param allObjects
     * @return - returns a list of lists parted by how much the file takes in memory
     * @throws IOException
     * @throws InvalidIdException
     */
    public List<List<T>> objectsByFiles(List<T> allObjects) throws IOException, InvalidIdException
    {
        int maxFileSize = Integer.parseInt((new ConfigLoader()).load().getProperty("maxFileSize"));
        List<List<T>> listByFiles = new ArrayList<>();
        int counter;

        long objSize = VM.current().sizeOf(allObjects.get(0));
        int numObjectsInFile = (int) (maxFileSize/objSize);
        int numFiles = allObjects.size()/numObjectsInFile;

        for(int i=0; i<numFiles ; i++)
        {
            counter = i*numObjectsInFile;
            List<T> list = allObjects.subList(counter, counter+numObjectsInFile-1);
            listByFiles.add(list);
        }

        listByFiles.add(allObjects.subList(numFiles*numObjectsInFile,allObjects.size()));

        return listByFiles;
    }
}
