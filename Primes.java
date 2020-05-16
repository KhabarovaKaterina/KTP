import java.util.Scanner;
public class Primes {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("������� ����� ");
		int n=in.nextInt();
		System.out.print("������� �����: ");
		isPrime(n);
	}
	public static void isPrime(int n) {
		//�������� �� ������� �����
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
