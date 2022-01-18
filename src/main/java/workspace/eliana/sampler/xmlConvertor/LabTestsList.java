package workspace.eliana.sampler.xmlConvertor;

import com.thoughtworks.xstream.XStream;
import workspace.eliana.sampler.objects.LabTest;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="labTests")
public class LabTestsList<T> extends ObjectsList<T> {

    public LabTestsList(List<T> list) {
        super(list);
    }

    public String stringOfList()
    {
        XStream xstream = new XStream();
        xstream.alias("labTest", LabTest.class);
        xstream.alias("labTests", LabTestsList.class);
        xstream.addImplicitCollection(LabTestsList.class, "list");

        String xml = xstream.toXML(this.list);

        return xml;
    }

}
