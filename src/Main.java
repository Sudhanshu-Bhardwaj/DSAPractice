import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int[] sum = new int[col];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                sum[j] = sum[j] + arr[i][j];
            }
        }
        for(int i = 0; i < col; i++) {
            System.out.print(sum[i] + " ");
        }
        sc.close();
    }
}