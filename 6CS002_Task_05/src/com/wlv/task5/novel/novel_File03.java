package com.wlv.task5.novel;

import java.io.BufferedReader;
import java.io.FileReader;

public class novel_File03 {

	public static void main(String[] args) throws Exception 
	{
	BufferedReader r = new BufferedReader(new FileReader("data/Hell fer Sartain.txt"));
	r.lines().filter(l->l.contains("Rich")).forEach(l->System.out.println(l));
	r.close(); 
	
	}
}