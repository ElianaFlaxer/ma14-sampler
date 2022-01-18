package workspace.eliana.sampler.write;

import workspace.eliana.sampler.ConfigLoader;
import workspace.eliana.sampler.objects.LabTest;
import workspace.eliana.sampler.xmlConvertor.LabTestsList;
import workspace.eliana.sampler.xmlConvertor.ObjectsList;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class XmlWriter<T> implements FileTypeWriter<T>, LabTestXmlWriter{


    /*
    public String stringOneObj(Object obj) throws JAXBException {

        JAXBContext jaxbContext = JAXBContext.newInstance(LabTest.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        StringWriter sw = new StringWriter();
        jaxbMarshaller.marshal(obj, sw);
        String xmlContent = sw.toString();
        return xmlContent;
    }


    public void writeToFiles(List<List<T>> listOfLists, String beginPath) throws IOException {
        String xmlEnd = new ConfigLoader().load().getProperty("xmlEnd");

        for(int i = 0; i< listOfLists.size() ; i++)
        {
            File file = new File(beginPath+(i+1)+xmlEnd);
            FileWriter fw = new FileWriter(file);

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

     */


    @Override
    public void writeToFiles(List<List<T>> listOfLists, String beginPath) throws IOException {

        String xmlEnd = new ConfigLoader().load().getProperty("xmlEnd");

        for(int i = 0; i< listOfLists.size() ; i++)
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
