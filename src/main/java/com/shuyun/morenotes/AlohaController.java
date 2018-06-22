package com.shuyun.morenotes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class AlohaController {

    @RequestMapping("/aloha")
    public String aloha(){
        return "ALOHA";
    }

    @RequestMapping("/aloha1")
    public List<String> aloha1(){
        return Arrays.asList("A", "B");
    }

}
