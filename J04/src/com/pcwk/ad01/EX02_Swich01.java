package com.pcwk.ad01;

public class EX02_Swich01 {

	public static void main(String[] args) {
		int rank = 2;
		char medalColoer = ' ';
		
		switch(rank){
		case 1:
			medalColoer = 'G';
			break;
		case 2:
			medalColoer = 'S';
			break;
		case 3:
			medalColoer = 'B';
			break;
		default:
			medalColoer = ' ';
			break;
		}
		System.out.println("Ranking : "+rank);
		System.out.println("medalColoer : "+medalColoer);
	}

}

