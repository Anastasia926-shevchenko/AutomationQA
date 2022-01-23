package Lesson7;

public class Main {
    public static void main(String[] args) {

        User firstUser = new User("mail@.com", "1aaaBbb3", UserTypes.ADMIN);
        User secondUser = new User("gmail@.com", "1111", UserTypes.GUEST);

        printEnumList();
        System.out.println(firstUser.toString());
        System.out.println(secondUser.toString());
        System.out.println("Hashcode of first user is " + firstUser.hashCode());
        System.out.println("Hashcode of second user is " + secondUser.hashCode());
        compareObjects(firstUser, secondUser);
    }

    private static void printEnumList() {
        for (UserTypes types : UserTypes.values()) {
            System.out.println(types.name() + " " + types.getProcessOrder());
        }
    }

    private static void compareObjects(User first, User second) {
        if (first.equals(second)) {
            System.out.println("It's the same user");
        } else {
            System.out.println("It's different user");
        }
        if (first.equalsWithHashcode(second)) {
            System.out.println("It's the same user");
        } else {
            System.out.println("It's different user");
        }
    }
}

