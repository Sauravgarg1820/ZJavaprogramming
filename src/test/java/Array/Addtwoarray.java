package Array;

import java.util.Arrays;

public class Addtwoarray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b= {6,7,8,9,10,11};
		int[] result= new int[b.length];
		for(int i=0; i<result.length; i++) {
			if(i<a.length) {
				result[i]=result[i]+a[i];
			}
		
				if(i<b.length) {
					result[i]=result[i]+b[i];
				}
			}
		for (int i=0; i<result.length; i++) {
			System.out.print(result[i]);
		}
		//System.out.println(Arrays.toString(result));
			
		}
		
	}


