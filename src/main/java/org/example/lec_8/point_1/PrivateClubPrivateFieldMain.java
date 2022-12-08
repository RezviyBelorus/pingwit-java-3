package org.example.lec_8.point_1;

import java.lang.reflect.Field;

public class PrivateClubPrivateFieldMain {
    public static void main(String[] args) throws Exception {
        PrivateClub richCat = new PrivateClub();

        System.out.println(richCat);

        Class<PrivateClub> privateClubClass = PrivateClub.class;

        Field[] declaredFields = privateClubClass.getDeclaredFields();

        for (Field declaredField : declaredFields) {
            if (declaredField.getName().equals("clubName")) {
                declaredField.setAccessible(true);
                declaredField.set(richCat, "Rich Doc");
            }
        }

        System.out.println(richCat);

        Field clubName = privateClubClass.getDeclaredField("clubName");
        clubName.setAccessible(true);
        clubName.set(richCat, "Dinamo Doc");

        System.out.println(richCat);
    }
}
