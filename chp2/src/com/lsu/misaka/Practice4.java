package com.lsu.misaka;

public class Practice4 {
	public static void main(String[] args) {
		int temp = 1;
		for (int i = 1; i<= 10; i++){
			for (int j =1; j <= i; j++){
				temp *= j;
			}
			System.out.println(i+"�Ľ׳ˣ�"+temp);
			temp =1;
		}
	}
}
