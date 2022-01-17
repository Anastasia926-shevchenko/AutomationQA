package Lesson5;

public class Main {
    public static void main(String[] args) {

        Box firstBox = new Box(4.0, 3.5, 5.4);
        Box secondBox = new Box();
        Box thirdBox = new Box();
        Box fourthBox = new Box();
        Box fifthBox = new Box(6.6, 7.0, 8.3);

        double firstBoxHeight = firstBox.getHeight();
        double firstBoxWidth = firstBox.getWidth();
        double firstBoxLength = firstBox.getLength();
        System.out.println("Volume of first box is " + firstBox.calculationOfVolume(firstBoxLength,firstBoxHeight, firstBoxWidth));

        double secondBoxHeight = secondBox.setHeight(4.0);
        double secondBoxWidth = secondBox.setWidth(5.0);
        double secondBoxLength = secondBox.setLength(3.0);
        System.out.println("Volume of second box is " + secondBox.calculationOfVolume(secondBoxLength, secondBoxHeight, secondBoxWidth) + " sm.");

        thirdBox.length = 7.8;
        thirdBox.width = 8.6;
        thirdBox.height = 16.0;
        System.out.println("Volume of third box is " + thirdBox.calculationOfVolume(thirdBox.getLength(), thirdBox.getHeight(), thirdBox.getWidth()) + " sm.");

        System.out.println("Volume of fourth box is " + fourthBox.calculationOfVolume(fourthBox.getLength(), fourthBox.getHeight(), fourthBox.getWidth()) + " sm.");

        double fifthBoxHeight = fifthBox.setHeight(24.0);
        double fifthBoxWidth = fifthBox.setWidth(28.9);
        double fifthBoxLength = fifthBox.setLength(30.3);
        System.out.println("Volume of fifth box is " + fifthBox.calculationOfVolume(fifthBoxLength, fifthBoxHeight, fifthBoxWidth) + " sm.");

    }
}
