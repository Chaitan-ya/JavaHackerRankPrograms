package Strings;

public class palindrome {

    public static void main(String[] args) {
        String str = "java";
        String lower = str.toLowerCase();
        Boolean palindrome = true ;
        char str1[] = lower.toCharArray();
        int start = 0;
        int last = str.length()-1;
        while(start < last){
            if(str1[start] != str1[last]){
                palindrome = false;
            }
            start++;
            last--;
        }
        if(palindrome ){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}
