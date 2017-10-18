package com.activeandroidtest;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by orishema on 09/10/2017.
 */

@Table(name = "Items")
public class Item extends Model {
	@Column(name = "Name")
	public String name;

	@Column(name = "Category")
	public Category category;
}
