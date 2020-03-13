package lesson3;

import java.util.Scanner;

public class InputData {


    public int intInputMethod (String stringScreen) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean ifNumber;

        do  {
            try {
                System.out.print(stringScreen);

                String inputString = scanner.next();

                number = Integer.parseInt(inputString);
                ifNumber = true;

            } catch (Exception e) {
                System.out.println("\nВы ввели неверные параметры. ");
                ifNumber = false;
            }
        } while (!ifNumber);

        return number;
    }



}
