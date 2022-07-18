package dev.caiolemes.app.models.machines;

import dev.caiolemes.app.models.products.Coffee;
import dev.caiolemes.app.models.products.HotDrink;

public class CoffeeMachine implements HotDrinkMachine{

    @Override
    public HotDrink makeDrink() {
        return new Coffee();
    }
}
