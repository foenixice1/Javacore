public class Daonguoc {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 4};

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            temp = arr[arr.length -1- i];
            System.out.println(temp);

        }
    }
}
