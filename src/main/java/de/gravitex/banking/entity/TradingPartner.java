package de.gravitex.banking.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import de.gravitex.banking.entity.annotation.EnableEdit;
import de.gravitex.banking.entity.annotation.PresentMe;
import de.gravitex.banking.entity.annotation.util.EditType;
import de.gravitex.banking.entity.base.IdEntity;
import de.gravitex.banking.entity.util.HierarchyItem;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class TradingPartner extends IdEntity implements HierarchyItem {

	@PresentMe(sortMe = true, order = 10, filterMe = true)
	@Column(nullable = false)
	private String tradingKey;
	
	@PresentMe(order = 20)
	@ManyToOne
	private PurposeCategory purposeCategory;
	
	@OneToOne
	// @PresentMe(order = 15)
	@EnableEdit(type = EditType.NEVER)
	@JoinColumn(nullable = true)
	private TradingPartner parentTradingPartner;
	
	@PresentMe(order = 30)
	@ManyToOne
	private RecurringPosition recurringPosition;
	
	public String toString() {
		return tradingKey;		
	}

	@JsonIgnore
	@Override
	public boolean isTopLevel() {
		return (parentTradingPartner == null);
	}

	@JsonIgnore
	@Override
	public String getHierarchyKey() {
		return String.valueOf(getId());
	}

	@JsonIgnore
	@Override
	public boolean isMyChild(HierarchyItem aHierarchyItem) {
		return this.equals(((TradingPartner) aHierarchyItem).getParentTradingPartner());
	}

	@JsonIgnore
	@Override
	public String getDescription() {
		return tradingKey;
	}

	@JsonIgnore
	@Override
	public HierarchyItem getParentItem() {
		return parentTradingPartner;
	}
}