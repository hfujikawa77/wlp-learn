package a.b.jpa;

import java.sql.Timestamp;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Named
@ApplicationScoped
public class HelloWlpMsgRepository {

	@PersistenceContext(name = "wlp8556jee7Web")
	EntityManager em;

	public List<HelloWlpMsg> findAll() {
		return em.createNamedQuery("HelloWlpMsg.findAll").getResultList();
	}

	public void persist(String msg) {
		HelloWlpMsg entity = new HelloWlpMsg();
		entity.setMsg(msg);
		// JSONŽž‚Élong‚É‚È‚é‚½‚ß
		entity.setUpdated(new Timestamp(System.currentTimeMillis()).toString());
		em.persist(entity);
	}

	public void delete(int id) {
		em.remove(em.find(HelloWlpMsg.class, id));
	}
}
