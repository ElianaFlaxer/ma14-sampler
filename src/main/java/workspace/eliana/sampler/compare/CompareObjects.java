package workspace.eliana.sampler.compare;

public interface CompareObjects<E,T> {

    public boolean areSame(T obj1, E obj2);
}
