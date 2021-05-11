package com.example.ecellkiet;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.Toolbar;

import android.content.ClipData;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ActionMenuView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import static android.content.ClipData.*;

public class events extends AppCompatActivity {




    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);



        ActionMenuItemView home = (ActionMenuItemView) findViewById(R.id.home);
        ActionMenuItemView account =(ActionMenuItemView) findViewById(R.id.account);
        ActionMenuItemView exit = (ActionMenuItemView) findViewById(R.id.exit);
        ActionMenuItemView help = (ActionMenuItemView)  findViewById(R.id.help);


        home.setOnCreateContextMenuListener(new ActionMenuItemView.OnCreateContextMenuListener() {
            @Override
            public void onCreateContextMenu(ContextMenu menu,View v,ContextMenu.ContextMenuInfo menuInfo) {
//                Toast toast = Toast.makeText(getApplicationContext(), "Simple Toast In Android", Toast.LENGTH_LONG); // initiate the Toast with context, message and duration for the Toast
//                toast.show();
            }
        });
    }

//    MenuItem home;
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.bottom_menu, menu);
//        home = menu.findItem(R.id.home);
//        return super.onCreateOptionsMenu(menu);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem home) {
//        switch (home.getItemId()) {
//            case home :
//                Toast.makeText(getApplicationContext(),"Home Clicked",Toast.LENGTH_SHORT).show();
//                break;
//            default:
//                throw new IllegalStateException("Unexpected value: " + home.getItemId());break;
//        }
//        return super.onOptionsItemSelected(home);
//    }
//                Toast.makeText(getApplicationContext(),"Home Clicked",Toast.LENGTH_SHORT).show();

}//ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo