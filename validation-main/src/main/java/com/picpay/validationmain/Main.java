package com.picpay.validationmain;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("João", "joao@uol.com.br");
        Person person2 = new Person("Maria", null);
        Person person3 = new Person("José", "111111");

        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();

        Set<ConstraintViolation<Person>> violations1 = validator.validate(person1);
        Set<ConstraintViolation<Person>> violations2 = validator.validate(person2);
        Set<ConstraintViolation<Person>> violations3 = validator.validate(person3);

        System.out.println("Person 1 " + violations1);
        System.out.println("Person 2 " + violations2);
        System.out.println("Person 3 " + violations3);
    }
}
