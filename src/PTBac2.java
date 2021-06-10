import java.util.Scanner;

public class PTBac2 {
    double a, b, c;

    public void GiaiPT() {
        double delta, n1, n2;
        delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta == 0) {
            n1 = n2 = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép "
                    + "\nx1 = x2 =" + n1);
        } else {
            n1 = (-b + Math.sqrt(delta)) / (2 * a);
            n2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm phân biệt"
                    + "\nX1 = " + n1 + "\nX2 = " + n2);
        }
    }

}

class _ptb2 {
    public static void main(String[] args) {

        PTBac2 ptb2 = new PTBac2();
        Scanner nhap = new Scanner(System.in);
        System.out.println("Chương trình giải Phương trình bậc 2");
        System.out.println("Mời nhập a= ");
        ptb2.a = nhap.nextDouble();
        System.out.println("Mời nhập b= ");
        ptb2.b = nhap.nextDouble();
        System.out.println("Mời nhập c= ");
        ptb2.c = nhap.nextDouble();
        ptb2.GiaiPT();
    }
}

