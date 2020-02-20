package com.hooke.mustwatch.repository;

import com.hooke.mustwatch.model.Show;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowRepository extends JpaRepository<Show, Long> {
	
	public Show findByTitle(@Param("title") String title);
}