package com.pcwk.oop07;

public class Point3D extends Point {
	int z;
	//	Implicit super constructor Point() is undefined for
	//	default constructor. Must define an explicit constructor
	//	Default생성자가 없어서 생긴 오류
		public Point3D(int x, int y, int z) {
			//super() 자동으로 호출
			super(x,y);
			this.x = x;
			this.y = y;
			this.z = z;
			
		}
		
		@Override//아버지에 잇는 getLocation() 재정의
		public String getLocation() {
			return "x :"+x+", y :"+y+", z :"+z;
		}
}
