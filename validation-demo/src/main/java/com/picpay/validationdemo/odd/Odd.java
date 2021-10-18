package com.picpay.validationdemo.odd;

import javax.validation.Constraint;
import javax.validation.ConstraintTarget;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {OddValidator.class, OddMethodValidator.class})
public @interface Odd {
    String message() default "Invalid odd number";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    String field1() default "";

    String field2() default "";

    ConstraintTarget validationAppliesTo() default ConstraintTarget.IMPLICIT;

}
