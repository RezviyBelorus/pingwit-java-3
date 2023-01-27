package org.example.lec_16.practice.task_3;

import java.util.Objects;

public class Fruit {
    private String name;
    private Integer weight;
    private FruitType type;

    public Fruit(String name, Integer weight, FruitType type) {
        this.name = name;
        this.weight = weight;
        this.type = type;
    }

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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Fruit fruit = (Fruit) o;
        return Objects.equals(name, fruit.name) && Objects.equals(weight, fruit.weight) && Objects.equals(type, fruit.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, type);
    }

    @Override
    public String toString() {
        return "Fruit{" +
            "name='" + name + '\'' +
            ", weight=" + weight +
            ", type=" + type +
            '}';
    }

}
