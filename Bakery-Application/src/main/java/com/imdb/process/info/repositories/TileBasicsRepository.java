package com.imdb.process.info.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.imdb.process.info.dto.TitleBasicDto;
import com.imdb.process.info.jpa.entities.TitleBasics;

@Repository
public interface TileBasicsRepository extends CrudRepository<TitleBasics, String>{
	
	 @Query("SELECT new com.imdb.process.info.dto.TitleBasicDto(tb.titleType, tb.primaryTitle, tb.originalTitle, tb.startYear,\r\n" + 
	 		"			tr.averageRating, tr.numVotes) FROM TitleBasics tb \r\n" + 
	 		"		inner join  tb.titleRatings tr  where tb.genres like %:genres% order by tr.averageRating desc ")
	 public List<TitleBasicDto> findByGenre(@Param("genres") String genres);

}
