package com.example.register.model;

import java.io.Serializable;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public class RegisterPersonDTO implements Serializable {

    @NotEmpty(message = "id cannot be empty")
    private Long id;

    @NotEmpty(message = "name cannot be empty")
    private String name;

    @NotEmpty(message = "cpf cannot be empty")
    private String cpf;

    @NotEmpty(message = "rg cannot be empty")
    private String rg;

    @NotEmpty(message = "name Mother cannot be empty")
    private String nameMother;

    @NotEmpty(message = "date of birth cannot be empty")
    private String datebirth;

    @NotEmpty(message = "Nacionality cannot be empty")
    private String nacionality;

    @NotEmpty(message = "Address cannot be empty")
    private String address;

    @NotEmpty(message = "cellphone cannot be empty")
    private String cellPhone;

    @Email(message = "Email should be valid")
    @NotEmpty(message = "email name cannot be empty")
    private String email;

    @NotEmpty(message = "password cannot be empty")
    private String password;

    @NotEmpty(message = "politics cannot be empty")
    private String politics;

    @NotEmpty(message = "Not empty Estado")
    private String estado;

    @NotEmpty(message = "Not empty City")
    private String city;

    @NotEmpty(message = "Not empty Number")
    private String number;

    @NotEmpty(message = "LGPD cannot be empty")
    private String lgpd;

    @NotEmpty(message = "State Emissor the rg be empty")
    private String emissorRg;

    @NotEmpty(message = "Date emissor the rg be empty")
    private String dateEmissorRG;

    public RegisterPersonDTO() {

    }

    public RegisterPersonDTO(RegisterPerson registerPerson) {
        this.id = registerPerson.getId();
        this.name = registerPerson.getName();
        this.cpf = registerPerson.getCpf();
        this.rg = registerPerson.getRg();
        this.nameMother = registerPerson.getNameMother();
        this.datebirth = registerPerson.getDatebirth();
        this.nacionality = registerPerson.getNacionality();
        this.address = registerPerson.getAddress();
        this.cellPhone = registerPerson.getCellPhone();
        this.email = registerPerson.getEmail();
        this.password = registerPerson.getPassword();
        this.politics = registerPerson.getPolitics();
        this.estado = registerPerson.getEstado();
        this.city = registerPerson.getCity();
        this.number = registerPerson.getNumber();
        this.lgpd = registerPerson.getLgpd();
        this.emissorRg = registerPerson.getEmissorRg();
        this.dateEmissorRG = registerPerson.getDateEmissorRG();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNameMother() {
        return nameMother;
    }

    public void setNameMother(String nameMother) {
        this.nameMother = nameMother;
    }

    public String getDatebirth() {
        return datebirth;
    }

    public void setDatebirth(String datebirth) {
        this.datebirth = datebirth;
    }

    public String getNacionality() {
        return nacionality;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPolitics() {
        return politics;
    }

    public void setPolitics(String politics) {
        this.politics = politics;
    }

    public String getLgpd() {
        return lgpd;
    }

    public void setLgpd(String lgpd) {
        this.lgpd = lgpd;
    }

    public String getEmissorRg() {
        return emissorRg;
    }

    public void setEmissorRG(String emissorRg) {
        this.emissorRg = emissorRg;
    }

    public String getDateEmissorRG() {
        return dateEmissorRG;
    }

    public void setDateEmissorRG(String dateEmissorRg) {
        this.dateEmissorRG = dateEmissorRg;
    }

}
