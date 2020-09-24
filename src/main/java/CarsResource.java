import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

@Path("/api/cars")
public class CarsResource {

    private ArrayList<Car> cars = new ArrayList<Car>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Car> getCars() {
        return cars;
    }
}
