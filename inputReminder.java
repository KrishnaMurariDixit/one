import java.util.*;

public class inputReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int Reminder = a % b;
        System.out.println(Reminder);
    }
}
