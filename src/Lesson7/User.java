package Lesson7;

public class User {
    String login;
    String password;
    UserTypes type;

    public User(String login, String password, UserTypes type) {
        this.login = login;
        this.password = password;
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
        return this.login.hashCode() + 11 * this.password.hashCode() + type.ordinal();
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

    public boolean equalsWithHashcode(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof User)) return false;
        User that = (User) obj;
        if (this.login.equals(that.login) && this.password.equals(that.password) && (this.type == that.type))
            return true;
        return false;

    }
}

