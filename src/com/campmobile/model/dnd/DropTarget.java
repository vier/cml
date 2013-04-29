/**
 * @Copyright 2013 Camp Mobile Corp.
 */
package com.campmobile.model.dnd;

import com.campmobile.model.ItemInfo;

/**
 * @author Sungju Kwon
 *
 */
public interface DropTarget {
	public void onDragOver(ItemInfo itemInfo);

	public void onDrop(ItemInfo itemInfo);

	public void onDragExit(ItemInfo itemInfo);

	public boolean isDropEnabled();

	public boolean acceptDrop(ItemInfo itemInfo);
}
