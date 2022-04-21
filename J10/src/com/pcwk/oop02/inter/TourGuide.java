package com.pcwk.oop02.inter;

public class TourGuide {

//private Providable tour = new KoreaTour();
	private Providable tour = null;
	
	public TourGuide() {}
	
	//약한 결합 : JapanTour(), KoreaTour() 알필요가 없다.
	public TourGuide(Providable tour) {
		this.tour = tour;
	}

	void leisureSports() {
		tour.leisureSports();
	}// sports

	void sightseeing() {
		tour.sightseeing();
	}// 경관보기

	void food() {
		tour.food();
	}// 음식

}
