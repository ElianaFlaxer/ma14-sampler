package workspace.eliana.sampler.write;

import com.thoughtworks.xstream.XStream;
import workspace.eliana.sampler.objects.LabTest;
import workspace.eliana.sampler.xmlConvertor.LabTestsList;

import java.util.List;

public interface LabTestXmlWriter {

    public default void writeSubList(List<Object> list)
    {
        XStream xstream = new XStream();
        xstream.alias("labTest", LabTest.class);
        xstream.alias("labTests", LabTestsList.class);
        xstream.addImplicitCollection(LabTestsList.class, "list");

        String xml = xstream.toXML(list);
        System.out.println(xml);
    }
}
