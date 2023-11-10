package com.ibrahim.springboot.mvc.validationdemo.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {


    @NotNull(message = "is required")
    @Size(min=1, message = "Atleast 1 character needed")
    private String firstName = "" ;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
