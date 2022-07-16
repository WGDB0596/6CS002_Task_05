package com.wlv.task5.novel;

import java.io.BufferedReader;
import java.io.FileReader;

public class novel_File06 {

	public static void main(String[] args) throws Exception 
	{
	BufferedReader r = new BufferedReader(new FileReader("data/Hell fer Sartain.txt"));
	
	System.out.println(r.lines().reduce("",String::concat));
	r.close(); 
	
	}
}