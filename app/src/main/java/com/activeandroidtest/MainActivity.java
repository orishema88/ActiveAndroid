package com.activeandroidtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.activeandroid.ActiveAndroid;
import com.activeandroid.Configuration;


public class MainActivity
		extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.v("ORI","MainActivity.OnCreate");
//		setContentView(R.layout.activity_main);
//		Configuration dbConfiguration = new Configuration.Builder(this).setDatabaseName("xxx.db").addModelClass(Item.class).addModelClass(Category.class).create();
//		ActiveAndroid.initialize(dbConfiguration);
//		Category a = new Category();
//		a.name = "asdasd";
//		a.save();
//		Category.getRandom();
	}
}
