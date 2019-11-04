package beginner;

import java.util.Scanner;

class Add {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        int[] sum = new int[testCases];
        for (int i = 0; i < testCases; i++) {
            String[] input = sc.nextLine().split(" ");
            sum[i] = Integer.parseInt(input[0]) + Integer.parseInt(input[1]);
        }
        for (int value : sum) {
            System.out.println(value);
        }
    }
}
