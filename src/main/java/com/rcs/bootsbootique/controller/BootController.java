package com.rcs.bootsbootique.controller;
//yet pending
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rcs.bootsbootique.entities.Boot;
import com.rcs.bootsbootique.enums.BootType;
import com.rcs.bootsbootique.exceptions.NotImplementedException;
import com.rcs.bootsbootique.exceptions.QueryNotSupportedException;
import com.rcs.bootsbootique.repositories.BootRepository;

@RestController
@RequestMapping("/api/v1/boots")
public class BootController {

	@Autowired
	private BootRepository bootRepo;

	@GetMapping("/all")
	public Iterable<Boot> getAllBoots() {
		return bootRepo.findAll();

	}

	@GetMapping("/types")
	public List<BootType> getBootTypes() {
		return Arrays.asList(BootType.values());
	}

	@GetMapping("/{id}")
	public Boot getAllBoots(@PathVariable("id") Long id) {
		Optional<Boot> boot = bootRepo.findById(id);
		if (boot.isPresent()) {
			return boot.get();
		} else {
			throw new NotImplementedException("Don't have the ability to add boots to the inventory yet!");
		}

	}

	@PostMapping("/add")
	public Boot addBoot(@RequestBody Boot boot) {

		return bootRepo.saveAndFlush(boot);

	}

	@DeleteMapping("/{id}")
	public Boot deleteBoot(@PathVariable("id") Integer id) {
		throw new NotImplementedException("Don't have the ability to delete boots yet!");
	}

	@PutMapping("/{id}/quantity/increment")
	public Boot incrementQuantity(@PathVariable("id") Integer id) {
		throw new NotImplementedException("Don't have the ability to increment boot counts yet!");
	}

	@PutMapping("/{id}/quantity/decrement")
	public Boot decrementQuantity(@PathVariable("id") Integer id) {
		throw new NotImplementedException("Don't have the ability to decrement boot counts yet!");
	}

	@GetMapping("/search")
	public List<Boot> searchBoots(@RequestParam(required = false) String material,
			@RequestParam(required = false) BootType type, @RequestParam(required = false) Integer size,
			@RequestParam(required = false, name = "quantity") Integer minQuantity) throws QueryNotSupportedException {
		if (Objects.nonNull(material)) {
			if (Objects.nonNull(type) && Objects.nonNull(size) && Objects.nonNull(minQuantity)) {
			
				// call the repository method that accepts a material, type, size, and minimum
				// quantity
				throw new QueryNotSupportedException(
						"This query is not supported! Try a different combination of search parameters.");
			} else if (Objects.nonNull(type) && Objects.nonNull(size)) {
			
				// call the repository method that accepts a material, size, and type
				throw new QueryNotSupportedException(
						"This query is not supported! Try a different combination of search parameters.");
			} else if (Objects.nonNull(type) && Objects.nonNull(minQuantity)) {
				// call the repository method that accepts a material, a type, and a minimum
				// quantity
				throw new QueryNotSupportedException(
						"This query is not supported! Try a different combination of search parameters.");
			} else if (Objects.nonNull(type)) {
				
				// call the repository method that accepts a material and a type
				throw new QueryNotSupportedException(
						"This query is not supported! Try a different combination of search parameters.");
			} else {
				bootRepo.findBootByMaterial(material);
					
				// call the repository method that accepts only a material
				throw new QueryNotSupportedException(
						"This query is not supported! Try a different combination of search parameters.");
			}
		} else if (Objects.nonNull(type)) {
			if (Objects.nonNull(size) && Objects.nonNull(minQuantity)) {
				// call the repository method that accepts a type, size, and minimum quantity
				throw new QueryNotSupportedException(
						"This query is not supported! Try a different combination of search parameters.");
			} else if (Objects.nonNull(size)) {
				// call the repository method that accepts a type and a size
				throw new QueryNotSupportedException(
						"This query is not supported! Try a different combination of search parameters.");
			} else if (Objects.nonNull(minQuantity)) {
				// call the repository method that accepts a type and a minimum quantity
				throw new QueryNotSupportedException(
						"This query is not supported! Try a different combination of search parameters.");
			} else {
				// call the repository method that accept only a type
				throw new QueryNotSupportedException(
						"This query is not supported! Try a different combination of search parameters.");
			}
		} else if (Objects.nonNull(size)) {
			if (Objects.nonNull(minQuantity)) {
				// call the repository method that accepts a size and a minimum quantity
				throw new QueryNotSupportedException(
						"This query is not supported! Try a different combination of search parameters.");
			} else {
				// call the repository method that accepts only a size
				throw new QueryNotSupportedException(
						"This query is not supported! Try a different combination of search parameters.");
			}
		} else if (Objects.nonNull(minQuantity)) {
			// call the repository method that accepts only a minimum quantity
			throw new QueryNotSupportedException(
					"This query is not supported! Try a different combination of search parameters.");
		} else {
			throw new QueryNotSupportedException(
					"This query is not supported! Try a different combination of search parameters.");
		}
	}

}