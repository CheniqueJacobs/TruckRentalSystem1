package za.ac.cput.repository;

import java.util.Collection;

@Deprecated
public interface IRepository<T, ID> {

    T create(T t);
    T read(ID id);
    T update(T t);
    Boolean delete(ID id);


}
