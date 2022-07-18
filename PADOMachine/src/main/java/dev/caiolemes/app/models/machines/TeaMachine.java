package dev.caiolemes.app.models.machines;

import dev.caiolemes.app.models.products.HotDrink;
import dev.caiolemes.app.models.products.Tea;

public class TeaMachine implements HotDrinkMachine{
    @Override
    public HotDrink makeDrink() {
        return new Tea();
    }

}