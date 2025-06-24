public class Lesson {
    public static void main(String[] args) {
        urok student1 = new urok();
        student1.id = 1;
        student1.name = "Mirali";
        student1.favLesson = "informatika";
        student1.age = 13;
        student1.student_info();

        urok student2 = new urok();
        student2.id = 2;
        student2.name = "Kenan";
        student2.favLesson = "informatika";
        student2.age = 10;
        student2.student_info();

        urok student3 = new urok();
        student3.id = 3;
        student3.name = "Shahriyar";
        student3.favLesson = "English";
        student3.age = 16;
        student3.student_info();
    }
}
