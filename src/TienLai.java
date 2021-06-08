import java.util.Scanner;

public class TienLai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int  sothang ;
        double tiengui , lai ;
        System.out.println("Nhập vào số tiền gửi");
        tiengui = scanner.nextDouble();
        System.out.println("Nhập vào % lãi suất");
        lai = scanner.nextDouble() ;
        System.out.println("Nhập vào số tháng gửi");
        sothang = scanner.nextInt();

        double tienlai = 0;
        for ( int i = 0 ; i < sothang ; i++) {
            tienlai += tiengui * (lai/100)/12 * sothang;
        }
        System.out.println("Tiền lãi bạn nhận được sau " + sothang + " tháng là : " + tienlai);
    }
}
