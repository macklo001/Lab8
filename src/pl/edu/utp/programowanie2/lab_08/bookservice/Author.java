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
    };
    }
