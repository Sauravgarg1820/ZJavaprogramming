package String;

public class EvenStringUpper {

	public static void main(String[] args) {
		String s= "daimler";
		String result = "";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(i%2==0) {
				result=result+Character.toUpperCase(ch);
			}
			else {
				result= result+Character.toLowerCase(ch);
				}
		}
	System.out.println(result);
	}

}
