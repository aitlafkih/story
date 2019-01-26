package com.boot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.Metier.Pok;

@RestController
@RequestMapping("api/v1")
public class PokController {
	
	@RequestMapping(value="poks",method=RequestMethod.GET)
	public List<Pok> getPoks(){
		ArrayList<Pok> reference = new ArrayList<Pok>();
		Pok pok1 = new Pok(1,"amine");
		Pok pok2 = new Pok(2,"aitlafkih");
		reference.add(pok1);
		reference.add(pok2);
		return reference;
		
	}

}
