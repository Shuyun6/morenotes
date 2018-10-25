package com.shuyun.morenotes;

import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public User getPerson(){
        User user = new User();
        user.setId((long) 101);
        user.setName("shuyun");
        return user;
    }

    @GetMapping(value = "/getUserByName")
    public User getPerson(@RequestParam(value = "name") String name){
        //url should be like: "http://127.0.0.1:8080/api/getUserByName?name=shuyun"
        User user = new User();
        user.setName(name);
        return user;
    }

    @RequestMapping(value = "/getUserByDesc/{desc}", method = RequestMethod.GET)
    public User getPersonByTitle(@PathVariable(value = "desc") String des){
        //url should be like: "http://127.0.0.1:8080/api/getUserByTitle/master"
        //the param is master
        User user = new User();
        user.setDescription(des);
        return user;
    }

    @RequestMapping(value = "/getUserById", method = RequestMethod.POST)
    public User getPersonById(Long id){
        //url in post request like: http://127.0.0.1:8080/api/getUserById?id=123
        //or use postmen to send post body
        User user = new User();
        user.setId(id);
        return user;
    }

    @RequestMapping(value = "/getUserByBody", method = RequestMethod.POST)
    public User getPersonByPerson(@RequestBody User person){
        //just send a json body via application/json media type
        return person;
    }


}
