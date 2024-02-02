package de.kristinku.toDoSpring;

public class ToDo {
	private String bezeichnung;
	private boolean istBearbeitet;
	
	public ToDo(String bezeichnung, boolean istBearbeitet) {
		this.bezeichnung = bezeichnung;
		this.istBearbeitet = istBearbeitet;
	}
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public boolean isIstBearbeitet() {
		return istBearbeitet;
	}
	public void setIstBearbeitet(boolean istBearbeitet) {
		this.istBearbeitet = istBearbeitet;
	}
	
}
