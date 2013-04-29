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
public abstract class Page extends ItemInfo implements DragSource, DropTarget {
	private List<ItemInfo> itemList;
	private int cellCountX;
	private int cellCountY;

	public List<ItemInfo> getItemList() {
		return itemList;
	}

	public void setItemList(List<ItemInfo> itemList) {
		this.itemList = itemList;
	}

	public int getMaxItemCount() {
		return cellCountX * cellCountY;
	}

	public int getCellCountX() {
		return cellCountX;
	}

	public void setCellCountX(int cellCountX) {
		this.cellCountX = cellCountX;
	}

	public int getCellCountY() {
		return cellCountY;
	}

	public void setCellCountY(int cellCountY) {
		this.cellCountY = cellCountY;
	}

	public void addItem(ItemInfo item) {
		itemList.add(item);
	};

	public void removeItem(ItemInfo item) {
		itemList.remove(item);
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
		// always true
		return true;
	}

	@Override
	public boolean acceptDrop(ItemInfo itemInfo) {
		// always true?
		return true;
	}
}
