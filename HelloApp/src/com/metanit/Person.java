package com.metanit;

public class Person {
    String name;
    int age;
    int weight;
    Person(){
        this("Max", 18);
    }
    Person(String n, int a, int w){
       name = n;
       age = a;
       weight = w;
    }
    void lol(){

        System.out.println("Name - "+ name + " age "+ age + " weight "+ weight);
    }
    }


