package org.example.lec_16.practice.task_3;

import java.util.List;
import java.util.Map;

public class FruitsMain {
    public static void main(String[] args) {
        List<Fruit> fruits = List.of(
            new Fruit("banana", 100, FruitType.GREEN),
            new Fruit("plum", 50, FruitType.SEED),
            new Fruit("plum", 100, FruitType.SEED),
            new Fruit("banana", 200, FruitType.GREEN),
            new Fruit("orange", 100, FruitType.CITRUS)
        );

        FruitService fruitService = new FruitService();

        Map<FruitType, List<Fruit>> fruitTypeListMap = fruitService.groupByFruitTypeSorted(fruits);

        for (Map.Entry<FruitType, List<Fruit>> entry : fruitTypeListMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        Map<FruitType, FruitStatistic> statistic = fruitService.calculateStatistic(fruitTypeListMap);

        for (Map.Entry<FruitType, FruitStatistic> entry : statistic.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }

}
