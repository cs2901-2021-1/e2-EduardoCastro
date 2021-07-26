package vaccination;

public class User {
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public boolean auth(String name, String password) {
        return this.name.equals(name) && this.password.equals(password);
    }
}
