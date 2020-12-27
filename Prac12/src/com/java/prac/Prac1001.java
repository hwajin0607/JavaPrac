package com.java.prac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
 */
public class Prac1001 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//하드디스크는 원래 속도가 엄청 느리므로 바로 이동시키는 것보다 중간에 메모리 버퍼를 둬서 데이터를 묶어서 이동하는 것이 효율적.
		String s = br.readLine();//버퍼가 빠르지만 데이터가 String으로 고정되기에 데이터를 따로 가공해야 하는 번거로움.
		//readLine은 한 줄을 읽음.//read는 한 글자만 읽어 정수형으로 변환(ex.'3'의 정수형인 51을 반환)
		StringTokenizer st = new StringTokenizer(s);//s에는 숫자 두개 다 들어가있으므로 공백기준으로 잘라줌.
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(a - b);
	}
}
