package com.training.java8;
//import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b=20;
//		sum(a,b);
//		MyInterface obj = (x, y) -> x+y; //lambda is used to replace method with no name, returns type of interface
//		System.out.println(obj.getSum(30,40));
		MyInterface obj = (x,y) -> x.equalsIgnoreCase(y);
		System.out.println(obj.isSame("Nikits", "Nikitaa"));
		
		Predicate<Integer> obj1 = (x) -> x>0; //one input and boolean return type
		System.out.println(obj1.test(-1));
		
		BiConsumer<String, Integer> obj3 = (x, y) -> System.out.println("Name is: "+x+", age is: "+y);
		obj3.accept("Nikita", 21); //two input value and a void return type
		
	}
//	private static int sum(int x, int y) {
//		return x+y;
//	
// 
	
}
