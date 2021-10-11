package com.picpay.validationdemo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class Controller {

    @PostMapping("/number")
    public void validateNumber(@Valid  @RequestBody NumberObject numberObject) {
        System.out.println("Executing operation");
    }


}
