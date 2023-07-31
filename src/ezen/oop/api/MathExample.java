package ezen.oop.api;

public class MathExample {

	public static void main(String[] args) {
		double d = 69.6;
		System.out.println(Math.round(d));
		System.out.println(Math.ceil(d));
		System.out.println(Math.floor(d));
		
		int[] num = new int[6];
		for (int i = 0; i < 6; i++) {
			num[i]=(int)(Math.random()*45)+1;
			for (int j = 0; j < i; j++) {
				if(num[j] ==num[i]) {
					i--;
				}
			}
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+"\t");
		}

	}

}
