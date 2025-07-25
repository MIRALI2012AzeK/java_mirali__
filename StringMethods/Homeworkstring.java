package StringMethods;

public class Homeworkstring {
    public static void main(String[] args) {
        Integer a = 2012;
        String b = Integer.toString(a);
        System.out.println(b);


        String wexample = "Developia";
        System.out.println(wexample.charAt(0));


        String text = "Hi, Global";
        char[] massive = new char [3];
        text.getChars(5, 6, massive, 1);
        System.out.println(massive);

        String text1 = "Cat";
        char[] symbols = text1.toCharArray();
        for (char c : symbols) {
            System.out.println(c);
        }

        String str1  = "Ingeneering";
        String str2 = "Ingeneer";
        boolean bool = str1.regionMatches(0, str2, 0, 4);
        System.out.println(bool);


        String str3  = "developer";
        System.out.println(str3.startsWith("dev"));
        System.out.println(str3.endsWith("er"));


        String text3 =  "Java programming";
        String text4 = "Java";
        System.out.println(text4.compareTo(text3));


        String c = "Mirali";
        System.out.println(c.indexOf("i"));
        System.out.println(c.lastIndexOf("i"));
    }
}
