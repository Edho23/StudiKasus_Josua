package myTest;

public class UserData {
    private static UserData instance;
    private String username;
    private String password;

    private UserData() {
        // private constructor to prevent instantiation
    }

    public static UserData getInstance() {
        if (instance == null) {
            instance = new UserData();
        }
        return instance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
