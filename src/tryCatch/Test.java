package tryCatch;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public Integer[] creatRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sach phan tu cua mang: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        Test arr = new Test();
        Integer[] arrI = arr.creatRandom();

        Scanner sc = new Scanner(System.in);
        System.out.println("\nVui long nhap chi so cua 1 phan tu bat ky: ");
        int x = Integer.parseInt(sc.nextLine());
        try{
            System.out.println("Gia tri cua phan tu co chi so 5 " + x + " la " + arrI[x]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Chi so vuot qua gioi han cua mang: ");
        }
    }
}
