package fr.gtm.monop;

public class Case {
	String nomCase;
	String couleurCase;
	Case next;

	public Case(String nomCase, String couleurCase, Case next) {
		super();
		this.nomCase = nomCase;
		this.couleurCase = couleurCase;
		this.next = next;
	}

	public Case getNext() {
		return next;
	}

	public void setNext(Case next) {
		this.next = next;
	}


	public String getNomCase() {
		return nomCase;
	}

}
