package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("nhap vao canh thu nhat: ");
            int a = scanner.nextInt();
            System.out.println("nhap vao canh thu hai: ");
            int b = scanner.nextInt();
            System.out.println("nhap vao canh thu ba: ");
            int c = scanner.nextInt();

            if (a<0||b<0||c<0|| a+b<c|| a+c<b||b+c<a) {
                int temp =3/0;
            }
            System.out.println("do dai ba canh hop le");
        } catch (Exception e) {
            System.err.println("do dai ba canh khong hop le");
        }
    }
}
