package String;

import java.util.HashSet;
import java.util.Set;

public class Twoarray {

	public static void main(String[] args) {

		int[] a= {10,20,30,40,50,60};
		int[] b= {10,25,30,40,65,70};
	  Set<Integer> setA= new HashSet<Integer>(); 
	  Set<Integer> setB= new HashSet<Integer>(); 
	  {
		  for(int num:a) {
			  setA.add(num);
		  }
		  for(int num:b) {
			  setB.add(num);
		  }
			  
		  Set<Integer> symetric= new HashSet<>(setA); {
			  symetric.addAll(setB);}
		  Set<Integer> retain= new HashSet<>(setA); {
			  retain.retainAll(setB);}
		  symetric.removeAll(retain);
		  System.out.println(symetric);
	}
	}

}
