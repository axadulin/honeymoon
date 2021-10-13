package onlyup.crud.honeymoon.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import onlyup.crud.honeymoon.MainActivity;
import onlyup.crud.honeymoon.R;
import onlyup.crud.honeymoon.adapters.ClientAdapter;
import onlyup.crud.honeymoon.model.Clients;

public class ClientsActivity extends AppCompatActivity implements View.OnClickListener {
<<<<<<< HEAD
    Button btnReturn, btnDetail;
    ImageButton btnEdit;
=======

>>>>>>> 9d3b8c4 (Second one)
    FloatingActionButton addFab;
    ArrayList<Clients> clientsArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clients);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
<<<<<<< HEAD
        btnEdit=findViewById(R.id.btnEdit);
        btnReturn= findViewById(R.id.btnReturn);
        btnDetail= findViewById(R.id.btnDetail);
=======

>>>>>>> 9d3b8c4 (Second one)
        addFab= findViewById(R.id.add_fab);

        addFab.setOnClickListener(this);
        RecyclerView rvClients = (RecyclerView) findViewById(R.id.rvClients);
        // создаем адаптер
        ClientAdapter adapter = new ClientAdapter(getApplicationContext(), clientsArrayList);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        rvClients.setLayoutManager(layoutManager);
<<<<<<< HEAD
=======

>>>>>>> 9d3b8c4 (Second one)
        // устанавливаем для списка адаптер
        rvClients.setAdapter(adapter);
        rvClients.setHasFixedSize(true);
        setInitialData();
<<<<<<< HEAD
=======
       /// btnEdit=findViewById(R.id.btnEdit);


>>>>>>> 9d3b8c4 (Second one)

    }

    private void setInitialData(){

        clientsArrayList.add(new Clients ("Mijoz 1", "+998 97 957 55 55"));
        clientsArrayList.add(new Clients ("Mijoz 2", "+998 97 454 45 54"));
        clientsArrayList.add(new Clients ("Mijoz 3", "+998 97 454 45 54"));
        clientsArrayList.add(new Clients ("Mijoz 4", "+998 97 454 45 54"));

    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, MainActivity.class));
    }


    @Override
    public void onClick(View view) {
<<<<<<< HEAD
        btnEdit.setOnClickListener(this);
        btnReturn.setOnClickListener(this);
        btnDetail.setOnClickListener(this);
        switch (view.getId()){
            case R.id.btnEdit:
                startActivity(new Intent(getApplicationContext(), EditClientActivity.class));
                break;
=======

        switch (view.getId()){
//            case R.id.btnEdit:
//                startActivity(new Intent(getApplicationContext(), EditClientActivity.class));
//                break;
>>>>>>> 9d3b8c4 (Second one)
            case R.id.add_fab:
                startActivity(new Intent(getApplicationContext(), AddClientActivity.class));
                break;

        }
    }
}