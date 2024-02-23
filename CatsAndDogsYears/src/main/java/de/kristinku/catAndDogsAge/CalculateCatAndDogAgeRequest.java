package de.kristinku.catAndDogsAge;

public class CalculateCatAndDogAgeRequest {
	
	private int catYears;
	private int dogYears;
	
	public CalculateCatAndDogAgeRequest(int catYears, int dogYears) {
		super();
		this.catYears = catYears;
		this.dogYears = dogYears;
	}
	public int getCatYears() {
		return catYears;
	}
	public void setCatYears(int catYears) {
		this.catYears = catYears;
	}
	public int getDogYears() {
		return dogYears;
	}
	public void setDogYears(int dogYears) {
		this.dogYears = dogYears;
	}

}
