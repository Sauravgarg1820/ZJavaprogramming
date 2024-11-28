package String;

public class Reversestring {

	public static void main(String[] args) {
		String s= "Welcome to the tp office";
		String[] st = s.split(" ");

		for (int i = st.length - 1; i >= 0; i--) {
			System.out.print(st[i] + " ");
		}

	}}
