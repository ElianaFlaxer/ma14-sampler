package workspace.eliana.sampler.write;

import workspace.eliana.sampler.ConfigLoader;
import workspace.eliana.sampler.objects.LabTest;
import workspace.eliana.sampler.write.xmlListConvertor.LabTestsList;
import workspace.eliana.sampler.write.xmlListConvertor.ObjectsList;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class XmlWriter<T> implements FileTypeWriter<T>{

    @Override
    public void writeToFiles(List<List<T>> listOfLists, String beginPath) throws IOException {

        String xmlEnd = new ConfigLoader().load().getProperty("xmlEnd");

        for(int i = 0; i<listOfLists.size() ; i++)
        {
            File file = new File(beginPath+(i+1)+xmlEnd);
            FileWriter fw = new FileWriter(file);
            ObjectsList list = null;
            
            if(listOfLists.get(0).get(0) instanceof LabTest)
            {
                list = new LabTestsList(listOfLists.get(i));
            }
            
            fw.write(list.stringOfList());
            
            fw.close();
        }
    }
}
