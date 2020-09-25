import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("/api/cars")
public class CarsResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Car> getCars() {
        return Cars.getInstance().get();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addCar(Car newCar) {
        Cars.getInstance().post(newCar);
        return Response.ok().build();
    }

    @DELETE
    @Path("{id}")
    public Response deleteCar(@PathParam("id") int id) {
        Cars.getInstance().delete(id);
        return Response.ok().build();
    }
}
