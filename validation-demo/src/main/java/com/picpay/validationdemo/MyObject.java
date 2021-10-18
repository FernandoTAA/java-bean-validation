package com.picpay.validationdemo;

import com.picpay.validationdemo.period.ValidPeriod;
import lombok.Getter;

@Getter
public class MyObject {

    private String name;

    @ValidPeriod
    private Period period;
}
