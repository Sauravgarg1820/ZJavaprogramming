package String;

public class reversebutspaceremain {
    public static void main(String[] args) {
        String s = "Saurav Kumar Garg";
        String s1 = s.replace(" ", "");
        String result = "";
        int last = s1.length() - 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                result = result + s.charAt(i);
            } else {
                result = result + s1.charAt(last);
                last--;
            }
        }
        System.out.println(result);
    }
    }

