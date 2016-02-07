package sample.jsf;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.Size;

@Named @RequestScoped
public class HelloWlpAction {

	@Size(min=2, max=5)
	private String name;
	private String msg;

	public String doHello() {
		msg = "hello " + name;
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
