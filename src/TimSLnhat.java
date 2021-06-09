import java.util.Scanner;

public class TimSLnhat {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào kích cỡ size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size không được vượt quá 20 :");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1) + " :");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Danh sách bạn nhập vào là : " );
        for (int j = 0; j <array.length; j++) {
            System.out.println(array[j] + "\t");
        }
        int max = array[0] ;
        int index = 1 ;
        for ( int j = 0 ;  j < array.length ; j++) {
            if ( array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Số lớn nhất trong mảng là : " + max + " nằm ở vị trí : " + index);
    }
}
