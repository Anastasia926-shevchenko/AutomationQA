package Lesson7;

import java.util.Random;

public enum UserTypes {
    ADMIN(0),
    PREMIUM(1),
    AUTHORIZED(2),
    GUEST(3);
    public int processOrder;

    UserTypes(int processOrder) {
        this.processOrder = processOrder;
    }

    public int getProcessOrder() {

        return processOrder;
    }
    public static UserTypes getRandom() {
        Random randomizer = new Random();
        UserTypes[] userTypeList = UserTypes.values();
        int randomOrdinal = randomizer.nextInt(userTypeList.length);
        return userTypeList[randomOrdinal];
    }
}
