package String;

class Occurence{
    public static void main(String[] args){
        String s="Saurav garg";
        int[] a= new int[256];
        for(int i=0; i<s.length(); i++) {
        a[s.charAt(i)]++;
        }
        for(int i=0; i<a.length; i++){
            if(a[i]==1 && i!=32)
                System.out.println((char)i+" is "+a[i]+" Times ");
            }
        }
    }
