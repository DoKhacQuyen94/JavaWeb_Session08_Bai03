package org.example.session08_baitap03.controller;

import jakarta.validation.Valid;
import org.example.session08_baitap03.dto.WithdrawRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/transaction")
public class WithdrawController {

    @PostMapping("/withdraw")
    public ResponseEntity<String> requestWithdraw(@Valid @RequestBody WithdrawRequestDto dto) {
        // Nếu qua được lớp Validation, dữ liệu chắc chắn đã hợp lệ
        // Tiến hành gọi Service xử lý nghiệp vụ rút tiền
        return ResponseEntity.ok("Yêu cầu rút " + dto.getWithdrawAmount() + "đ thành công!");
    }
}