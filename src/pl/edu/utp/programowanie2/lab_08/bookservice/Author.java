package pl.edu.utp.programowanie2.lab_08.bookservice;

import java.util.Objects;

public class Author {

    private String name;
    private String surname;
    private Sex sex;

    public Author(String name, String surname,Sex sex){

        this.name = name;
        this.surname = surname;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Sex getSex() {
        return sex;
    }

    public enum Sex {
            MALE, FEMALE
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return name.equals(author.name) && surname.equals(author.surname) && sex == author.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, sex);
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex=" + sex +
                '}';
    }
}
