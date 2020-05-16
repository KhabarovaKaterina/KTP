import java.util.Scanner;
public class Primes {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Введите число ");
		int n=in.nextInt();
		System.out.print("Простые числа: ");
		isPrime(n);
	}
	public static void isPrime(int n) {
		//Проверка на простое число
		boolean prime;
		for (int i=2;i<=n;i++) {
			prime=true;
			for (int j=2;j<i;j++) 
				if (i%j==0 && j!=i)
					prime=false;
			if(prime)
				System.out.print(i+" ");
		}
	}
}
