package org.example.session08_baitap03.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = WithdrawAmountValidator.class)
@Documented
public @interface ValidWithdrawAmount {
    String message() default "Số tiền rút phải từ 50,000đ và là bội số của 10,000đ";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}