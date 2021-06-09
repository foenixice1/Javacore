import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double doF , doC ;
        int click = - 1;
        while ( click != 0) {
            System.out.println("Menu");
            System.out.println(" 1 : Chuyển từ độ C sang độ F ");
            System.out.println(" 2 : Chuyển từ độ C sang độ F ");
            System.out.println(" 3 : Exit ");
            click = scanner.nextInt();
            switch (click) {
                case 1 :
                    System.out.println("Nhập vào  độ C hiện tại:");
                    doC = scanner.nextDouble();
                    System.out.println("Nhiệt độ chuyển sang độ F là : " + (9.0 / 5) * doC + 32 + " F");
                    break;
                case 2 :
                    System.out.println("Nhập vào độ F hiện tại :");
                    doF = scanner.nextDouble();
                    System.out.println("Nhiệt độ chuyển sang độ C là : " + (5.0 / 9) * (doF - 32) + " C");
                    break;
                case 3:
                    System.exit(3);
                default:
                    System.out.println("Vui lòng nhập lại");
            }
        }
    }
}
