import java.util.Scanner;

public class Decrypter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();

        InputType inputType = Input.parseInput(line);
    }
}
