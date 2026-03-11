package de.gravitex.banking.entity;

import de.gravitex.banking.entity.annotation.PresentMe;
import de.gravitex.banking.entity.base.IdEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class TradingPartner extends IdEntity {

	@PresentMe(sortMe = true, order = 10, filterMe = true)
	@Column(nullable = false)
	private String tradingKey;
	
	@PresentMe(order = 20)
	@ManyToOne
	private PurposeCategory purposeCategory;
	
	@PresentMe(order = 30)
	@ManyToOne
	private RecurringPosition recurringPosition;
	
	public String toString() {
		return tradingKey;		
	}
}