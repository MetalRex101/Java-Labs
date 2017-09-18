package ru.politech;

/**
 * Created by snake on 22.04.17.
 */
public class Picture implements Present {
    /**
     * Реализует метод интерфейса Present
     */
    @Override
    public void whoAmI() {

    }

    /**
     * Реализует метод интерфейса Product
     */
    @Override
    public String it_can_be_presented() {
        return this.getClass().getName();
    }
}
