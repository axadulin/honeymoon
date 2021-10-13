package onlyup.crud.honeymoon.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

import onlyup.crud.honeymoon.MainActivity;
import onlyup.crud.honeymoon.R;
import onlyup.crud.honeymoon.adapters.ClientAdapter;
import onlyup.crud.honeymoon.adapters.PaymentHistoryAdapter;
import onlyup.crud.honeymoon.model.Clients;
import onlyup.crud.honeymoon.model.PaymentHistory;

public class PaymentHistoryActivity extends AppCompatActivity {
    RecyclerView rvPayment;
    ArrayList<PaymentHistory> paymentHistoryList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_history);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        rvPayment = (RecyclerView) findViewById(R.id.rvPayment);
        // создаем адаптер
        PaymentHistoryAdapter adapter = new PaymentHistoryAdapter(getApplicationContext(), paymentHistoryList);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        rvPayment.setLayoutManager(layoutManager);

        // устанавливаем для списка адаптер
        rvPayment.setAdapter(adapter);
        rvPayment.setHasFixedSize(true);
        setInitialData();
    }
    private void setInitialData(){

        paymentHistoryList.add(new PaymentHistory ("Mijoz 1", "20.01.2021","12 540 000"));
        paymentHistoryList.add(new PaymentHistory ("Mijoz 1", "20.01.2021","12 540 000"));
        paymentHistoryList.add(new PaymentHistory ("Mijoz 1", "20.01.2021","12 540 000"));
        paymentHistoryList.add(new PaymentHistory ("Mijoz 1", "20.01.2021","12 540 000"));
        paymentHistoryList.add(new PaymentHistory ("Mijoz 1", "20.01.2021","12 540 000"));
        paymentHistoryList.add(new PaymentHistory ("Mijoz 1", "20.01.2021","12 540 000"));
        paymentHistoryList.add(new PaymentHistory ("Mijoz 1", "20.01.2021","12 540 000"));


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

}