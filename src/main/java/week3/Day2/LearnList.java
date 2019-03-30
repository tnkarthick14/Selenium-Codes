package week3.Day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>();
		names.add("Karthick");
		names.add("Kamesh");
		names.add("Prema");
		names.add("Monisha");
		names.add("Maha");
		names.add("Prema");
		names.add("Ravi");
		
		System.out.println("The Employee List : " + names);
		
		//Adding all the values from List names to set Newnames will remove the duplicate entries : 
		Set<String> NewNames = new LinkedHashSet<>();
		NewNames.addAll(names);
		System.out.println("The Updated Employee Names : " + NewNames);
		
			
			
			
			
			
		}

	}

