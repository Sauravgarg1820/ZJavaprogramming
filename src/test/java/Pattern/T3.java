package Pattern;

public class T3 {

	public static void main(String[] args) {
   int rowNum=20;
   int colNum=20;
   for (int i=1; i<=rowNum; i++) {
	   for(int j=1; j<=colNum; j++) {
		   if(i+j>=21) {
			   System.out.print("* ");
		   }
		   else {
			   System.out.print(" ");
		   }
	   }
	   System.out.println();
   }
	}

}
