package workspace.eliana.sampler.transform;

import workspace.eliana.sampler.ConfigLoader;

import java.io.IOException;

public class LabTestTransformer {

    /**
     * the function checks if the id is valid
     * @param id - the id
     * @return - true if it's valid, false if not
     * @throws IOException
     */
    public boolean isValidId(String id) throws IOException {

        return id.length()==Integer.parseInt((new ConfigLoader()).load().getProperty("idLength"));
    }

    /**
     * the function checks if the id is valid and returns a valid id
     * @param id - the id
     * @return - returns a valid id
     * @throws IOException
     */
    public String fixedId(String id) throws IOException {

        if(!this.isValidId(id))
        {
            int len = Integer.parseInt((new ConfigLoader()).load().getProperty("idLength"));

            while(id.length()<len)
            {
                id+="0";
            }
        }
        return id;
    }
}
