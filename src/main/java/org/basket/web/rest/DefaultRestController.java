package org.basket.web.rest;

import org.basket.model.School;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultRestController {


    @RequestMapping(value = "/school", method= RequestMethod.GET)
    public School getSchool(@RequestParam(value = "name", defaultValue = "The Best") String name) {
        return new School(
                "High lvl",
                "Odessa",
                name
        );
    }
}
