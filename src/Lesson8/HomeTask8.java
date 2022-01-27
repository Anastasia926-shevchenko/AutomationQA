package Lesson8;

public class HomeTask8 {
    public static void main(String[] args) {
        String text = "australian scientists say they have discovered an unknown spinning object in the Milky Way that they claim is unlike anything seen before. the object - first discovered by a university student - has been observed to release a huge burst of radio energy for a full minute every 18 minutes. objects that pulse energy in the universe are often documented.but researchers say something that turns on for a minute is highly unusual.";
        String result = actionsWithString(text);
    }

    private static String actionsWithString(String text) {
        String[] array = text.split(" ");
        for (String words : array) {
            System.out.println(words);
        }
        String[] stringArray = text.split("\\.");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(Character.toUpperCase(stringArray[i].trim().
                    charAt(0)) + stringArray[i].trim().substring(1) + ". ");
        }
        String firstWordLetter = text.substring(0, 1).toUpperCase() + text.substring(1);
        return firstWordLetter.join(" ", array);
    }
}
