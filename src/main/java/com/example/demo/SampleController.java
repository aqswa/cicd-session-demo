package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/samples")
@RequiredArgsConstructor
public class SampleController {

    @GetMapping
    @ResponseStatus(value = HttpStatus.OK)
    public String create() {
        return "sample";
    }
}
