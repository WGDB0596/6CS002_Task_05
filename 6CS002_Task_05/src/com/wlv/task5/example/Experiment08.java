package com.wlv.task5.example;
import java.util.Arrays;
import java.util.List;

public class Experiment08 {
	public void run()	{
		String[] n1= {"Science", "Mathematics", "History"};
		List<String>n2=Arrays.asList(n1);
		
		System.out.println("Serial name\n---------");
		n2.stream().forEach(subject -> System.out.println(subject));
		
		System.out.println("nParallel name\n---------");
		n2.parallelStream().forEach(subject -> System.out.println(subject));
		
	}
	public static void main(String[] args) {
		new Experiment08().run();
	}
}
