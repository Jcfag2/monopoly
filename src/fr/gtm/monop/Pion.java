package fr.gtm.monop;
//
public class Pion {
String nomPion;
Case positionSurPlateau;
Joueur joueurDuPion;




public Case getPositionSurPlateau() {
	return positionSurPlateau;
}


public void avancerPion(Case c) {
	setPositionSurPlateau(c.next);
	c = getPositionSurPlateau();
}

public void setPositionSurPlateau(Case positionSurPlateau) {
	this.positionSurPlateau = positionSurPlateau;
}




public Joueur getJoueurDuPion() {
	return joueurDuPion;
}




public void setJoueurDuPion(Joueur joueurDuPion) {
	this.joueurDuPion = joueurDuPion;
}




public String getNomPion() {
	return nomPion;
}




public Pion(String nomPion) {
	this.nomPion = nomPion;
}
	
}
