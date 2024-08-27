package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> input = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            input.add(i);
        }

        int i = -1;
        List<Integer> output = new ArrayList<>();
        while (output.size() < numberOfDishes) {
            int k = everyDishNumberToEat;
            while (k-- > 0) {
                i = ++i % input.size();
            }
            output.add(input.get(i));
            input.remove(i--);
        }

        return output;
    }
}
