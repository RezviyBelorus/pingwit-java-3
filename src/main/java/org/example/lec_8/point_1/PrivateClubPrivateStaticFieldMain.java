package org.example.lec_8.point_1;

import java.lang.reflect.Field;

public class PrivateClubPrivateStaticFieldMain {
    public static void main(String[] args) throws Exception {
        PrivateClub richCat = new PrivateClub();

        System.out.println(richCat);
        System.out.println(PrivateClub.SERIAL_VERSION);

        Class<PrivateClub> privateClubClass = PrivateClub.class;

        Field[] declaredFields = privateClubClass.getDeclaredFields();

        for (Field declaredField : declaredFields) {
            if (declaredField.getName().equals("SERIAL_VERSION")) {
                declaredField.setAccessible(true);
                declaredField.set(richCat, 129L);
            }
        }

        System.out.println(richCat);
        System.out.println(PrivateClub.SERIAL_VERSION);
    }
}
