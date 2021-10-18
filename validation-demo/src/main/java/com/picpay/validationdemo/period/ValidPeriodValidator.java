package com.picpay.validationdemo.period;

import com.picpay.validationdemo.MeuBeanService;
import com.picpay.validationdemo.Period;
import lombok.RequiredArgsConstructor;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

@RequiredArgsConstructor
public class ValidPeriodValidator implements ConstraintValidator<ValidPeriod, Period> {

    private final MeuBeanService meuBeanService;

    @Override
    public void initialize(final ValidPeriod constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(final Period value, final ConstraintValidatorContext context) {
        meuBeanService.execute();
        if (Objects.isNull(value) || Objects.isNull(value.getInitialDate()) || Objects.isNull(value.getFinalDate())) {
            return false;
        }
        return value.getInitialDate().isBefore(value.getFinalDate());
    }

}
