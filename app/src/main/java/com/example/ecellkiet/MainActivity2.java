package com.example.ecellkiet;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity2 extends AppCompatActivity {
    BottomNavigationView bottomBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_this);
        final Home_fragment home=new Home_fragment();
        final GalleryFrag gallery=new GalleryFrag();
        final AboutFragment about=new AboutFragment();
        final TeamFragment team=new TeamFragment();
        setFragment( home );

        bottomBar = findViewById(R.id.bottomBar);

        bottomBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();
                if(id==R.id.home){

                    setFragment( home );
                    return true;
                }
                if(id==R.id.gallery){

                    setFragment( gallery );
                    return true;
                }
                if(id==R.id.about){

                    setFragment( about );
                    return true;
                }
                if(id==R.id.team){

                    setFragment( team );
                    return true;
                }
               // Toast.makeText(MainActivity2.this, item.getTitle(), Toast.LENGTH_SHORT).show();

                return true;
            }
        });
    }
    private synchronized void setFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace( R.id.frame,fragment );

        fragmentTransaction.commitNow();

    }
}