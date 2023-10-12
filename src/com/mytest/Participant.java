package com.mytest;

import java.util.List;

public class Participant {
    private String name;
    private String surname;
    private int age;
    private String sportType;
    private List<String> awards;

    public Participant(String name, String surname, int age, String sportType, List<String> awards) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sportType = sportType;
        this.awards = awards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    public List<String> getAwards() {
        return awards;
    }

    public void setAwards(List<String> awards) {
        this.awards = awards;
    }


}
