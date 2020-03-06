package com.example.formspring;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonForm {
    @NotNull
    @Size(min = 2,max = 30)
    private String name = "vanessa";
    @NotNull
    @Min(18)
    private Integer age;
    private String nameError = "Please";
    private String ageError = "You are under age";

    public String getNameError() {
        return nameError;
    }

    public void setNameError(String nameError) {
        this.nameError = nameError;
    }

    public String getAgeError() {
        return ageError;
    }

    public void setAgeError(String ageError) {
        this.ageError = ageError;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public String toString() {
        return "Person(Name: " + this.name + ", Age: " + this.age + ")";
    }
    public String nameError() {
        return "Please enter valid name!";
    }
}
