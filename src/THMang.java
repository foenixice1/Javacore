import java.util.Scanner;

public class THMang {
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
            System.out.println("Nhập vào phần tử của mảng  " + (i + 1) + " :" );
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf( "%-20s%s" ,"Các phần tử trong mảng" , "" );
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf( "%-20s%s" , "Mảng đảo ngược là :" , "" );
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
    }
}
