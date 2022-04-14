package function_1065;

import java.util.Scanner;

/*
 * 문제: 한수
 * 문제 설명: 
 * 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
 * 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성.
*/

public class Function_1065 {

	public static int han(int n) {
		int hnum = 99;
		int a, b, c;
		
		for(int i =111; i<= n; i++) {
			int z =i;
			
			a = z/100;
			z %= 100;
			b = z/10;
			c = z%10;
			
			if((b-a) == (c-b))
				hnum ++;
		}
		
		return hnum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);//BufferedReader로 하면 더 빠를듯
		
		int num = in.nextInt();
		
		if(num < 100)
			System.out.println(num);
		else {
			System.out.println(han(num));
		}
	}
}
