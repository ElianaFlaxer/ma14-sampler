package workspace.eliana.sampler.compare;

public interface CompareObjects<E,T> {

    /**
     * the function returns if the objects match according what we're looking
     * @param obj1 - first object
     * @param obj2 - second object
     * @return - returns true if they match false if not
     */
    public boolean areSame(T obj1, E obj2);
}
