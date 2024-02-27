package Practice_DSA;

import java.util.*;

public class Staircase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int nst = 1;
		int nsp = n-1;
		while (row<=n) {
			int i = 1;
			while (i<=nsp) {
				System.out.print(" ");
				i++;
			}
			int j = 1;
			sc.close();
			while(j<=nst){
				System.out.print("#");
				j++;
			}
			nsp--;
			nst++;

			row++;
			System.out.println();
		}
	}
}

