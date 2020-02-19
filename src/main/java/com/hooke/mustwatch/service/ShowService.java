package com.hooke.mustwatch.service;

import com.hooke.mustwatch.model.Show;
import com.hooke.mustwatch.repository.ShowRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowService implements IShowService {
	
	@Autowired
	private ShowRepository repository;

	@Override
	public List<Show> findAll() {
		return repository.findAll();
	}
}