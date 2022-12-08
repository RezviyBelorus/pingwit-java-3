package org.example.lec_8.point_1;

import java.lang.reflect.Constructor;

public class PrivateClubPrivateConstructorMain {
    public static void main(String[] args) throws Exception {
        Class<PrivateClub> privateClubClass = PrivateClub.class;

        Constructor<?>[] declaredConstructors = privateClubClass.getDeclaredConstructors();

        PrivateClub privateClub = null;

        for (Constructor<?> declaredConstructor : declaredConstructors) {
            Class<?>[] parameterTypes = declaredConstructor.getParameterTypes();

            for (Class<?> parameterType : parameterTypes) {
                if (String.class.getName().equals(parameterType.getName()) && parameterTypes.length == 1) {
                    declaredConstructor.setAccessible(true);
                    privateClub = (PrivateClub) declaredConstructor.newInstance("Dinamo Doc");
                }
            }
        }

        System.out.println(privateClub);
    }

}
