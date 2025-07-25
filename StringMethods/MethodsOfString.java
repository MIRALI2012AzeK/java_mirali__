package StringMethods;

import java.sql.SQLOutput;

public class MethodsOfString {
    public static void main(String[] args) {
        Integer a = 123;
        String s = Integer.toString(a);
        System.out.println(s);


        String word = "Programming";
        System.out.println(word.charAt(4));


        String text = "Hello, world";
        char[] massive = new char [3];
        text.getChars(8, 10, massive, 0);
        System.out.println(massive);


        String text1 = "Dog";
        char[] symbols = text1.toCharArray();
        for (char c : symbols) {
            System.out.println(c);
        }

        String str1  = "Programmer";
        String str2 = "Programm";
        boolean bool = str1.regionMatches(0, str2, 0, 4);
        System.out.println(bool);


        String str3  = "information";
        System.out.println(str3.startsWith("inf"));
        System.out.println(str3.endsWith("ma"));


        String text3 =  "java";
        String text4 = "java";
        System.out.println(text4.compareTo(text3));


        String c = "Mirali";
        System.out.println(c.indexOf("i"));
        System.out.println(c.lastIndexOf("i"));
    }
}