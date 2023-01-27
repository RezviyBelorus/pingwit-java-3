package org.example.lec_16.practice.task_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FruitService {

    public Map<FruitType, List<Fruit>> groupByFruitTypeSorted(List<Fruit> fruits) {
        Map<FruitType, List<Fruit>> fruitsByFruitType = new TreeMap<>();

        for (Fruit fruit : fruits) {
            List<Fruit> listByFruitType = fruitsByFruitType.get(fruit.getType());

            if (listByFruitType == null) {
                List<Fruit> groupedFruits = new ArrayList<>();
                groupedFruits.add(fruit);
                fruitsByFruitType.put(fruit.getType(), groupedFruits);
            } else {
                listByFruitType.add(fruit);
            }
        }

        return fruitsByFruitType;
    }

    public Map<FruitType, FruitStatistic> calculateStatistic(Map<FruitType, List<Fruit>> fruitsByFruitType) {
        Map<FruitType, FruitStatistic> statistic = new HashMap<>();

        Set<Map.Entry<FruitType, List<Fruit>>> entries = fruitsByFruitType.entrySet();
        for (Map.Entry<FruitType, List<Fruit>> entry : entries) {
            FruitType key = entry.getKey();
            List<Fruit> value = entry.getValue(); // extract variable -> alt+ctrl+v

            FruitStatistic fruitStatistic = new FruitStatistic();

            for (int i = 0; i < value.size(); i++) {
                Fruit fruit = value.get(i);

                if (i == 0) {
                    fruitStatistic.setType(fruit.getType());
                    fruitStatistic.setName(fruit.getName());
                    fruitStatistic.setWeight(fruit.getWeight());
                } else {
                    fruitStatistic.setWeight(fruitStatistic.getWeight() + fruit.getWeight());
                }
            }

            statistic.put(fruitStatistic.getType(), fruitStatistic);
        }

        return statistic;
    }
}
