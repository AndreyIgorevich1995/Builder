package org.example;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) throws Exception {
        if(age<0){
            throw  new IllegalArgumentException("некорректный возраст");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() throws Exception {
        if (name == null || surname == null) {
            throw new IllegalStateException("Имя или фамилия не введены");
        }
        return new Person(name, surname, age, address);
    }
}
