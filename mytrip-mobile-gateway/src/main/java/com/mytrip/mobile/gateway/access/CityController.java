package com.mytrip.mobile.gateway.access;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    @RequestMapping(path = "/city/capital")
    public List<String> capital() {
        return Arrays.asList("Chennai", "Mumbai", "Delhi", "Kolkatta");
    }
}
