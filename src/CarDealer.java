
import java.util.*;

public class CarDealer {
    private String car;

    HashMap<String, String> carsOnLot = new HashMap<String, String>();

    public void carLot() {
        // Add keys and values (model, Make)
        carsOnLot.put("Civic", "Honda");
        carsOnLot.put("Accord", "Honda");
        carsOnLot.put("Pilot", "Honda");
        carsOnLot.put("Focus", "Ford");
        carsOnLot.put("F-150", "Ford");
        carsOnLot.put("Malibu", "Chevy");
        carsOnLot.put("Silverado", "Chevy");
    }

    public void getCars() {
        Scanner whatCar = new Scanner(System.in);
        System.out.println("Welcome to Harry's Happy Hoopties!");
        System.out.println("What model of vehicle are you looking for today?");
        car = whatCar.next();
        whatCar.close();
        if (carsOnLot.containsValue(car)) {
            System.out.printf("Great! Our %s models are right over here!", car);
        } else
            System.out.printf("Sorry. We do not have any %s models. Check back soon!", car);
    }

    public static void main(String[] args) throws Exception {
        CarDealer cars = new CarDealer();
        cars.carLot();
        cars.getCars();
    }
}
