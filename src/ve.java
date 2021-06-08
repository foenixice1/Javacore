import java.util.Scanner;

public class ve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int ve = -1;
        while ( ve!=0) {
            System.out.println("Menu");
            System.out.println("Ấn 1 Vẽ hình tam giác");
            System.out.println("Ấn 2 Vẽ hình vuông");
            System.out.println("Ấn 3 Vẽ hình chữ nhật");
            System.out.println("Ấn 4 Vẽ hình trái tim");
            System.out.println("Ấn 0 Exit");
            System.out.println("Vui lòng nhập số");
            ve = scanner.nextInt();
            switch (ve){
                case 1:
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2 :
                    System.out.println("******");
                    System.out.println("*    *");
                    System.out.println("******");
                    break;
                case 3:
                    System.out.println("******");
                    System.out.println("******");
                    break;
                case 4:
                    System.out.println("   **   * *  ");
                    System.out.println("*     *     *");
                    System.out.println("  *       *");
                    System.out.println("    *   *");
                    System.out.println("      *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập lại");
            }
        }
    }
}
