package de.gravitex.banking.entity.util;

public interface HierarchyItem {

	boolean isTopLevel();

	String getHierarchyKey();

	boolean isMyChild(HierarchyItem aHierarchyItem);

	String getDescription();

	HierarchyItem getParentItem();
}