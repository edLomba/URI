package Figurinhas;


import java.util.Scanner;

public class URI1028 { // https://www.urionlinejudge.com.br/judge/pt/problems/view/1028

	public static void main(String[] args) {
//------------------------------------------------------(declaration variable and method)
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int F1, F2, mdc, dividendo, temp;
//-------------------------------------------------------(solution main)
		for (int i = 0; i < N; i++) {
			F1 = scanner.nextInt();
			F2 = scanner.nextInt();

			if (F1 <= F2) {
				mdc = F1;
				dividendo = F2;
			} else {
				mdc = F2;
				dividendo = F1;
			}
			while (dividendo % mdc != 0) {
				temp = dividendo % mdc;
				dividendo = mdc;
				mdc = temp;
			}
			System.out.printf("%d\n", mdc);
		}
		scanner.close();
//--------------------------------------------------------------(end to solution main)
	}

}
