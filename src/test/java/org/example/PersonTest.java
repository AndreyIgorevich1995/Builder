package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    PersonBuilder personBuilder1 = new PersonBuilder();

    @Test
    void newChildBuilder() throws Exception {
        Person person1 = personBuilder1.setSurname("персона 1").setName("S").setAge(5).setAddress("Samara").build();
        Person person2 = person1.newChildBuilder().setName("персона 2").build();

        String expect = person1.getSurname();
        String result = person2.getSurname();

        String expect1 = person1.getAddress();
        String result1 = person2.getAddress();

        Assertions.assertEquals(expect, result);
        Assertions.assertEquals(expect1, result1);


    }

    @Test
    void happyBirthday() throws Exception {
        Person person1 = personBuilder1.setSurname("персона 1").setName("S").setAge(5).setAddress("Samara").build();
        person1.happyBirthday();
        int result = person1.getAge();
        int expect = 6;
        Assertions.assertEquals(expect, result);
    }

    @Test
    void hasAge() throws Exception {
        Person person1 = personBuilder1.setSurname("персона 1").setName("S").setAge(5).setAddress("Samara").build();
        boolean result = person1.hasAge();
        boolean expect = true;
        Assertions.assertEquals(expect, result);
    }

    @Test
    void hasAddress() throws Exception {
        Person person1 = personBuilder1.setSurname("персона 1").setName("S").setAge(5).build();
        boolean result = person1.hasAddress();
        boolean expect = false;
        Assertions.assertEquals(expect, result);
    }
}