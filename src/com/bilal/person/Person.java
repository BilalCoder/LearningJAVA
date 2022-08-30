package com.bilal.person;

public class Person {

    private String firstName, lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastNameName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = (age < 0 || age > 100) ? 0 : age;
    }

    public boolean isTeen () {
        return (this.age > 12 && this.age < 20) ? true : false;
    }

    public String getFullName() {
        return ((this.firstName.isEmpty() ? (this.lastName.isEmpty() ? "" : this.lastName) : (this.lastName.isEmpty() ? this.firstName : this.firstName + " " + this.lastName)));
    }
}
