import java.util.Scanner;

class hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        while (number <=10) {
            System.out.println(number);
            number++;
            if (number == 5) {
                break;
            }
        }
    }
}