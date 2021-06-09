import java.util.Scanner;

public class TimGTtrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name students");
        String input_name = scanner.nextLine();

        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Vị trí của " + input_name + "  trong mảng là : " + (i + 1));
                check = true;
                break;
            }
        }
        if (!check)
            System.out.println(" Sinh viên " + input_name + " không có trong danh sách");
    }
}
