package workspace.eliana.sampler.write;

import com.fasterxml.jackson.databind.ObjectMapper;
import workspace.eliana.sampler.ConfigLoader;
import workspace.eliana.sampler.objects.LabTest;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

public class XmlWriter<T> implements FileTypeWriter<T>{

    public String stringOneObj(Object obj) throws JAXBException {

        JAXBContext jaxbContext = JAXBContext.newInstance(LabTest.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        StringWriter sw = new StringWriter();
        jaxbMarshaller.marshal(obj, sw);
        String xmlContent = sw.toString();
        return xmlContent;
    }

    @Override
    public void writeToFiles(List<List<T>> listOfLists, String beginPath) throws IOException {

        String xmlEnd = new ConfigLoader().load().getProperty("xmlEnd");

        for(int i = 0; i< listOfLists.size() ; i++)
        {
            File file = new File(beginPath+(i+1)+xmlEnd);
            FileWriter fw = new FileWriter(file);

            ObjectMapper objectMapper = new ObjectMapper();

            for(Object obj : listOfLists.get(i))
            {
                try {
                    fw.write(this.stringOneObj(obj));
                } catch (JAXBException e) {
                    e.printStackTrace();
                }
            }

            fw.close();
        }
    }
}
