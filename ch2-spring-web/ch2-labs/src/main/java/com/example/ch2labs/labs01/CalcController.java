package com.example.ch2labs.labs01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    @GetMapping("/api/v1/calc")
    public CalculatorResponse resultTwoNumbers(CalculatorRequest request) {
        return new CalcController(request);
    }

}
