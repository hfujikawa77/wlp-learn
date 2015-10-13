package a.b.jws;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebService;

import a.b.cdi.HelloWlpService;
import a.b.jpa.HelloWlpMsg;

@WebService
public class HelloWlpSoapServer {
	@Inject
	HelloWlpService service;

	public List<HelloWlpMsg> findAll() {
		return service.findAll();
	}

	public List<HelloWlpMsg> entry(String msg) {
		return service.entry(msg);
	}

	public List<HelloWlpMsg> delete(int id) {
		return service.delete(id);
	}

	public String hello(String name) {
		return service.hello(name);
	}
}
