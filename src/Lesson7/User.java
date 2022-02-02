package Lesson7;


public class User implements Comparable {
    String login;
    String password;
    int a;
    UserTypes type;

    public User(String login, String password, UserTypes type) {
        this.login = login;
        this.password = password;
        this.type = type;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserTypes getType() {
        return type;
    }

    public void setType(UserTypes type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", type=" + type +
                '}';
    }

    @Override
    public int hashCode() {
        return this.login.hashCode() + 7 * this.password.hashCode() + type.ordinal();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof User)) return false;
        User that = (User) obj;
        if (this.login.equals(that.login) && this.password.equals(that.password) && (this.type == that.type))
            return true;
        return false;

    }

    public boolean equalsWithHashcode(User obj) {
        int result = this.login.compareTo(obj.login);

        if (obj == null) return false;
        if (!(obj instanceof User)) return false;
        User that = (User) obj;
        if (this.login.equals(that.login) && this.password.equals(that.password) && (this.type == that.type))
            return true;
        return false;

    }

    @Override
    public int compareTo(Object obj) {
        User that = (User) obj;
        int result = this.type.compareTo(that.type);
        if (result == 0) {
            result = this.login.compareTo(that.login);
        }
        return result;
    }
}
