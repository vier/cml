/**
 * @Copyright 2013 Camp Mobile Corp.
 */
package com.campmobile.model;

import java.util.List;

/**
 * @author Sungju Kwon
 *
 */
public class SortablePageGroup extends PageGroup {
	protected List<ItemInfo> itemList;
	private List<Page> pageList;

	public List<ItemInfo> getItemList() {
		return itemList;
	}

	public void setItemList(List<ItemInfo> itemList) {
		this.itemList = itemList;
	}

	public void addItem(ItemInfo item) {
		itemList.add(item);
	};

	public void removeItem(ItemInfo item) {
		itemList.remove(item);
	};

	public List<Page> getPageList() {
		return pageList;
	}

	public void setPageList(List<Page> pageList) {
		this.pageList = pageList;
	}

	public void sort() {
	}

	public void onDropCompleted(SortablePage sortablePage, ItemInfo itemInfo) {
		// TODO Auto-generated method stub

	}

	public void onDropOnPage(SortablePage sortablePage, ItemInfo itemInfo) {
		// TODO Auto-generated method stub

	}

	public void onDragExitOnPage(SortablePage sortablePage, ItemInfo itemInfo) {
		// TODO Auto-generated method stub

	}

	public boolean acceptDropOnPage(SortablePage sortablePage, ItemInfo itemInfo) {
		// TODO Auto-generated method stub
		return false;
	}
}
