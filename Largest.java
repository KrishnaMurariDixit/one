import java.util.*;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("equal");
        } else {
            if (a > b) {
                System.out.println("greater");
            } else {
                if (a < b) {
                    System.out.println("leaser");
                }
            }
        }
    }
}
