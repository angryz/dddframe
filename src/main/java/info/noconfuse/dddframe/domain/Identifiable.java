package info.noconfuse.dddframe.domain;

/**
 * Object implements this means an Identity is needed.
 *
 * @author zzp
 */
public interface Identifiable<T> {

    /**
     * Return identity of current instance.
     */
    T id();

    /**
     * Set identity of current instance.
     *
     * @return
     */
    T setId();

}
