package com.hooke.mustwatch.controller;

import com.hooke.mustwatch.model.Show;
import com.hooke.mustwatch.service.ShowService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ShowController {

	@Autowired
	private ShowService service;

	@ResponseBody
	@GetMapping("/shows")
	public List<Show> getShows() {
		return service.findAll();
	}
	
}