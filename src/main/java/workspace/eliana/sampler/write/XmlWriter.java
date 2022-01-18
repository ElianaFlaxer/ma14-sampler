package workspace.eliana.sampler.write;

import com.thoughtworks.xstream.XStream;
import org.core4j.xml.XDocument;
import workspace.eliana.sampler.ConfigLoader;
import workspace.eliana.sampler.objects.LabTest;
import workspace.eliana.sampler.xmlConvertor.LabTestsList;
import workspace.eliana.sampler.xmlConvertor.ObjectsList;

import javax.xml.bind.annotation.XmlElement;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class XmlWriter<T> implements FileTypeWriter<T>, LabTestXmlWriter{

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

            System.out.println(list.stringOfList());
            fw.write(list.stringOfList());
            
            fw.close();
        }
    }
}
