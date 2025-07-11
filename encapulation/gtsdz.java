package encapulation;

public class gtsdz {
    public static void main(String[] args) {
        User user = new User();

        user.setUsername("Mirali");
        user.setEmail("kontakth456@gmail.com");
        user.setPassword("mansurov2012");

        user.showProfile();

        user.setEmail("kontakth456gmail.com");
        user.setPassword("276");

        user.showProfile();
    }
}

