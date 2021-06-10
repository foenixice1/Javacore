import java.util.Scanner;

public class ClassHCN {
    double width, height;

    public ClassHCN() {

    }

    public ClassHCN(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    public String display() {
        return  "Chiều rộng =  " + width + ", Chiều dài = " + height;
    }

//    class Chay {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào chiều rộng:");
            double width = scanner.nextDouble();
            System.out.println("Nhập vào chiều dài:");
            double heigth = scanner.nextDouble();
            ClassHCN hcn = new ClassHCN(width,heigth);
            System.out.println("Hình chữ nhật " + hcn.display());
            System.out.println("Chu vi là : " + hcn.getPerimeter());
            System.out.println("Diện tích là : " + hcn.getArea());
        }
    }
//}