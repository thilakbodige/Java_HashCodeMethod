package com.HashCodeMethod;

public class Employee 
{
private String name;
private int age;
private double salary;
public Employee(String name,int age,double salary)
{
this.name=name;
this.age=age;
this.salary=salary;
}
@Override
	public String toString() 
{
		return "Name :"+ name +"\n"+"Age :"+ age +"\n"+"Salary :"+ salary;
	}
}
