package com.java.prac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오. (0 < A, B < 10)*/
public class Prac10998 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		if(0 < a && a< 10 && 0 <b && b <10) {
			System.out.println(a*b);
		}
	}
}
