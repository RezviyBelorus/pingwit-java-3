package org.example.lec_8.practice.task_2;

import java.lang.reflect.Method;

public class WaterMain {
    public static void main(String[] args) throws Exception {
        Water water = new Water();

        Class<?> aClass = water.getClass();

        Method method = aClass.getDeclaredMethod("printNameWater", String.class, Integer.class);
        method.setAccessible(true);
        method.invoke(water, "Coca-cola", 33);
    }
}
