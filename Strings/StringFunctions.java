package Strings;

public class StringFunctions {
    public  String Captalize(String str){
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }
    public void StringQ1(){
        String str1 = "hello";
        String str2 = "world";
        StringFunctions obj = new StringFunctions();
        String keyword = obj.Captalize("hello");
        System.out.println(keyword);
        System.out.println(str1.length() + str2.length());
        if(str1.compareTo(str2) > 0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.println(obj.Captalize(str1)+obj.Captalize(str2));
    }
    public String Indexing(String str, int start,int end){
//                char s1[] = str.toCharArray();
               char [] store = str.toCharArray();
               char [] Storage = new char[end - start];
               for (int i = start ; i < end ;i++){
                   Storage [i - start] = store[i];
               }
              String string = String.valueOf(Storage);
               return string;
               //  InMain Class      System.out.println("Hello World");
//  InMain Class      Strings.StringFunctions obj = new Strings.StringFunctions();
//  InMain Class      String str = obj.Indexing("HelloWorld",2,5);
//  InMain Class      System.out.println(str);
//  OutPut :      llo
    }
    public static void main(String[] args) {


    }
}
