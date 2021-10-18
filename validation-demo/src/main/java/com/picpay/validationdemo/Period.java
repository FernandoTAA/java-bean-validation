package com.picpay.validationdemo;

import com.picpay.validationdemo.period.ValidPeriod;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Period {

    private LocalDate initialDate;

    private LocalDate finalDate;
}
