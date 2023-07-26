package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
@RequiredArgsConstructor
public class SampleController {

    @GetMapping("/samples1")
    @ResponseStatus(value = HttpStatus.OK)
    public String create() {
        return "samples";
    }

    @GetMapping("/samples2")
    @ResponseStatus(value = HttpStatus.OK)
    public String create2() {
        return "samples";
    }
}
