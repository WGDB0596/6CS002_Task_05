package com.wlv.task5.example;
import java.util.*;
import java.util.function.Consumer;



public class Experiment06 {
	
	class StringPrintConsumer implements Consumer<String>
	{

public void accept(String str)
{
	
System.out.println(str);
}

	}
public void run() {
	

		String[] n1= {"Science", "Mathematics", "History"};
		
		List<String>n2=Arrays.asList(n1);
		
			n2.forEach(new StringPrintConsumer());
}
public static void main(String[] args){
	new Experiment06().run();
	

		}
	}
	
