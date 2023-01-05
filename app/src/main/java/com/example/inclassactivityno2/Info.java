package com.example.inclassactivityno2;

public class Info {

    private String name ;
    private String salary ;
    private String time ;

    public String getName() {
        return name;
    }

    public String getSalary() {
        return salary;
    }

    public String getTime() {
        return time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Info(String name, String salary, String time) {
        this.name = name;
        this.salary = salary;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Info{" +
                "name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
