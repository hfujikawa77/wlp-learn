package a.b.jsf;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.Size;

import a.b.cdi.HelloWlpService;

@Named @RequestScoped
public class HelloWlpAction {
	@Inject
	HelloWlpService service;

	@Size(min=2, max=5)
	private String name;
	private String msg;

	public String doHello() {
		msg = service.hello(name);
		return "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
