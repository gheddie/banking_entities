package de.gravitex.banking.entity;

import de.gravitex.banking.entity.base.IdEntity;
import de.gravitex.banking.enumerated.RecurringInterval;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
@Entity
public class RecurringPosition extends IdEntity {

	@Column(nullable = false)
	private boolean incoming;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private RecurringInterval recurringInterval;
	
	public String toString() {
		if (incoming) {
			return "Eingehend ("+recurringInterval.name()+")";
		} else {
			return "Ausgehend ("+recurringInterval.name()+")";
		}
	}
}