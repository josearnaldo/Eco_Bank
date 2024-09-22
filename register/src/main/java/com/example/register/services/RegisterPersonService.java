package com.example.register.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.register.config.PasswordConfig;
import com.example.register.model.RegisterPerson;
import com.example.register.repository.RegisterRepository;
import com.example.register.util.ValidateCpf;
import com.example.register.util.ValidateLGPD;
import com.example.register.util.ValidatePolitcs;
import org.springframework.security.crypto.password.PasswordEncoder;


@Service
public class RegisterPersonService {
    @Autowired
    private RegisterRepository repository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public RegisterPerson save(RegisterPerson person){
        if(person.getCpf() == null || !ValidateCpf.isValid(person.getCpf())){
            throw new IllegalArgumentException("Invalid CPF");
        }else if(!ValidateLGPD.LGPDValidate(person.getLgpd())){
            throw new IllegalArgumentException("Invalid: not acceptable contract LGPD");
        }else if(!ValidatePolitcs.isValidPolitics(person.getPolitics())){
            throw new IllegalArgumentException("Invalid: not acceptable contract Politcs");
        }else{
        person.setPassword(passwordEncoder.encode(person.getPassword()));
        return repository.save(person);
        }
    }
}
