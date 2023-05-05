package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        PersonBuilder personBuilder = new PersonBuilder();
        Person person = personBuilder.setSurname("персона 1").setName("S").setAge(5).setAddress("Samara").build();
        System.out.println(person);
        person.happyBirthday();
        System.out.println(person);

        Person x = person.newChildBuilder().setName("персона 2").build();

        System.out.println("У " + person + " есть ребенок, " + x);
    }
}