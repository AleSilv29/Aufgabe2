package Repository;

import java.util.List;

public interface ICrudRepository<ID, E> {
    void add(E entity);

    void remove(ID id);

    void update(E newEntity, ID id);

    E findByID(ID id);

    List<E> getAll();
}

