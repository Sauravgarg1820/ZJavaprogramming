package Pattern;

public class T2 {

	public static void main(String[] args) {
		int rowNum=4;
		int colNum=4;
		for(int i=1; i<=rowNum; i++) {
			for(int j=1;j<=colNum; j++) {
				if(i<=j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
		System.out.println();
		}
	}

}
