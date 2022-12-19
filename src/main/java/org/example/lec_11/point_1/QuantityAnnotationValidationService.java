package org.example.lec_11.point_1;

import java.lang.reflect.Field;

public class QuantityAnnotationValidationService implements LegoAnnotationService {

    @Override
    public LegoValidationResult validate(Object object) throws IllegalAccessException {

        Field[] declaredFields = object.getClass().getDeclaredFields();

        for (Field declaredField : declaredFields) {
            Quantity annotation = declaredField.getAnnotation(Quantity.class);

            if (annotation != null) {
                int min = annotation.min();
                int max = annotation.max();

                declaredField.setAccessible(true);
                Object fieldValue = declaredField.get(object);

                if (fieldValue instanceof Integer) {

                    Integer integerFieldValue = (Integer) fieldValue;

                    boolean validationResult = integerFieldValue > min && integerFieldValue < max;
                }
            }
        }

        return null;
    }

}
