package com.wlv.task5.example;
import java.util.*;


public class Experiment05 {
	
	public static void main(String[] args) {
		
		String[] n1= {"Kevan", "John", "Matthew"};
		
		List<String>n2=Arrays.asList(n1);
		
			n2.forEach(subject -> System.out.println(subject));
		}
	}
	
