package Vampiros;

import java.util.Locale;
import java.util.Scanner;

public class URI1093 {
	public static void main(String[] args) {
//------------------------------------------------------(declaration variable and method)
		Locale.setDefault(Locale.US);
		Scanner inputs = new Scanner(System.in);
		int EV1 , EV2 , At, D , aux;
		Gamble gamble = new Gamble();
		double p;
//-------------------------------------------------------(solution main)
		for (;;) {
			EV1 = inputs.nextInt();
			EV2 = inputs.nextInt();
			At = inputs.nextInt();
			D = inputs.nextInt();

			if (EV1 == 0 && EV2 == 0 && At == 0 && D == 0)
				break;

			aux = EV1;
			EV1 = 0;
			while (aux > 0) {
				aux -= D;
				EV1++;
			}
			aux = EV2;
			EV2 = 0;
			while (aux > 0) {
				aux -= D;
				EV2++;
			}
			p = gamble.gamePlay(EV1, EV2, At);
			System.out.printf("%.1f\n", p * 100);
		}
		inputs.close();
//--------------------------------------------------------------(end to solution main)
	}
}
