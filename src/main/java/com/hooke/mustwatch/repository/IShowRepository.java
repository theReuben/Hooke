package com.hooke.mustwatch.repository;

import com.hooke.mustwatch.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IShowRepository extends JpaRepository<Show, Long> {
	
}