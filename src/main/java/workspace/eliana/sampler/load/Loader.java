package workspace.eliana.sampler.load;

import java.io.IOException;

public interface Loader {

    /**
     * the function calls the reading and writing actions on the file
     * @param fileName - the name of the file to read
     * @throws IOException
     */
    public void load(String fileName) throws IOException;
}
