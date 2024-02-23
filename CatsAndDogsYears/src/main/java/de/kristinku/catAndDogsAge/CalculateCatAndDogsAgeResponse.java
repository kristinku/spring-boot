package de.kristinku.catAndDogsAge;

public class CalculateCatAndDogsAgeResponse {
	
	private int catAgeAsHumanAge;
	private int dogAgeAsHumanAge;
	public int getCatAgeAsHumanAge() {
		return catAgeAsHumanAge;
	}
	public void setCatAgeAsHumanAge(int catAgeAsHumanAge) {
		this.catAgeAsHumanAge = catAgeAsHumanAge;
	}
	public int getDogAgeAsHumanAge() {
		return dogAgeAsHumanAge;
	}
	public void setDogAgeAsHumanAge(int dogAgeAsHumanAge) {
		this.dogAgeAsHumanAge = dogAgeAsHumanAge;
	}
	public CalculateCatAndDogsAgeResponse(int catAgeAsHumanAge, int dogAgeAsHumanAge) {
		super();
		this.catAgeAsHumanAge = catAgeAsHumanAge;
		this.dogAgeAsHumanAge = dogAgeAsHumanAge;
	}
	
	

}
