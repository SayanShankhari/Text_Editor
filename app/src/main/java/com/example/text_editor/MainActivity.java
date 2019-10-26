package com.example.text_editor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main_menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		switch (id) {
			case R.id.menu_home:
				Toast.makeText(this, "Menu_Home", Toast.LENGTH_SHORT).show();
				break;
			case R.id.menu_settings:
				Toast.makeText(this, "Menu_Settings", Toast.LENGTH_SHORT).show();
				break;
			case R.id.menu_about:
				Toast.makeText(this, "Menu_About", Toast.LENGTH_SHORT).show();
				break;
			case R.id.menu_contact:
				Toast.makeText(this, "Menu_Contact", Toast.LENGTH_SHORT).show();
				break;
			case R.id.menu_share:
				Toast.makeText(this, "Menu_Share", Toast.LENGTH_SHORT).show();
				break;
			case R.id.menu_open:
				Toast.makeText(this, "Menu_Open", Toast.LENGTH_SHORT).show();
				openFile();
				break;
			case R.id.menu_save:
				Toast.makeText(this, "Menu_Save", Toast.LENGTH_SHORT).show();
				saveFile();
				break;
			default:
				break;
		}
		return super.onOptionsItemSelected(item);
	}

	public void openFile() {

	}

	public void saveFile() {

	}
}