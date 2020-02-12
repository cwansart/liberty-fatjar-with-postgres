package cwansart.liberty.fatjar.with.postgres;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("names")
@Produces({MediaType.APPLICATION_JSON})
public class NameResource {

    @Inject
    Repository repository;

    @GET
    public Response getAll() {
        return Response.ok(this.repository.getAllNames()).build();
    }
}
