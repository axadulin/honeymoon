package onlyup.crud.honeymoon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
<<<<<<< HEAD
=======
import android.widget.ImageButton;
import android.widget.ImageView;
>>>>>>> 9d3b8c4 (Second one)

import com.google.android.material.navigation.NavigationView;

import onlyup.crud.honeymoon.activities.ClientsActivity;
import onlyup.crud.honeymoon.activities.NasiyalarActivity;
import onlyup.crud.honeymoon.activities.TopshiruvActivity;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {
    DrawerLayout drawerLayout;
<<<<<<< HEAD
=======
    ImageView imgMenu;
>>>>>>> 9d3b8c4 (Second one)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

<<<<<<< HEAD
=======
        imgMenu=findViewById(R.id.imgMenu);
>>>>>>> 9d3b8c4 (Second one)

        findViewById(R.id.drawer_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // open right drawer
                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.openDrawer(GravityCompat.END);
            }
        });





        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.inflateHeaderView(R.layout.nav_header_main);
        View headerView = navigationView.getHeaderView(0);

        navigationView.setNavigationItemSelectedListener(this);




//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//        drawerLayout.setDrawerListener(toggle);
//        drawerLayout.addDrawerListener(toggle);
//        toggle.syncState();
//        if (drawerLayout.isDrawerVisible(GravityCompat.END)) {
//            drawerLayout.closeDrawer(GravityCompat.END);
//        } else {
//            drawerLayout.openDrawer(GravityCompat.END);
//        }
    }

    @Override
    public void onClick(View view) {
<<<<<<< HEAD

=======
        switch (view.getId()){
            case R.id.imgMenu:
                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.openDrawer(GravityCompat.END);
                break;
        }
>>>>>>> 9d3b8c4 (Second one)
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();


        if (id == R.id.nav_chart) {
            finishAffinity();
            Intent marketIntent=new Intent(MainActivity.this,MainActivity.class);
            marketIntent.addFlags( Intent.FLAG_ACTIVITY_NEW_TASK );
            marketIntent.addFlags( Intent.FLAG_FROM_BACKGROUND);
            startActivity(marketIntent);
        }else if (id == R.id.nav_clients) {
            finishAffinity();
            Intent myProducts=new Intent(MainActivity.this, ClientsActivity.class);
            myProducts.addFlags( Intent.FLAG_ACTIVITY_NEW_TASK);
            myProducts.addFlags( Intent.FLAG_FROM_BACKGROUND);
            startActivity(myProducts);
        }else if (id == R.id.nav_topshiruv) {
            finishAffinity();
            Intent myProducts=new Intent(MainActivity.this, TopshiruvActivity.class);
            myProducts.addFlags( Intent.FLAG_ACTIVITY_NEW_TASK );
            myProducts.addFlags( Intent.FLAG_FROM_BACKGROUND);
            startActivity(myProducts);
        }


        else if (id == R.id.nav_leasing) {
            finishAffinity();
            Intent transportIntent=new Intent(MainActivity.this, NasiyalarActivity.class);
            transportIntent.addFlags( Intent.FLAG_ACTIVITY_NEW_TASK );
            transportIntent.addFlags( Intent.FLAG_FROM_BACKGROUND);
            startActivity(transportIntent);


        }  else if (id == R.id.nav_profile) {
            //startActivity(new Intent(getApplicationContext(), AboutActivity.class));
        } else if (id == R.id.nav_about) {
            startActivity(new Intent(getApplicationContext(), LoginActivity.class));
        }else if (id == R.id.nav_exit) {





        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.END);
        return true;
    }

}