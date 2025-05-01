package Strings;

public class Anagrams {
    Boolean isAnnagram(String a , String b){
        String first = a.toLowerCase();
        String second = b.toLowerCase();
        char firstArray[] = first.toCharArray();
        char secondArray[] = second.toCharArray();

        int freq1[] = new int [26];
        int freq2[] = new int[26];
        for (int i = 0; i < firstArray.length;i++){
                freq1[firstArray[i] -'a']++;
        }
        for (int i = 0; i < secondArray.length;i++){
            freq2[secondArray[i]-'a']++;
        }
        for (int i = 0; i < freq1.length; i++){
            if (freq1[i] != freq2[i]){
                return  false;
            }
        }

        return true;

    }
    public static void main(String[] args) {
        Anagrams obj = new Anagrams();
        boolean Ana = obj.isAnnagram("Anagram","marngaa");
        if(!Ana){
            System.out.println("Annagram");
        }
        else {
            System.out.println("Not Annagram");
        }
    }
}
