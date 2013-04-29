/**
 * @Copyright 2013 Camp Mobile Corp.
 */
package com.campmobile.model;

import java.util.List;

import com.campmobile.model.dnd.DragSource;
import com.campmobile.model.dnd.DropTarget;

/**
 * @author Sungju Kwon
 *
 */
public abstract class PageGroup implements DragSource, DropTarget {
	private int currentPage;
	private int maxPageCount;
	private List<Page> pageList;

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getMaxPageCount() {
		return maxPageCount;
	}

	public void setMaxPageCount(int maxPageCount) {
		this.maxPageCount = maxPageCount;
	}

	public List<Page> getPageList() {
		return pageList;
	}

	public void setPageList(List<Page> pageList) {
		this.pageList = pageList;
	}

	public void addPage(Page page) {
		pageList.add(page);
	}

	public void removePage(Page page) {
		pageList.remove(page);
	}

	public void addItem(ItemInfo item) {
		pageList.get(getCurrentPage()).addItem(item);
	};

	public void removeItem(ItemInfo item) {
		pageList.get(getCurrentPage()).removeItem(item);
	};

	@Override
	public void onDropCompleted(ItemInfo itemInfo) {
		removeItem(itemInfo);
	}

	@Override
	public void onDragOver(ItemInfo itemInfo) {
		// do nothing
	}

	@Override
	public void onDrop(ItemInfo itemInfo) {
		addItem(itemInfo);
	}

	@Override
	public void onDragExit(ItemInfo itemInfo) {
		// do nothing
	}

	@Override
	public boolean isDropEnabled() {
		// always enable
		return true;
	}

	@Override
	public boolean acceptDrop(ItemInfo itemInfo) {
		return true;
	}
}
