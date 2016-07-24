package HeadFirst.Decorator_3.StarBuzz.Coffee;

import HeadFirst.Decorator_3.StarBuzz.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
