//package com.example.ch2labs.labs04;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//@ResponseBody
//public class RpsController {
//
//    @GetMapping("/rps")
//    public String rps(@RequestParam String user) {
//        int random = (int) (Math.random() * 3); // 0,1,2
//
//        String server = "";
//
//        if (random == 0) {
//            server = "scissors";
//        } else if (random == 1) {
//            server = "rock";
//        } else if (random == 2) {
//            server = "paper";
//        }
//    }
//
//}
