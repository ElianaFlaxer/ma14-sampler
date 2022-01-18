package workspace.eliana.sampler.write.xmlListConvertor;

import java.util.List;

public abstract class ObjectsList<T> {

    protected List<T> list;

    public ObjectsList(List<T> list)
    {
        this.list=list;
    }

    /**
     * the function creates a xml string from the list of objects
     * @return - returns the xml string
     */
    public abstract String stringOfList();
}
