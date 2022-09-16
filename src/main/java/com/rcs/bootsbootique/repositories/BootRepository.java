package com.rcs.bootsbootique.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rcs.bootsbootique.entities.Boot;

public interface BootRepository extends JpaRepository<Boot, Long> {
//
//	List<Boot> findBootByMaterialTypeSizeAndQuantity(String material, BootType type, Integer size, Integer minQuantity);
//	List<Boot> findBootBy_Material_Type_Size(String material, BootType type, Integer size);
//	List<Boot> findBootBy_Material_Type(String material, BootType type);
    List<Boot> findBootByMaterial(String material);
//	List<Boot> findBootByType( BootType type);
//	List<Boot> findBootByMaterialTypeSizeAndQuantity(String material, BootType type, Integer size, Integer minQuantity);
//	List<Boot> findBootByMaterialTypeSizeAndQuantity(String material, BootType type, Integer size, Integer minQuantity);

}
