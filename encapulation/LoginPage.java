package encapulation;

public class LoginPage {
    public static void main(String[] args) {
        User u = new User();
        u.setUsername("Mirali");
        u.setPassword("2012");
        u.setAge("12");
        u.setGender("Men");
        u.setSchool("276");

        System.out.println("Username: " + u.getUsername());
        System.out.println("-------------------------------");

        System.out.println("Password: " + u.getPassword());
        System.out.println("-------------------------------");

        System.out.println("Age: " + u.getAge());
        System.out.println("-------------------------------");

        System.out.println("Gender: " + u.getGender());
        System.out.println("-------------------------------");

        System.out.println("School: " + u.getSchool());
    }
}
