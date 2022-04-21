package com.pcwk.ex03.set;

import java.util.*;

public class HashSetEx02_Remove_PrintAll {

	public static void main(String[] args) {
		//추가
		//삭제
		//제체 출력
		
		HashSet lenctureSet =  new HashSet<>();
		//추가
		lenctureSet.add("C");
		lenctureSet.add("JAVA");
		lenctureSet.add("WEB");
		lenctureSet.add("SPRING");
		
		HashSet<String> lectureCpSet = new HashSet<>(lenctureSet);
		
		
		System.out.println("lenctureSet : "+lenctureSet);//lenctureSet : [JAVA, SPRING, C, WEB]
		
		
		//삭제
		lenctureSet.remove("C");
		System.out.println("lenctureSet : "+lenctureSet);//lenctureSet : [JAVA, SPRING, WEB]

		//다건 삭제
		lenctureSet.removeAll(Arrays.asList("JAVA","WEB"));
		System.out.println("lenctureSet : "+lenctureSet);//lenctureSet : [SPRING]
		
		//전체 삭제
		lenctureSet.clear();
		System.out.println("lenctureSet : "+lenctureSet);//lenctureSet : []
		System.out.println("=전체 출력=================================");
		
		//for-each loop
		for(String lec:lectureCpSet) {
			System.out.print(lec +", ");
		}
		System.out.println();
		
		
		//using iterator
		Iterator<String> iter = lectureCpSet.iterator();
		
		while(iter.hasNext()) {//element가 있으면 true
			System.out.print(iter.next()+", ");
			
		}
		
	}

}
