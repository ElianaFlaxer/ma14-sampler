package workspace.eliana.sampler.write;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import workspace.eliana.sampler.ConfigLoader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JsonWriter<T> implements FileTypeWriter<T> {

    public void writeToFiles(List<List<T>> listOfLists, String beginPath) throws IOException {

        String jsonEnd = new ConfigLoader().load().getProperty("jsonEnd");

        for(int i = 0; i< listOfLists.size() ; i++)
        {
            File file = new File(beginPath+(i+1)+jsonEnd);
            FileWriter fw = new FileWriter(file);

            ObjectMapper objectMapper = new ObjectMapper();

            for(Object obj : listOfLists.get(i))
            {
                objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
                fw.write(objectMapper.writeValueAsString(obj));
                fw.write(System.lineSeparator());
            }

            fw.close();
        }
    }
}