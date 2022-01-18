package workspace.eliana.sampler;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigLoader {

    /**
     * the function loads the parameters from the configurations file
     * @return - returns Properties class
     * @throws IOException
     */
    public Properties load() throws IOException {

        InputStream input = new FileInputStream("src/main/resources/config.properties");

        Properties prop = new Properties();
        prop.load(input);

        return prop;
    }
}
