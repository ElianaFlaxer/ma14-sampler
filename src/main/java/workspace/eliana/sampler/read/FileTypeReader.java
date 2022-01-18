package workspace.eliana.sampler.read;

import health_care_provider.errors.InvalidIdException;
import org.openjdk.jol.vm.VM;
import workspace.eliana.sampler.ConfigLoader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class FileTypeReader<T> {

    protected String fileName;

    public FileTypeReader(String fileName) {
        this.fileName=fileName;
    }

    /**
     * the function reads the file and creates a list of the objects in it
     * @return - returns a list of the objects from the file
     * @throws IOException
     */
    public abstract List<T> allObjects() throws IOException, InvalidIdException;


    /**FUNCTION FROM PARTS A + B
     * the function creates a list of lists of the objects - each sublist is a file
     * divided by the maximum number of lines in each file (from configurations)
     * @return - returns the list of lists
     * @throws IOException
     */
    /*
    public List<List<T>> objectsByFiles() throws IOException, InvalidIdException {

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

        listByFiles.add(allObjects.subList(numFiles*maxRecordsNum,allObjects.size()));

        return listByFiles;
    }
     */

    public List<List<T>> objectsByFiles() throws IOException, InvalidIdException
    {
        List<T> allObjects = this.allObjects();
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
