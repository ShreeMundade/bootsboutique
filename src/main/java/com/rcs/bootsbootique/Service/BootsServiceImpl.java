package com.rcs.bootsbootique.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rcs.bootsbootique.Impl.IBootsService;
import com.rcs.bootsbootique.entities.Boot;
import com.rcs.bootsbootique.repositories.BootRepository;

@Service
public class BootsServiceImpl implements IBootsService {
	@Autowired
	private BootRepository bootRepo;
	
	@Override
	public List<Boot>getAllBoots(){
		List<Boot> bootsList=bootRepo.findAll();
		return bootsList;
	}
	
	@Override
	public Boot addBoot(Boot boot) {
		return bootRepo.saveAndFlush(boot);
	}
	
	

}
