package com.lsu.misaka;

public class Practice5 {
	public static void main(String[] args) {
		String str = "this is a test of java";
		int count = 0;
		//ͳ��s���ֵĴ���
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == 's') {
				count++;
			}
		}
		System.out.println("�ַ�s�ĳ��ִ���Ϊ:"+count);
		//��ȡtest
		System.out.println(str.substring(10, 14));
		//���ַ��������ַ���������
		char[] s = str.toCharArray();
		str.getChars(0, str.length(), s, 0);
		System.out.println(s);
		//����ĸ��д���
		String[] sp = str.split(" ");
		for(String x : sp){
			System.out.print(x.substring(0,1).toUpperCase()+x.substring(1)+" ");
		}
		System.out.println();
		//�ַ����������
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		s = str.toCharArray();
		for(int i = s.length-1; i >=0; i--){
			System.out.print(s[i]);
		}
		//ת�����ַ���
		for(String x : sp){
			System.out.println(x);
		}
	}
}
