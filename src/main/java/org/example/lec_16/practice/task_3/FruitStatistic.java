package org.example.lec_16.practice.task_3;

public class FruitStatistic {
    private String name;
    private Integer weight;
    private FruitType type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public FruitType getType() {
        return type;
    }

    public void setType(FruitType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "FruitStatistic{" +
            "name='" + name + '\'' +
            ", weight=" + weight +
            ", type=" + type +
            '}';
    }

}
