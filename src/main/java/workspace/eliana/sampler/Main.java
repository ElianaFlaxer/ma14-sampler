package workspace.eliana.sampler;

import health_care_provider.errors.InvalidIdException;
import workspace.eliana.sampler.load.LabTestXmlLoader;
import workspace.eliana.sampler.load.Loader;
import workspace.eliana.sampler.load.ReportJsonLoader;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InvalidIdException {

        Loader reportLoader = new ReportJsonLoader();
        reportLoader.load("src/main/resources/madaReports.csv");

        Loader LabTeatLoader = new LabTestXmlLoader();
        LabTeatLoader.load("src/main/resources/LabTests.csv");

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
