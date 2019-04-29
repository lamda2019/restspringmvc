package com.wsc.controller;

import com.wsc.pojo.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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


    @PostMapping(value = "/person/json/to/properties", produces = "application/properties+person")// Accept响应类型
    public Person personJsonToProperties(@RequestBody Person person) {
        // @RequestBody 的内容是 JSON
        // 响应的内容是 Properties
        return person;
    }

    @PostMapping(value = "/person/properties/to/json",
            consumes = "application/properties+person",// consumes 请求类型 // Content-Type
            produces =  MediaType.APPLICATION_JSON_UTF8_VALUE// produces响应类型 // Accept
    )

    public Person personPropertiesToJson(@RequestBody Person person) {
        // @RequestBody 的内容是 Properties
        // 响应的内容是 JSON
        return person;
    }

}