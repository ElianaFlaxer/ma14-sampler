import com.thoughtworks.xstream.XStream;
import health_care_provider.errors.InvalidIdException;
import workspace.eliana.sampler.ConfigLoader;
import workspace.eliana.sampler.load.LabTestXmlLoader;
import workspace.eliana.sampler.load.Loader;
import workspace.eliana.sampler.load.ReportJsonLoader;
import workspace.eliana.sampler.objects.LabTest;
import workspace.eliana.sampler.read.FileTypeReader;
import workspace.eliana.sampler.read.LabTestsCsvReader;
import workspace.eliana.sampler.write.FileTypeWriter;
import workspace.eliana.sampler.write.XmlWriter;
import workspace.eliana.sampler.xmlConvertor.LabTestsList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;


public class Main {

    private static void jaxbObjectToXML(Object obj)
    {
        try
        {
            JAXBContext jaxbContext = JAXBContext.newInstance(LabTest.class);

            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            StringWriter sw = new StringWriter();

            jaxbMarshaller.marshal(obj, sw);

            String xmlContent = sw.toString();
            System.out.println( xmlContent );

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException, JAXBException, InvalidIdException {

        Loader reportLoader = new ReportJsonLoader();
        reportLoader.load("src/main/resources/madaReports.csv");

        Loader LabTeatLoader = new LabTestXmlLoader();
        LabTeatLoader.load("src/main/resources/LabTests.csv");

        /*
        LabTest t1 = new LabTest("1","1","1","1","1",
                "1","1","1","1","1","1");

        LabTest t2 = new LabTest("1","1","1","1","1",
                "1","1","1","1","1","1");

        List<LabTest> list = new ArrayList<>();
        list.add(t1);
        list.add(t2);

        LabTestsList l = new LabTestsList(list);

        objTry(list);

         */







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
