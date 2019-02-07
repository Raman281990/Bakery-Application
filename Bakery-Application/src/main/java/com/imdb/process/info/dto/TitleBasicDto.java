package com.imdb.process.info.dto;

public class TitleBasicDto {
	
	private String titleType;
	
	private String primaryTitle;
	
	private String originalTitle;
	
	private Long startYear;
	
	private Double averageRating;
	
	private Long numVotes;
	
	

	public TitleBasicDto(String titleType, String primaryTitle, String originalTitle, Long startYear,
			Double averageRating, Long numVotes) {
		super();
		this.titleType = titleType;
		this.primaryTitle = primaryTitle;
		this.originalTitle = originalTitle;
		this.startYear = startYear;
		this.averageRating = averageRating;
		this.numVotes = numVotes;
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

	public Long getStartYear() {
		return startYear;
	}

	public void setStartYear(Long startYear) {
		this.startYear = startYear;
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
