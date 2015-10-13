package a.b.jrs;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import a.b.cdi.HelloWlpService;
import a.b.jpa.HelloWlpMsg;

@ApplicationScoped
@Path("/helloWlp")
public class HelloWlpResource {
	@Inject
	HelloWlpService service;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public HelloWlpUser hello(
			@QueryParam("name") @DefaultValue("WLP_USER") String name) {
		return new HelloWlpUser(name, service.hello(name));
	}

	@GET
	@Path("/findAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<HelloWlpMsg> findAll() {
		return service.findAll();
	}

	@GET
	@Path("/entry/{msg}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<HelloWlpMsg> entry(
			@PathParam("msg") @DefaultValue("HELLO WLP!") String msg) {
		return service.entry(msg);
	}

	@GET
	@Path("/delete/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<HelloWlpMsg> delete(@PathParam("id") int id) {
		return service.delete(id);
	}

	static class HelloWlpUser {
		public HelloWlpUser(String name, String greeting) {
			super();
			this.name = name;
			this.greeting = greeting;
		}

		String name;
		String greeting;

		public String getName() {
			return name;
		}

		public String getGreeting() {
			return greeting;
		}
	}
}
