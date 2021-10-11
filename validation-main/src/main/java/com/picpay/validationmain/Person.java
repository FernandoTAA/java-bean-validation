package com.picpay.validationmain;

import javax.validation.constraints.Email;

public class Person {
    private String name;
    @Email
    private String email;

    public Person(final String name, final String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}
