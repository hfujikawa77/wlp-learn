package a.b.c;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Named
@RequestScoped
public class MyModel {

    @PersistenceContext(unitName = "javaee7-min-pu")
    private EntityManager em;

    public Object getValue() {
    	System.out.println("pre em.");
        Content content = em.find(Content.class, 1);
        System.out.println("post em." + content);
        return content.getValue();
    }

}
