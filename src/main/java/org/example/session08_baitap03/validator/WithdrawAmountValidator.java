package org.example.session08_baitap03.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class WithdrawAmountValidator implements ConstraintValidator<ValidWithdrawAmount, Long> {
    @Override
    public boolean isValid(Long value, ConstraintValidatorContext context) {
        if (value == null || value < 0) {
            return false;
        }
        boolean isMinValid = (value >= 50000);
        boolean isMultipleValid = (value % 10000 == 0);

        return isMinValid && isMultipleValid;
    }
}