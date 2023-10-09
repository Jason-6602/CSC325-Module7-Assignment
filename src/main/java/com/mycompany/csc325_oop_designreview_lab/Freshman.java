package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student {
    private int credits;

    // ToDo 10: Add a toString method for the Freshman class (done)
    @Override
    public String toString() {
        return "Freshman{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", credits=" + credits +
                '}';
    }

    // Constructor
    public Freshman(String name, short age, int credits) {
        super(name,age,credits);
        this.credits = credits;
    }
}








