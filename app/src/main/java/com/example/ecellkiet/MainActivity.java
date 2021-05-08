package com.example.ecellkiet;
import androidx.appcompat.app.AppCompatActivity;

import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity {

    private CardView events;
    private CardView team;
    private CardView initiatives;
    private CardView gallery;
    private CardView about;
    private CardView contact;
    private CircleImageView ecell;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        events = (CardView) findViewById(R.id.events);
        team = (CardView) findViewById(R.id.team);
        initiatives = (CardView) findViewById(R.id.initiatives);
        gallery = (CardView) findViewById(R.id.gallery);
        about = (CardView) findViewById(R.id.about);
        contact = (CardView) findViewById(R.id.contact);
      //  ecell = (CircleImageView) findViewById(R.id.ecellkiet);

        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, events.class);
                startActivity(i);
            }
        });
        team.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, team.class);
                startActivity(i);
            }
        });
        initiatives.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Initiatives.class);
                startActivity(i);
            }
        });
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Gallery.class);
                startActivity(i);
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AboutUs.class);
                startActivity(i);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ContactUs.class);
                startActivity(i);
            }
        });



    }
}