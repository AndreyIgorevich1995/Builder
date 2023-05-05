package org.example;


public class Person {
    private final String name;
    private final String surname;
    private int age;
    private String address;

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        if (getAge() == 0)
            return false;
        return true;
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
        }
    }
    public boolean hasAddress(){
        if (address == null)
            return false;
        return true;
    }

    public PersonBuilder newChildBuilder() throws Exception{
        PersonBuilder child = new PersonBuilder();
        return child.setSurname(this.surname).setAddress(this.address).setAge(0);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
