/**
 * @Copyright 2013 Camp Mobile Corp.
 */
package com.campmobile.model;

/**
 * @author Sungju Kwon
 *
 */
public class GridPage extends Page {
	private int[][] occupied;

	public int[] findVacnatArea(ItemInfo itemInfo) {
		return null;
	}

	@Override
	public boolean acceptDrop(ItemInfo itemInfo) {
		// 자리가 있으면 true 아니면 false
		if (findVacnatArea(itemInfo) != null) {
			return true;
		}
		return false;
	}
}
