package org.cusey.john.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fortis")
public class FortisController {
	
	@GetMapping("/student")
	public String studentInfo() {
		
		return "John Cusey";
	}

}
