package org.example.lec_11.point_1;

import java.lang.reflect.Field;

public class NotEmptyAnnotationValidationService implements LegoAnnotationService {

    @Override
    public LegoValidationResult validate(Object object) throws IllegalAccessException {

        Field[] declaredFields = object.getClass().getDeclaredFields();

        for (Field declaredField : declaredFields) {
            NotEmpty annotation = declaredField.getAnnotation(NotEmpty.class);

            if (annotation != null) {
                declaredField.setAccessible(true);
                String fieldValue = (String) declaredField.get(object);

                boolean validationResult = fieldValue.length() > 0;
            }
        }

        return null;
    }

}
