package com.example.interceptor_middleware2.controllers;

import com.example.interceptor_middleware2.entities.Month;
import org.springframework.web.bind.annotation.*;

import static com.example.interceptor_middleware2.interceptors.MonthInterceptor.months;

@RestController
@RequestMapping("/months")
public class MonthController {

    @GetMapping
    public Month getMonth(@RequestAttribute Month month){
        return month;
    }
}
