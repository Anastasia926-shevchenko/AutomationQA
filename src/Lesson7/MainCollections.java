package Lesson7;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class MainCollections {
    public static void main(String[] args) {
        System.out.println("Created objects:");
        ArrayList<User> users = new ArrayList<>(10);
        createCollection(users);
        printHashCodes(users);
        TreeSet<User> usersTreeSet = new TreeSet<>(users);
        System.out.println("Sorted treeset collection:");
        printTreeSet(usersTreeSet);
    }

    private static void createCollection(ArrayList<User> users) {
        Random random = new Random();
        int a = 0;
        int b = 10000;
        for (int i = 1; i < 11; i++) {
            users.add(new User("User_" + i, random.nextInt(b - a) + "$abc", UserTypes.getRandom()));
        }
        System.out.println(users);
    }

    private static void printTreeSet(TreeSet<User> usersTreeSet) {
        for (User users : usersTreeSet) {
            System.out.println(users);
        }
    }

    private static void printHashCodes(ArrayList<User> users) {
        for (User user : users) {
            System.out.println("Hash code of " + user.getLogin() + " is " + user.hashCode());
        }
    }
}
