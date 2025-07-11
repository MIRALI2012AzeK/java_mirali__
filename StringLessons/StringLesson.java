package StringLessons;

public class StringLesson {
    public static void main(String[] args) {
        String str1 = "JAVA is A programming language";
        String str2 = "java";

        System.out.println(str1.length());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.charAt(2));
        System.out.println(str1.substring(0, 6));
    }
}