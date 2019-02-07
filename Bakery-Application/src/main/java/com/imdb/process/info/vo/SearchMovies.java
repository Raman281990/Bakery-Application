package com.imdb.process.info.vo;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchMovies implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3388628283105656187L;
	
	@JsonIgnore
	@JsonProperty(required = false)
	private SearchCritiera searchCritiera;
	
	@JsonIgnore
	@JsonProperty(required = false)
	private List<Movies> movies;
	

	public List<Movies> getMovies() {
		return movies;
	}

	public void setMovies(List<Movies> movies) {
		this.movies = movies;
	}

	public SearchCritiera getSearchCritiera() {
		return searchCritiera;
	}

	public void setSearchCritiera(SearchCritiera searchCritiera) {
		this.searchCritiera = searchCritiera;
	}
	
	

}
