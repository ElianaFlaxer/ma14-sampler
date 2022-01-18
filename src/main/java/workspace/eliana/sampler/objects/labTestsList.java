package workspace.eliana.sampler.objects;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="labTests")
public class labTestsList<T> extends ObjectsList{

    public labTestsList(List list) {
        super(list);
    }

    @Override
    public void write() {

    }
}
