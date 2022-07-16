package com.wlv.task5.novel;

import java.io.BufferedReader;
import java.io.FileReader;

public class novel_File02 {

	public static void main(String[] args) throws Exception 
	{
	BufferedReader r = new BufferedReader(new FileReader("data/Hell fer Sartain.txt"));
	
	//r.lines().forEach(l -> System.out.println(l));   
	
	System.out.println(" Line Count of the \" Hell fer Sartain Novel \" File :  "+ r.lines().count());
	r.close();
	}
}
