package com.ibrahim.springboot.mvc.validationdemo.model;

import jakarta.validation.constraints.*;

public class Customer {


    @NotNull(message = "is required")
    @Size(min=2, message = "At least 2 character needed")
    private String firstName = "" ;
    private String lastName;

    @NotNull(message = "is required")
    @Min(value =  18, message =  "must be >= 18")
    @Max(value =  40, message =  "must be <= 35")
    private int ageLimit;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Enter 5 chars/digits")
    private String postalCode;

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

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
