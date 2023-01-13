package com.codewithmosh;

public class Employee{
    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary){
        this(baseSalary,0);


    }

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }
    public int calculateWage(int extraHour){
        return baseSalary + (extraHour * hourlyRate);
    }

    public int calculateWage(){
        return calculateWage(0);
    }


    private void setBaseSalary(int baseSalary){
       if (baseSalary <= 0)
           throw new  IllegalArgumentException("baseSalary Cannot Be 0 Or Less.");
       this.baseSalary = baseSalary;
    }
    private void setHourlyRate(int hourlyRate){
        if (hourlyRate < 0)
              throw  new IllegalArgumentException("hourly Rate Cannot Be 0 Or Less.");
        this.hourlyRate =hourlyRate;
    }

    private int getBaseSalary(){
        return baseSalary;
    }
    private int getHourlyRate(){
        return hourlyRate;
    }

}
