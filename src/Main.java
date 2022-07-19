import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int count = 0;
        while (count <20) {
            number = scanner.nextInt();
            if(number%5 ==0) {
                println(number + "not multiple of 5");
            } else {
                println(number + "multiple of 5");
            }

            count++;
        }
    }
    public static void println(Object object) {
        System.out.println(object);
    }
}