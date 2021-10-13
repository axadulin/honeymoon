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
import onlyup.crud.honeymoon.adapters.OrdersHistoryAdapter;
import onlyup.crud.honeymoon.adapters.PaymentHistoryAdapter;
import onlyup.crud.honeymoon.model.OrdersHistory;
import onlyup.crud.honeymoon.model.PaymentHistory;

public class OrderHistoryActivity extends AppCompatActivity {
    RecyclerView rvOrders;
    ArrayList<OrdersHistory> ordersHistoryList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_history);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        rvOrders = (RecyclerView) findViewById(R.id.rvOrders);
        // создаем адаптер
        OrdersHistoryAdapter adapter = new OrdersHistoryAdapter(getApplicationContext(), ordersHistoryList);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        rvOrders.setLayoutManager(layoutManager);

        // устанавливаем для списка адаптер
        rvOrders.setAdapter(adapter);
        rvOrders.setHasFixedSize(true);
        setInitialData();
    }
    private void setInitialData(){

        ordersHistoryList.add(new OrdersHistory ("Mijoz 1", "20.01.2021","12 540 000","15:25:00"));
        ordersHistoryList.add(new OrdersHistory ("Mijoz 1", "20.01.2021","12 540 000","15:25:00"));
        ordersHistoryList.add(new OrdersHistory ("Mijoz 1", "20.01.2021","12 540 000","15:25:00"));
        ordersHistoryList.add(new OrdersHistory ("Mijoz 1", "20.01.2021","12 540 000","15:25:00"));
        ordersHistoryList.add(new OrdersHistory ("Mijoz 1", "20.01.2021","12 540 000","15:25:00"));
        ordersHistoryList.add(new OrdersHistory ("Mijoz 1", "20.01.2021","12 540 000","15:25:00"));


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