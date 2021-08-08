package com.ss501.myplayplayground.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ss501.myplayplayground.domain.playground.entity.Playground;
import com.ss501.myplayplayground.service.PlaygroundService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/playground/api/v1")
@AllArgsConstructor
public class PlaygroundController {
	private PlaygroundService playgroundService;
	private static final Logger log = LoggerFactory.getLogger(PlaygroundController.class);
	
	@PostMapping("/register")
	public ResponseEntity<Playground> saveReservation(@RequestBody Playground playground) {
		Playground newPlayground = playgroundService.savePlayground(playground);
		
		return ResponseEntity.ok().body(newPlayground);
	}
	
	@GetMapping("/playgroundList")
	public ResponseEntity<List<Playground>> findAllPersonalMember() {
		
		return ResponseEntity.ok().body(playgroundService.findAllPlayground());                                    
	}
	
	@GetMapping("/playground/{playgroundId}")
	public ResponseEntity<Playground> findPlayground(@PathVariable("playgroundId") final Long playgroundId) {
		log.info(playgroundId.toString());
		return ResponseEntity.ok().body(playgroundService.findById(playgroundId));                                    
	}
	
	@GetMapping("/playgroundList/{corporateId}")
	public ResponseEntity<List<Playground>> getPlaygroundByCorporateId(@PathVariable("corporateId") final Long corporateId)
	{
		try {
			
			Optional<List<Playground>> myPlayground = Optional.of(playgroundService.findByCorporateId(corporateId));
		
			return new ResponseEntity<List<Playground>>(myPlayground.get(), HttpStatus.OK);
			
		}catch(Exception e)
		{
			log.error(e.getMessage(), e);
			return new ResponseEntity<List<Playground>>(HttpStatus.NOT_FOUND);
		}
	}
}
