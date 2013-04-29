/**
 * @Copyright 2013 Camp Mobile Corp.
 */
package com.campmobile.model;

/**
 * @author Sungju Kwon
 *
 */
public class SortablePage extends Page {
	// D&D 시 parent 를 알아야만 함; 
	SortablePageGroup sortablePageGroup;

	public void sort() {
	}

	@Override
	public void onDropCompleted(ItemInfo itemInfo) {
		sortablePageGroup.onDropCompleted(this, itemInfo);
	}

	@Override
	public void onDrop(ItemInfo itemInfo) {
		sortablePageGroup.onDropOnPage(this, itemInfo);
	}

	@Override
	public void onDragExit(ItemInfo itemInfo) {
		sortablePageGroup.onDragExitOnPage(this, itemInfo);
	}

	@Override
	public boolean isDropEnabled() {
		return sortablePageGroup.isDropEnabled();
	}

	@Override
	public boolean acceptDrop(ItemInfo itemInfo) {
		return sortablePageGroup.acceptDropOnPage(this, itemInfo);
	}
}
