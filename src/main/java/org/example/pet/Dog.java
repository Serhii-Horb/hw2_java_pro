package org.example.pet;public class Dog extends Pet {    private double biteForce;    public Dog() {    }    public Dog(String name, int age, double weight) {        super(name, age, weight);    }    public void bark() {        System.out.println("Гав-гав!");    }    public void bite() {        System.out.println("Кусает с силой " + biteForce + " килограм!");    }}