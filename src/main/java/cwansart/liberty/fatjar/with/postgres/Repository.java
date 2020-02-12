package cwansart.liberty.fatjar.with.postgres;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@ApplicationScoped
public class Repository {

    @PersistenceContext(name = "jpa-unit")
    private EntityManager entityManager;

    public List<Name> getAllNames() {
        return entityManager.createQuery("select n from Name n", Name.class).getResultList();
    }
}
