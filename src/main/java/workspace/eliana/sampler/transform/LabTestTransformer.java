package workspace.eliana.sampler.transform;

import workspace.eliana.sampler.ConfigLoader;

import java.io.IOException;

public class LabTestTransformer {

    public boolean isValidId(String id) throws IOException {

        return id.length()==Integer.parseInt((new ConfigLoader()).load().getProperty("idLength"));
    }

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
