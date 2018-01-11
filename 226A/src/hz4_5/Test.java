package hz4_5;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args)
    {
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new BMW());
        cars.add(new Mercedes());

        for(Car c: cars)
        {
            c.drive();
        }
    }
}
