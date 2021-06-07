import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        int vnd , usd;
        System.out.println("Nhập vào số tiền bạn cần chuyển đổi");
        Scanner scanner = new Scanner(System.in);
        usd = scanner.nextInt();
        vnd = 23000 * usd ;
        System.out.println("Số tiền quy đổi ra VND là : " + vnd + " VND");

    }
}
