package com.example.demo;

import com.example.jooq.Tables;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    DSLContext dslContext;

    @RequestMapping("/")
    public String index() {
        System.out.println(dslContext.selectFrom(Tables.PERSON).fetch(Tables.PERSON.ID));

        return "Greeting from Spring Boot!";
    }
}
