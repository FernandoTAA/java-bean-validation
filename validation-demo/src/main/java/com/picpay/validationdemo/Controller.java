package com.picpay.validationdemo;

import com.picpay.validationdemo.odd.Odd;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Validated
public class Controller {

    @PostMapping("/number")
    public void validateNumber(@Valid  @RequestBody NumberObject numberObject) {
        System.out.println("Executing operation");
    }

    @GetMapping("/number/{number}")
    public void validatePathNumber(@PathVariable @Valid @Odd Integer number) {
        System.out.println("Executing operation");
    }

    @GetMapping("/number/{number1}/number/{number2}")
    @Odd(field1="number1" , field2="number2")
    public void validatePathTwoNumbers(@PathVariable Integer number1, @PathVariable Integer number2) {
        System.out.println("Executing operation");
    }

    @PostMapping("/perido")
    public void validatePeriod(@Valid @RequestBody MyObject myObject) {

    }

}
