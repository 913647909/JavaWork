package chp4;

import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float[] s1 = new float[10];
		char[] s2 = new char[10];
		float aver = 0;
		for (int i = 0; i <10; i++){
			System.out.println("�������"+(i+1)+"���ɼ���");
			s1[i] = scanner.nextFloat();
			aver = aver + s1[i];
		}
		aver = aver / 10;
		for (int i = 0; i <10; i++){
			if (s1[i] >= 90){
				s2[i] = 'A';
			}
			else if (s1[i] >= 80){
				s2[i] = 'B';
			}
			else if (s1[i] >= 70){
				s2[i] = 'C';
			}
			else if (s1[i] >= 60){
				s2[i] = 'D';
			}
			else {
				s2[i] = 'E';
			}
		}
		System.out.println("�ٷ��Ƴɼ��嵥:");
		for (float x : s1){
			System.out.print(x+"\t");
		}
		System.out.println("\n�ٷ��Ƴɼ�ƽ���֣�"+aver);
		System.out.println("����Ƴɼ��嵥:");
		for (char x : s2){
			System.out.print(x+"\t");
		}
	}

}
