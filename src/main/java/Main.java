import workspace.eliana.sampler.ConfigLoader;
import workspace.eliana.sampler.load.Loader;
import workspace.eliana.sampler.load.ReportJsonLoader;
import workspace.eliana.sampler.objects.LabTest;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Properties;



public class Main {

    private static void jaxbObjectToXML(LabTest labTest)
    {
        try
        {
            JAXBContext jaxbContext = JAXBContext.newInstance(LabTest.class);

            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            StringWriter sw = new StringWriter();

            jaxbMarshaller.marshal(labTest, sw);

            String xmlContent = sw.toString();
            System.out.println( xmlContent );

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException, JAXBException {

        Loader loader = new ReportJsonLoader();
        loader.load("src/main/resources/madaReports.csv");

        LabTest t = new LabTest("1","1","1","1","1",
                "1","1","1","1","1","1");

        jaxbObjectToXML(t);
        /*
        String path = new ConfigLoader().load().getProperty("labTestsFilePath");
        String xmlEnd = new ConfigLoader().load().getProperty("xmlEnd");
        File file = new File(path+xmlEnd);
        JAXBContext jaxbContext = JAXBContext.newInstance(
                workspace.eliana.sampler.objects.LabTest.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(t, file);// this line create customer.xml file in specified path.

        StringWriter sw = new StringWriter();
        jaxbMarshaller.marshal(t, sw);
        String xmlString = sw.toString();

        System.out.println(xmlString);

         */
    }
}
