import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kenar1: ");
        int kenar1 = input.nextInt();
        System.out.print("Kenar2: ");
        int kenar2 = input.nextInt();
        System.out.println("Kenar3: ");
        int kenar3 = input.nextInt();

        float u = (kenar1+kenar2+kenar3)/2;

        double alankare = u * (u-kenar1) * (u-kenar2) * (u-kenar3);
        double alan = Math.sqrt(alankare);

        System.out.println("Girdiğiniz üçgenin alanı: "+alan);
    }


}