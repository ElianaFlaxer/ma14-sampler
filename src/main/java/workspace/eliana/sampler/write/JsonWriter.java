package workspace.eliana.sampler.write;

import com.fasterxml.jackson.databind.ObjectMapper;
import workspace.eliana.sampler.ConfigLoader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public abstract class JsonWriter<T> implements FileTypeWriter<T> {


    public void writeToFiles(List<List<T>> listOflists, String beginPath) throws IOException {

        String jsonEnd = new ConfigLoader().load().getProperty("jsonEnd");

        for(int i=0 ; i<listOflists.size() ; i++)
        {
            File file = new File(beginPath+(i+1)+jsonEnd);
            FileWriter fw = new FileWriter(file);
            ObjectMapper objectMapper = new ObjectMapper();

            for(Object obj : listOflists.get(i))
            {
                fw.write(objectMapper.writeValueAsString(obj));
                fw.write(System.lineSeparator());
            }
            fw.close();
        }
    }
}
