package workspace.eliana.sampler.read;

import health_care_provider.errors.InvalidIdException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class CsvReader<T> extends FileTypeReader{

    public CsvReader(String fileName) {
        super(fileName);
    }

    /**
     * the function creates the object from its record in the file
     * @param rec - the record in the file
     * @return - returns the object itself
     */
    public abstract T createObject(String[] rec) throws IOException, InvalidIdException;

    @Override
    public List<T> allObjects() throws IOException, InvalidIdException {

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        List<T> objects = new ArrayList<>();
        String line;
        String splitBy = ",";

        line = br.readLine();

        while ((line = br.readLine()) != null)
        {
            String[] oneLines = line.split(splitBy);
            T object = createObject(oneLines);
            objects.add(object);
        }

        return objects;
    }
}
