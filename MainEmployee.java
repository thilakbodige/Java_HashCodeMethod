package com.HashCodeMethod;

public class MainEmployee 
{
public static void main(String[] args) 
{
Employee e1=new Employee("Thilak",28,120000);
Employee e2=new Employee("Sai Ram",25,5000000);
Employee e3=new Employee("Akhila",50,8000000);
System.out.println(e1);
System.out.println(e2);
System.out.println(e3);
System.out.println(e1.hashCode());
System.out.println(e2.hashCode());
System.out.println(e3.hashCode());

	}

}
