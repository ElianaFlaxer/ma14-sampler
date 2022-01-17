package workspace.eliana.sampler.write;

import java.io.IOException;
import java.util.List;

public interface FileTypeWriter<T> {

    /**
     * the function writes the lists of objects to the file path
     * @param listOfLists - the list of lists of objects (by files) we write
     * @param beginPath - the beginning of the path (without ending of file type)
     * @throws IOException
     */
    public void writeToFiles(List<List<T>> listOfLists, String beginPath) throws IOException;

}
