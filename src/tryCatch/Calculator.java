package tryCatch;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so x: ");
        int x = Integer.parseInt(sc.nextLine());

        System.out.println("Nhap so y: ");
        int y = Integer.parseInt(sc.nextLine());

        Calculator cal = new Calculator();
        cal.calculate(x, y);
    }

    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;

            System.out.println("Tong x + y = " + a);
            System.out.println("Hieu x - y = " + b);
            System.out.println("Tich x * y = " + c);
            System.out.println("Thuong x / y = " + d);
        } catch (Exception e) {
            System.out.println("Xay ra ngoai le: " + e.getMessage());
        }
    }
}
