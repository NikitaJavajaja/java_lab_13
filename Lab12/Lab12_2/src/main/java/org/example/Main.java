package org.example;

public class Main {
    public static void main(String[] args) {
        Tester tester = new Tester("Бобик", "Бибас", 1000, 'C', 50000);
        System.out.println(Tester.getTestersSalary(tester));
    }
}