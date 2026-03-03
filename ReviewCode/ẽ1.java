package ReviewCode;

import java.util.Scanner;

public class ẽ1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so nguyen n: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i--) {   
            sum += i;
        }

        if (n = 0) {   
            System.out.println("n bang 0");
        }

        System.out.println("Tong = " + sum);

        sc.close();
    }

}

