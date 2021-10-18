package com.picpay.validationdemo.period;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidPeriodValidator.class)
public @interface ValidPeriod {
    String message() default "Invalid com.picpay.validationdemo.period";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
