package com.picpay.validationdemo;

import com.picpay.validationdemo.odd.Odd;
import lombok.Getter;

@Getter
public class NumberObject {
    @Odd
    private Integer number;
}
