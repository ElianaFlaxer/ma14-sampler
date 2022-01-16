package workspace.eliana.sampler.read;

import java.util.List;

public abstract class FileTypeReader<T> {

    protected String fileName;

    public abstract List<T> objectsFromFile(String fileName);

    //public List<List<T>> objectsToFiles()



}
