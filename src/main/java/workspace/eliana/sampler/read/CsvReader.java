package workspace.eliana.sampler.read;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public abstract class CsvReader<T> extends FileTypeReader{


    public abstract List<T> objectsFromFile() throws IOException;

    public abstract T createObject(String[] rec);
}
