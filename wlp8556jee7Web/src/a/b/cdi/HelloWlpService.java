package a.b.cdi;

import java.net.InetAddress;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import a.b.jpa.HelloWlpMsg;
import a.b.jpa.HelloWlpMsgRepository;

@Named
@ApplicationScoped @Transactional
public class HelloWlpService {
	@Inject
	HelloWlpMsgRepository repository;

	public String hello(String name) {
		return "Hello " + name + "@" + host();
	}

	String host(){
		try{
			return InetAddress.getLocalHost().getHostName();
		}catch(Exception e){
			return "unknown-host";
		}
	}

	public List<HelloWlpMsg> findAll() {
		return repository.findAll();
	}

	public List<HelloWlpMsg> entry(String msg) {
		repository.persist(msg);
		return findAll();
	}

	public List<HelloWlpMsg> delete(int id) {
		repository.delete(id);
		return findAll();
	}

//	Validator v = Validation.buildDefaultValidatorFactory().getValidator();
//	System.out.println("v=" + v.getClass());
}
