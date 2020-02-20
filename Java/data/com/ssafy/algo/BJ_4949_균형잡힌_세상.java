package com.ssafy.algo;

import java.util.Scanner;
import java.util.Stack;

public class BJ_4949_균형잡힌_세상 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> punc = new Stack<>();
		while(true) {
			punc.clear();
			String str= sc.nextLine();
			if(str.charAt(0)=='.')break;
			
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i)=='('||str.charAt(i)=='[') {
					punc.push(str.charAt(i));
				
				}else if(str.charAt(i)==')' || str.charAt(i)==']') {
					if(punc.isEmpty()||(punc.peek()!='['&& str.charAt(i)==']')||(punc.peek()!='('&& str.charAt(i)==')')) {
						punc.push(str.charAt(i));
						break;
					}
					punc.pop();
				}
			}
			if(punc.isEmpty()) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
		
	}
}
