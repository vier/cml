/**
 * @Copyright 2013 Camp Mobile Corp.
 */
package com.campmobile.model;

import android.graphics.Bitmap;

/**
 * @author Sungju Kwon
 *
 */
public class ItemInfo {
	private int id;
	private int parentId;
	private int itemType;
	private int x;
	private int y;
	private int width;
	private int height;
	private Bitmap iconBitmap;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public int getItemType() {
		return itemType;
	}

	public void setItemType(int itemType) {
		this.itemType = itemType;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Bitmap getIconBitmap() {
		return iconBitmap;
	}

	public void setIconBitmap(Bitmap iconBitmap) {
		this.iconBitmap = iconBitmap;
	}
}
