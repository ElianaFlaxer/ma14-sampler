package workspace.eliana.sampler.transform;

import health_care_provider.errors.InvalidIdException;

import java.io.IOException;
import java.util.List;

public interface CrossedData<T> {

    /**
     * the function gets two objects and creates the crossed object
     * @param obj1 - first object
     * @param obj2 - second object
     * @return - returns a crossed object
     */
    public Object createCrossedObject(Object obj1, Object obj2);

    /**
     * the function gets a list of crossed people by what you wanted
     * @return returns a list
     * @throws IOException
     * @throws InvalidIdException
     */
    public List<T> getListOfCrossed() throws IOException, InvalidIdException;
}
