package dev.exemple.entite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Exemple {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String champ1;

	private String champ2;

	public String getChamp1() {
		return champ1;
	}

	public void setChamp1(String champ1) {
		this.champ1 = champ1;
	}

	public String getChamp2() {
		return champ2;
	}

	public void setChamp2(String champ2) {
		this.champ2 = champ2;
	}

	public Exemple(String champ1, String champ2) {
		super();
		this.champ1 = champ1;
		this.champ2 = champ2;
	}

	public Exemple() {
		super();
	}
	
	
	
	
}
