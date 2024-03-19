package org.example;

public class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private char englishLevel;
    private double salary;

    public Tester(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public Tester(String name, String surname, int expirienceInYears, char englishLevel) {
        this(name, surname);
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
    }
    public Tester(String name, String surname, int expirienceInYears, char englishLevel, double salary) {
        this(name, surname, expirienceInYears, englishLevel);
        this.salary = salary;
    }

    public void say(String something) {
        System.out.println("I like String class!");
        System.out.println(something);
    }
    public void say(int something) {
        System.out.println("I like int type!");
        System.out.println(something);
    }
    public void say(char something) {
        System.out.println("I like char type!");
        System.out.println(something);
    }

    public static double getTestersSalary(Tester tester) {
        return tester.salary;
    }
}
