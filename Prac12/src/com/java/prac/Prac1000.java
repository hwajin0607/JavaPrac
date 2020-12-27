package com.java.prac;

import java.io.IOException;
import java.util.Scanner;

/*
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오. (0 < A, B < 10)
*/
public class Prac1000 {
	public static void main(String[] args) throws IOException {
		int sum;
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		if(0<A && A<10 && 0<B && B<10) {
			sum = A + B;
			System.out.println("합계 : "+sum);
		}
	}
}

		
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		int a= Integer.parseInt(st.nextToken());
		int b= Integer.parseInt(st.nextToken());
		
		System.out.print(a);
		System.out.print(b);*/