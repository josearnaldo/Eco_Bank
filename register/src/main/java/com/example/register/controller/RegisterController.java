package com.example.register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.register.model.RegisterPerson;
import com.example.register.model.RegisterPersonDTO;
import com.example.register.services.RegisterPersonService;

@RestController
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    private RegisterPersonService registerPersonService;

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody RegisterPersonDTO register) {
        // TODO: process POST request
        try {
            RegisterPerson savedPerson = fromDTO(register);
            registerPersonService.save(savedPerson);
            return new ResponseEntity<String>("Register created successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<String>("Error:Not register", HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    private RegisterPerson fromDTO(RegisterPersonDTO objDto) {
        return new RegisterPerson(
                objDto.getId(),
                objDto.getName(),
                objDto.getCpf(),
                objDto.getRg(),
                objDto.getNameMother(),
                objDto.getDatebirth(),
                objDto.getNacionality(),
                objDto.getAddress(),
                objDto.getCellPhone(),
                objDto.getEmail(),
                objDto.getPassword(),
                objDto.getPolitics(),
                objDto.getEstado(),
                objDto.getCity(),
                objDto.getNumber(),
                objDto.getLgpd(),
                objDto.getEmissorRg(),
                objDto.getDateEmissorRG());
    }

}
