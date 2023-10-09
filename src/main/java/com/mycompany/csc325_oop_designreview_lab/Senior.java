package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student{
    private int credits;
    // Constructor for Senior

    public Senior(String name, short age, int credits) {
        super(name,age, credits);
        // ToDo 8: The senior class should have a minimum of 85 credits
        if (credits >= 85) {
            this.credits = credits;
        } else {
            // Case where seniors do not have enough credits
            System.out.println("Error: Senior must have a minimum of 85 credits.");
        }
    }

    @Override
    public String toString() {
        return "Senior{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", credits=" + credits +
                ", gpa=" + getGpa() +
                '}';
    }
}
