package StringLessons;

public class ExerciseString {
    public static void main(String[] args) {
        String name1 = "Mirali";
        String name2 = "Mirali";
        String name3 = "Mirali";
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

        if (name1.equals(name2) && name2.equals(name3)){
            System.out.println("oni ravni");
        } else {
            System.out.println("oni ne ravni");
        }
    }
}
