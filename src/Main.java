import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n Написати метод приймає стрінгу і друкує всі її унікальні значення з нового рядка.\n" +
                "Alexx9800\n\n");
        System.out.println("Answer:");

        String name = "Alexx9800";

        char[] Array = name.toCharArray();

        Set<Character> LettersNumbers = new LinkedHashSet<>();

        for (int i = 0; i < Array.length; i++) {
            LettersNumbers.add(Array[i]);
        }
        for (Character Alex : LettersNumbers) {
            System.out.println(Alex);
        }

        System.out.println("\n\n Написати метод який приймає массив цілих \n"+
                "чисел і вертає суму всіх його парних \n"+
                "елементів(не тих які мають парні індекси а ті які самі є парними).\n" +
                "[8,2,3,4,5,6,7] -> 20\n\n" );

        System.out.println("Answer:");

        int[] allNumbers = {8, 2, 3, 4, 5, 6, 7};

        int sum = 0;

        for (int i = 0; i < allNumbers.length; i++) {
            if (allNumbers[i] % 2 == 0) {
                sum += allNumbers[i];
            }
        }
        System.out.println(sum);
    }
}