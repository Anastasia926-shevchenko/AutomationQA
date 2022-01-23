package Lesson7;

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
}
