package workspace.eliana.sampler.objects;

import java.util.List;

public abstract class ObjectsList<T> {

    protected List<T> list;

    public ObjectsList(List<T> list)
    {
        this.list=list;
    }

    public abstract void write();
}
