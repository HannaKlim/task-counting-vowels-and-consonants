package by.itacademy.hannaklim.countingVowelsAndConsonants;

public class CountingVowelsAndConsonants {
    public static void main(String[] args) {
        String str = "abagggggeeiiiggfd";
        char[] chars = str.toCharArray();
        System.out.println(chars);

        int countOfVowels = 0;
        for (char aChar : chars) {
            if ((aChar == 'a') || (aChar == 'e') || (aChar == 'i') || (aChar == 'o') || (aChar == 'u')) {
                countOfVowels++;
            }
        }
        System.out.println("Колличество гласных букв = " + countOfVowels);
        System.out.println("Колличество согласных букв = " + (chars.length - countOfVowels));
    }
}
