public class lab11 {
    public static void main(String[] args) {
        int[][] arr = {{23, 43, 90},
                {67, 37, 26},
                {89, 76, 34}
        };
        int max = arr[0][0];
        for (int i = 1; i < arr.length; i++) {
            for (int j = 2; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Maximum Value: " + max);
    }
}
