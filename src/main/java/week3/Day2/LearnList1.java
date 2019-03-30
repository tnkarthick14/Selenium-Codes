package week3.Day2;

import java.util.ArrayList;

import java.util.List;


public class LearnList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>();
		names.add("Prema");
		names.add("Karthick");
		names.add("Kamesh");
		names.add("Monisha");
		names.add("Maha");
		names.add("Sasi");
		names.add("Ravi");
		names.add("Manivel");
		names.add("Jaya");
		names.add("Janaki");
		names.add("Sneha");
		names.add("Kannan");
		names.add("Hari");
		names.add("Anbu");
		
		for ( int i=0;i<=4;i++) {
			int n=0;
			names.remove(n);
		}

		System.out.println(names);
		
		/*System.out.println("The Employee List : " + names);
		System.out.println("Removing only the first entry : " + names.get(0));
		String remove1 = names.remove(0);
		System.out.println(remove1 + " is removed ");

		System.out.println("Checking in List " + " \n" + names);
*/



	}

}
