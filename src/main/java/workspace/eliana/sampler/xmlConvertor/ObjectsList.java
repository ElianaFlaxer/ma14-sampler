package workspace.eliana.sampler.xmlConvertor;

import java.util.List;

public abstract class ObjectsList<T> {

    protected List<T> list;

    public ObjectsList(List<T> list)
    {
        this.list=list;
    }

    public List<T> getList() {
        return list;
    }
    public abstract String stringOfList();
}
