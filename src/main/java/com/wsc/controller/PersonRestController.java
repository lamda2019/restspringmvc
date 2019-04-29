package com.wsc.controller;

import com.wsc.pojo.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonRestController {
      /*
      * http://localhost:8080/person/1?name=袅袅炊烟
      * */
    @GetMapping("/person/{id}")
    public Person person(@PathVariable Long id, @RequestParam(required = false) String name){
        Person per=new Person();
        per.setId(id);
        per.setName(name);
        return per;
    }
}