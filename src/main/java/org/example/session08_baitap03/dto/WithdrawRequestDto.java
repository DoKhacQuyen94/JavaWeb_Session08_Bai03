package org.example.session08_baitap03.dto;

import jakarta.validation.constraints.NotNull;
import org.example.session08_baitap03.validator.ValidWithdrawAmount;

public class WithdrawRequestDto {

    @ValidWithdrawAmount
    private Long withdrawAmount;

    @NotNull(message = "Mã tài khoản ngân hàng không được để trống")
    private String bankAccountId;

    public Long getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(Long withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public String getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(String bankAccountId) {
        this.bankAccountId = bankAccountId;
    }
}