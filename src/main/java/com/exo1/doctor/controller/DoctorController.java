package com.exo1.doctor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/1")
    @ResponseBody
    public String indexW() {
        return "William Hartnell";
    }

    @GetMapping("/doctor/10")
    @ResponseBody
    public String indexD() {
        return "David Tennant";
    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String indexJ() {
        return "Jodie Whittaker";
    }
}
