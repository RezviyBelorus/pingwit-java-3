package org.example.lec_11.point_1;

public class LegoMain {
    public static void main(String[] args) throws IllegalAccessException {
        Lego lego = new Lego("", 0, " ");

        LegoAnnotationService[] validationServices = new LegoAnnotationService[3];
        validationServices[0] = new QuantityAnnotationValidationService();
        validationServices[1] = new NotEmptyAnnotationValidationService();
        validationServices[2] = new ColorAnnotationValidationService();

        for (LegoAnnotationService validationService : validationServices) {
            LegoValidationResult validate = validationService.validate(lego);

//            if (!validate) {
//                System.out.println("Sorry, smth goes wrong, please contact our support");
//            }
        }
    }
}
