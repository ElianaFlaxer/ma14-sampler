package workspace.eliana.sampler.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class CsvReader<T> extends FileTypeReader{

    public CsvReader(String fileName) {
        super(fileName);
    }

    public abstract T createObject(String[] rec);

    @Override
    public List<T> allObjects() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        List<T> objects = new ArrayList<>();
        String line;
        String splitBy = ",";

        while ((line = br.readLine()) != null)
        {
            String[] allLines = line.split(splitBy);
            T object = createObject(allLines);
            objects.add(object);
        }

        return objects;
    }
}
