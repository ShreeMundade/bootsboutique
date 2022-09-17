package com.rcs.bootsbootique.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rcs.bootsbootique.entities.Boot;

@Service
public interface IBootsService {

	public Boot addBoot(Boot boot);

	public List<Boot> getAllBoots();
	

}


