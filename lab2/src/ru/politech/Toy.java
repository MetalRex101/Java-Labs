package ru.politech;

/**
 * Created by snake on 22.04.17.
 */
public class Toy implements Present {
    @Override
    public void whoAmI() {

    }

    @Override
    public String it_can_be_presented() {
        return this.getClass().getName();
    }
}
