package com.rcs.bootsbootique.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.rcs.bootsbootique.enums.BootType;

@Entity
@Table(name = "BOOT")
public class Boot {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bootId;
	private BootType bootType;
	private Float size;
	private Integer quantity;
	private String material;

	@Override
	public String toString() {
		return "Boot [bootId=" + bootId + ", bootType=" + bootType + ", size=" + size + ", quantity=" + quantity
				+ ", material=" + material + "]";
	}

	public Boot(Integer bootId, BootType bootType, Float size, Integer quantity, String material) {
		super();
		this.bootId = bootId;
		this.bootType = bootType;
		this.size = size;
		this.quantity = quantity;
		this.material = material;
	}

	public Integer getBootId() {
		return bootId;
	}

	public void setBootId(Integer bootId) {
		this.bootId = bootId;
	}

	public BootType getBootType() {
		return bootType;
	}

	public void setBootType(BootType bootType) {
		this.bootType = bootType;
	}

	public Float getSize() {
		return size;
	}

	public void setSize(Float size) {
		this.size = size;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Boot() {
		super();
		// TODO Auto-generated constructor stub
	}

}
