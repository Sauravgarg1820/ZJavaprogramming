package String;

public class Swapfirstandlast {

	public static void main(String[] args) {
		String temp;
		String s= "Welcome To The Tekpyramid";
		String[] k = s.split(" ");
		temp=k[0];
		k[0]=k[k.length-1];
		k[k.length-1]=temp;
		for(String a:k) {
			System.out.print(a+" ");
		}
		
	}
}

