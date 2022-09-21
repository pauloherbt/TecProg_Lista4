package lista4;

import java.util.Random;

public class Exerc03 {
	public static void povoarVetor(int vet[]) {
		Random povoar=new Random();
		for (int i = 0; i < vet.length; i++) {
			vet[i]=povoar.nextInt();
		}
	}
	public static void main(String[] args) {
		int vet[]=new int[100];
		povoarVetor(vet);
	}

}
