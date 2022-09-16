package com.rcs.bootsbootique.enums;

import com.fasterxml.jackson.annotation.JsonCreator;


public enum BootType {
	CHELSEA,
	 CHUKKA,
	 DRESS,
	 COWBOY,
	 GOGO,
	 RUSSIAN,
	 UGG,
	 RIGGER,
	 RAIN,
	 RACING,
	 MOTOCROSS,
	 WADER,
	 GALOSH,
	 SNOW,
	 TOURING;

	@JsonCreator
	public static BootType create(String value) {
		if (value == null) {
			return null;
		}
		for (BootType bootType : values()) {
			if (value.equals(bootType.toString())) {
				return bootType;
			}
		}
		return null;
	}

}
