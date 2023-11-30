package ru.itgirls.firstspringbootproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itgirls.firstspringbootproject.Days;

@RestController
@RequestMapping
public class FirstController {

    @GetMapping("/getDay")
    public String getDay(@RequestParam(value = "days") Days days) {
        return String.format("Сегодня %s!", days.getDAY_OF_WEEK());
    }
}
