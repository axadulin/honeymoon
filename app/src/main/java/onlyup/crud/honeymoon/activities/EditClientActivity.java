package onlyup.crud.honeymoon.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

<<<<<<< HEAD
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

=======
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import onlyup.crud.honeymoon.MainActivity;
>>>>>>> 9d3b8c4 (Second one)
import onlyup.crud.honeymoon.R;

public class EditClientActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnAccept1,btnCancel1;
<<<<<<< HEAD
=======
    EditText edClientName1,edClientPhone1,edClientPhone2,edClientAddress1,edClientOrientir1;
    Spinner spinnerClientType1;
>>>>>>> 9d3b8c4 (Second one)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_client);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
<<<<<<< HEAD
        findViewById(R.id.btnAccept1);
        findViewById(R.id.btnCancel1);
=======
        btnAccept1=findViewById(R.id.btnAccept1);
        btnCancel1=findViewById(R.id.btnCancel1);
>>>>>>> 9d3b8c4 (Second one)
        btnAccept1.setOnClickListener(this);
        btnCancel1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
<<<<<<< HEAD
=======
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, ClientsActivity.class));
    }
>>>>>>> 9d3b8c4 (Second one)
}