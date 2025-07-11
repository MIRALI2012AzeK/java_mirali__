package encapulation;

public class User {
    private String username;
    private String email;
    private String password;


    public void setUsername(String username) {
        this.username = username;
    }


    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Неверный email!");
            this.email = null;
        }
    }


    public void setPassword(String password) {
        if (password.length() >= 4) {
            this.password = password;
        } else {
            System.out.println("Пароль слишком короткий!");
            this.password = null;
        }
    }


    public void showProfile() {
        System.out.println("Имя пользователя: " + username);
        if (email != null) {
            System.out.println("Email: " + email);
        } else {
            System.out.println("Email не задан");
        }
    }
}

