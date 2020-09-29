package org.example;

public class SimpleBot {
    private final String botName;
    private final int birthYear;

    SimpleBot(String botName, int birthYear){
        this.birthYear = birthYear;
        this.botName = botName;
    }

    public String getBotName(){
        return this.botName;
    }

    public int getBirthYear(){
        return this.birthYear;
    }
    public void print(){
        System.out.println("Hello! My name is " + getBotName() + " .");
        System.out.println("I was created in " + getBirthYear() + " .");
    }
}