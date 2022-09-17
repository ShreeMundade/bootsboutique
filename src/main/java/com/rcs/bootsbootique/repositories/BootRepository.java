package com.rcs.bootsbootique.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rcs.bootsbootique.entities.Boot;


public interface BootRepository extends JpaRepository<Boot, Integer> {

	//List<Boot> findBootByType(Boot bootType);

	
//	@Query(value = "select s.fee from Student s where s.id = ?1")
//	public List<Fee> retrieveFeeByStudentId(long id);
//	@Query(value = "select s.fee from Student s where s.username = ?1")
//	public Fee retrieveFeesByStudentName(String name);
//	@Query(value = "select p from Parent p join Student s where  s.id = id")
//	public Parent retrieveParentByStudentId(long id);
//	List<Boot> findBootByMaterialTypeSizeAndQuantity(String material, BootType type, Integer size, Integer minQuantity);
//  List<Boot> findBootBy_Material_Type_Size(String material, BootType type, Integer size);
//	List<Boot> findBootBy_Material_Type(String material, BootType type);
//	List<Boot> findBootByMaterial(String material);



}
