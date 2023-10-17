package com.training.java8;

@FunctionalInterface
public interface MyInterface {
//	public int getSum(int a, int b);
	public boolean isSame(String s1, String s2);
	
//	public void display();  //can have only one ab method
}

//functional interface - where only one abstract method.

//lambda - used only in functional interface
//advantage - 
//use annotation to force compiler to make the interface as functional interface.