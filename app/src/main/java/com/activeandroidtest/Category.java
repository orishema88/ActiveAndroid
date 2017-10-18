package com.activeandroidtest;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

/**
 * Created by orishema on 09/10/2017.
 */

@Table(name = "Categories")
public class Category extends Model {
	@Column(name = "Name")
	public String name;

	public static Category getRandom(){
		return new Select().from(Category.class).where("name = ?").executeSingle();
	}
}