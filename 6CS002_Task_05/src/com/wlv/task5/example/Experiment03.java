package com.wlv.task5.example;
import java.util.Arrays;
import java.util.List;
public class Experiment03 {
	
	public static void main(String[] args) {
		String[] n1= {"Science", "Mathematics", "History"};
		
		List<String>n2=Arrays.asList(n1);
		
			System.out.println(((Object) n2).getClass());
			for(String subject:n2) {
				System.out.println(subject);
		}
	}
	}
/*
	In this code the arry is converted to a List so that 
	advantages of the Collection API  used 
*/

