package workspace.eliana.sampler.write;

import java.io.IOException;
import java.util.List;

public interface FileTypeWriter<T> {

    public void writeToFiles(List<List<T>> listOflists, String beginPath) throws IOException;

}
