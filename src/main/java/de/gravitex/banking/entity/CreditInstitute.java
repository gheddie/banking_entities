package de.gravitex.banking.entity;

import de.gravitex.banking.entity.annotation.Creatable;
import de.gravitex.banking.entity.annotation.PresentMe;
import de.gravitex.banking.entity.base.IdEntity;
import de.gravitex.banking.enumerated.ImportType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
@Entity
@Creatable
public class CreditInstitute extends IdEntity {

	@PresentMe(order = 0, filterMe = true)
	@Column(nullable = false)
	private String name;
	
	@PresentMe(order = 10, filterMe = true)
	@Column(nullable = false, unique = true)
	private String bic;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private ImportType importType;
	
	public String toString() {
		return name + " ("+bic+")";
	}
}