package com.tigrayArchive.home.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tigrayArchive.home.dtos.MediaDto;
import com.tigrayArchive.home.services.EvidenceService;

@RestController
public class Home {
	
	@Autowired
	private EvidenceService evidenceService;
	
	@GetMapping("/")
	public String home(Principal principal) {
		return "Hello world " + principal.getName();
	}
	
	@PostMapping("/save/media")
	public String saveMedia(@RequestBody MediaDto media) {
		this.evidenceService.saveMedia(media);
		return "successfuly uploaded";
	}
}
