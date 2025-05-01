package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class String$ubString {

    public static void main(String[] args) {
        String str = "HelloWorld";
        char Storage [] = new char[str.length()];
        int sub_len = 8;
        char SubString [] = new char[sub_len];
        Storage = str.toCharArray();
        int start = 0;
        List<String> substrings = new ArrayList<>();
//        int end = 10/4;
//        while()
        try{
            for (int i = start; i< str.length()- sub_len;i++)
            {
                int first_val = i;
                int sec_val = i + 1;
                for(int j = 0 ; j < sub_len;j++ ){SubString[j] = Storage[i + j];}

//              System.out.print(c);
                String substring = String.valueOf(SubString);
//                System.out.println(substring);
                substrings.add(substring);

            }

           Collections.sort(substrings);
            for (String sub : substrings){
                System.out.println(sub);
            }
        }
        catch (Exception e) {
//            System.out.println();
            e.getStackTrace();
        }

//        System.out.println(end);
    }
}