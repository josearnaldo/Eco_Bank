package com.example.register.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.register.model.RegisterPerson;
import com.example.register.repository.RegisterRepository;
import com.example.register.services.RegisterPersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    private RegisterPersonService registerPersonService;



    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody RegisterPerson register) {
        //TODO: process POST request
        try{
            RegisterPerson savedPerson = registerPersonService.save(register);
            return new ResponseEntity<String>("Register created successfully", HttpStatus.CREATED);
        }catch(Exception e){ 
            e.printStackTrace();
            return new ResponseEntity<String>("Error:Not register", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
     
    }
    

}
