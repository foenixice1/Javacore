import java.util.Scanner;

public class UocChung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("Nhập vào số a");
        a = scanner.nextInt();
        System.out.println("Nhập vào số b");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("Hai số trên không có UCLN");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else b = b - a;
            System.out.println("UCLN là " + a);
        }
    }
}
