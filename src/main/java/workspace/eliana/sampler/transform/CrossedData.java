package workspace.eliana.sampler.transform;

import health_care_provider.errors.InvalidIdException;

import java.io.IOException;
import java.util.List;

public interface CrossedData<T> {

    public Object createCrossedObject(Object obj1, Object obj2);

    public List<T> getListOfCrossed() throws IOException, InvalidIdException;
}
