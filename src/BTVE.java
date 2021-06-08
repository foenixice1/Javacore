import java.util.Scanner;

public class BTVE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ve = -1,height , width;
        while (ve != 0) {
            System.out.println("Menu");
            System.out.println("Ấn 1 để vẽ tam giác vuông");
            System.out.println("Ấn 2 để vẽ tam giác cân");
            System.out.println("Ấn 3 để vẽ hình chữ nhật");
            System.out.println("Ấn 0 để Exit");
            ve = scanner.nextInt();
            switch (ve) {
                case 1:
                    int i = 6 , n = 1;
                    String kq = "" ;
                    while ( i >= n) {
                        for ( int j = 1 ; j <= i ; j++) {
                            kq += "*" ;
                        }
                        kq += "\n";
                        i--;
                    }
                    System.out.println(kq);
                    break;
                case 2:
                    do {
                        System.out.print("height = ");
                        height = scanner.nextInt();
                    }while(height <= 0);

                    for(int a = 1; a <= height; a++) {
                        for(int j = 1; j <= height-a; j++) {
                            System.out.print("  ");
                        }
                        for(int k = 1; k <= 2*a-1; k++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.print("height = ");
                    height = scanner.nextInt();
                    System.out.print("width = ");
                    width = scanner.nextInt();

                    for(i = 1; i <= height; i++){
                        for(int j = 1; j <= width; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println("");
                    }
                    break;
                case 0 :
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn đúng");

            }
        }
    }
}
