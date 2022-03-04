public class max_array {

    public static void main(String[] args) {
        int[] array = {32, 54, 67, 12, 23, 24};
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            int j = array[i];
            if (j > max) {
                max = j;
            }
        }
        System.out.println(max);
    }
}
