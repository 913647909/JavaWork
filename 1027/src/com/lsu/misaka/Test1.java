package com.lsu.misaka;

public class Test1 {
	
	
	public static void main(String[] args) {
		String a = "abcdefghijklmnopqrstuvwxyz";
		String b = "TestcodeAbCdEf";
		System.out.println("ԭ�ַ���Ϊ��"+b);
		System.out.println("Сд�ַ�Ϊ��");
		for(int i = 0; i <= b.length()-1; i++){
			String c = ""+b.charAt(i);
			if (a.contains(c)){
				System.out.print(c);
			}
		}
		System.out.println();
		System.out.println("��д�ַ�Ϊ��");
		for(int i = 0; i <= b.length()-1; i++){
			String c = ""+b.charAt(i);
			if (!a.contains(c)){
				System.out.print(c);
			}
		}
	}
}
