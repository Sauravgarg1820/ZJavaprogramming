package Array;

public class SumOfThreeBigest {

	public static void main(String[] args) {
		int temp;
     int[]a= {1,2,3,4,5,6}; 
     for(int i=0; i<a.length;i++) {
    	 for(int j=i+1;j<a.length;j++) {
    		 if(a[i]<a[j]) {
    		 temp=a[i];
    		 a[i]=a[j];
    		 a[j]=temp;
    		 }
 
    	 }
     }
     System.out.println(a[0]+a[1]+a[2]);
     for(int i=0;i<a.length;i++) {
    	 System.out.print(a[i]+",");
     }
	}

}
