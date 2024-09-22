package com.example.register.repository;

import com.example.register.model.RegisterPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepository extends JpaRepository<RegisterPerson, Long> {
}
