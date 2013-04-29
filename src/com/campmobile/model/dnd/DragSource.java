/**
 * @Copyright 2013 Camp Mobile Corp.
 */
package com.campmobile.model.dnd;

import com.campmobile.model.ItemInfo;

/**
 * @author Sungju Kwon
 *
 */
public interface DragSource {
	public void onDropCompleted(ItemInfo itemInfo);
}
