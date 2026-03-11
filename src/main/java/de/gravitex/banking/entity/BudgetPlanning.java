package de.gravitex.banking.entity;

import java.util.List;

import de.gravitex.banking.entity.base.IdEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
// @Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "month", "year" }) })
public class BudgetPlanning extends IdEntity {

	private int planningMonth;
	
	private int planningYear;
	
	@OneToMany(mappedBy = "budgetPlanning")
	private List<BudgetPlanningItem> budgetPlanningItems;
}