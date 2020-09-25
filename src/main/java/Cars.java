import java.util.ArrayList;

public class Cars {

    private static int nextId = 0;
    private static Cars instance = null;

    public static Cars getInstance() {
        if (instance == null) {
            instance = new Cars();
        }
        return instance;
    }

    private static int getNextId() {
        return nextId++;
    }

    private ArrayList<Car> cars = new ArrayList<>();

    public ArrayList<Car> get() {
        return cars;
    }

    public void post(Car newCar) {
        newCar.setId(getNextId());
        cars.add(newCar);
    }

    public void delete(int id) {
        for (Car car : cars) {
            if (car.getId() == id) {
                cars.remove(car);
                break;
            }
        }
    }
}
