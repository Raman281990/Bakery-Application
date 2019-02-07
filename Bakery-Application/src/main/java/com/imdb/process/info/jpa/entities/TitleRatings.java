package com.imdb.process.info.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="title_ratings")
public class TitleRatings {
	
	@Id
	@Column(name="tconst")
	private String tconst;
	
	@Column(name="averageRating")
	private Double averageRating;
	
	@Column(name="numVotes")
	private Long numVotes;

	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tconst")
	private TitleBasics titleBasics;
	
	
	public TitleBasics getTitleBasics() {
		return titleBasics;
	}

	public void setTitleBasics(TitleBasics titleBasics) {
		this.titleBasics = titleBasics;
	}

	public String getTconst() {
		return tconst;
	}

	public void setTconst(String tconst) {
		this.tconst = tconst;
	}

	public Double getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(Double averageRating) {
		this.averageRating = averageRating;
	}

	public Long getNumVotes() {
		return numVotes;
	}

	public void setNumVotes(Long numVotes) {
		this.numVotes = numVotes;
	}
	
	

}
