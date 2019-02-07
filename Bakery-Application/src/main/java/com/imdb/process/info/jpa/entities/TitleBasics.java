package com.imdb.process.info.jpa.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="title_basics")
public class TitleBasics {
	
	@Id
	@Column(name="tconst")
	private String tconst;
	
	@Column(name="titleType")
	private String titleType;
	
	@Column(name="primaryTitle")
	private String primaryTitle;
	
	@Column(name="originalTitle")
	private String originalTitle;
	
	@Column(name="isAdult")
	private int isAdult;
	
	@Column(name="startYear")
	private Long startYear;
	
	@Column(name="endYear")
	private Long endYear;
	
	@Column(name="runtimeMinutes")
	private Long runtimeMinutes;
	
	@Column(name="genres")
	private String genres;
	
	@OneToOne(mappedBy="titleBasics", cascade = CascadeType.ALL)
	private TitleRatings titleRatings;

	public TitleRatings getTitleRatings() {
		return titleRatings;
	}

	public void setTitleRatings(TitleRatings titleRatings) {
		this.titleRatings = titleRatings;
	}

	public String getTconst() {
		return tconst;
	}

	public void setTconst(String tconst) {
		this.tconst = tconst;
	}

	public String getTitleType() {
		return titleType;
	}

	public void setTitleType(String titleType) {
		this.titleType = titleType;
	}

	public String getPrimaryTitle() {
		return primaryTitle;
	}

	public void setPrimaryTitle(String primaryTitle) {
		this.primaryTitle = primaryTitle;
	}

	public String getOriginalTitle() {
		return originalTitle;
	}

	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}

	public int getIsAdult() {
		return isAdult;
	}

	public void setIsAdult(int isAdult) {
		this.isAdult = isAdult;
	}

	public Long getStartYear() {
		return startYear;
	}

	public void setStartYear(Long startYear) {
		this.startYear = startYear;
	}

	public Long getEndYear() {
		return endYear;
	}

	public void setEndYear(Long endYear) {
		this.endYear = endYear;
	}

	public Long getRuntimeMinutes() {
		return runtimeMinutes;
	}

	public void setRuntimeMinutes(Long runtimeMinutes) {
		this.runtimeMinutes = runtimeMinutes;
	}

	public String getGenres() {
		return genres;
	}

	public void setGenres(String genres) {
		this.genres = genres;
	}

	
}
