package org.example.lec_5.classwork.point_2;

public class Modifiers {

    private static final Long SERIAL_VERSION = 123L;

    /*
    private - только внутри класса
    default - видно внутри пакет
    protected - видно внутри пакет + у наследников
    public - доступ везде
     */

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Modifiers{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }

}
