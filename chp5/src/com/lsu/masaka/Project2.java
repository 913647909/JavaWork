package com.lsu.masaka;

import java.util.Scanner;

public class Project2 {
	public static void main(String[] args) {
		int a = 0,b = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("input two number:");
		a = scanner.nextInt();
		b = scanner.nextInt();
		System.out.println("���Լ��:"+gcd(a, b)+"\n��С������:"+(a>b?a:b)/gcd(a, b));
	}
	public static int gcd(int a, int b){
		int d = 0;
		while(a > 0){
			d = a;
			a = b % a;
			b = d;
		}
		return d;
	}
}
