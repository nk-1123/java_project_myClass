package com.training.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(10,20,30,40);
		
//		Stream<Integer> numStreams = numbers.stream();
//		numStreams.filter(x-> x>15).map(n->n*n).forEach(t->System.out.println(t)); //forEach is a terminal function
		//another way to write it even shorter
//		numbers.stream().filter(x-> x>15).map(n->n*n).forEach(t->System.out.println(t)); //forEach is a terminal function

//		List<String> names = Arrays.asList("Nikits","amisha","tanya","sanskriti","shavi","Sahil");
		
//		Stream<String> nameStream = names.stream();
//		nameStream.filter(x -> x.charAt(0) == 's' || x.charAt(0)=='S' ).map(n -> n.concat(" Amdocs")).sorted().forEach(t->System.out.println(t));
	
		ArrayList<Product> products = new ArrayList<>();
//		ArrayList<Product> newList = new ArrayList<>();

		products.add(new Product(105, "badminton", "toys", 2000));
		products.add(new Product(102, "hockey", "sports", 200));
		products.add(new Product(103, "lego", "toys", 800));
		products.add(new Product(103, "lego", "toys", 800));
		products.add(new Product(104, "table tennis", "toys", 1000));
		products.add(new Product(105, "ball", "toys", 300));
		
		Stream<Product> prod = products.stream();
		List<Product> newList = prod.filter(x-> x.getPrice()>500 && x.getProdCategory()=="toys").collect(Collectors.toList());
		newList.stream().distinct().forEach(t->System.out.println(t));
	}

}
