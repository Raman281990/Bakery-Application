package com.imdb.process.info.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="name_basics")
public class NameBasics {
	
	@Id
	@Column(name="nconst")
	private String nconst;
	
	@Column(name="primaryName")
	private String primaryName;
	
	@Column(name="birthYear")
	private Long birthYear;
	
	@Column(name="deathYear")
	private Long deathYear;
	
	@Column(name="primaryProfession")
	private String primaryProfession;
	
	@Column(name="knownForTitles")
	private String knownForTitles;
	
	public String getPrimaryName() {
		return primaryName;
	}

	public void setPrimaryName(String primaryName) {
		this.primaryName = primaryName;
	}

	public Long getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(Long birthYear) {
		this.birthYear = birthYear;
	}

	public Long getDeathYear() {
		return deathYear;
	}

	public void setDeathYear(Long deathYear) {
		this.deathYear = deathYear;
	}

	public String getPrimaryProfession() {
		return primaryProfession;
	}

	public void setPrimaryProfession(String primaryProfession) {
		this.primaryProfession = primaryProfession;
	}

	public String getKnownForTitles() {
		return knownForTitles;
	}

	public void setKnownForTitles(String knownForTitles) {
		this.knownForTitles = knownForTitles;
	}

	public String getNconst() {
		return nconst;
	}

	public void setNconst(String nconst) {
		this.nconst = nconst;
	}
	
	

}
