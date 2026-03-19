package de.gravitex.banking.entity;

import de.gravitex.banking.entity.base.IdEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class TradingPartnerBookingHistory extends IdEntity {

	@ManyToOne
	@JoinColumn(nullable = false)
	private Booking booking;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private TradingPartner tradingPartner;
}