package onlyup.crud.honeymoon.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import onlyup.crud.honeymoon.R;
import onlyup.crud.honeymoon.model.OrdersHistory;
import onlyup.crud.honeymoon.model.PaymentHistory;

public class OrdersHistoryAdapter extends RecyclerView.Adapter<OrdersHistoryAdapter.ClientViewHolder>{
    private final LayoutInflater inflater;
    private final List<OrdersHistory> ordersData;
    private Context mCtx;
    public OrdersHistoryAdapter(Context context, List<OrdersHistory> ordersData) {

        this.ordersData = ordersData;
        this.inflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public ClientViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.rv_item_orders, parent, false);

        return new ClientViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ClientViewHolder holder, int position) {
        OrdersHistory ordersHistory = ordersData.get(position);

        holder.txtPaymentClient.setText(ordersHistory.getClientName());
        holder.txtPaymentSumma.setText(ordersHistory.getClientSumma());
        holder.txtPaymentDate.setText(ordersHistory.getClientDate());
        holder.txtPaymentTime.setText(ordersHistory.getClientTime());
    }

    @Override
    public int getItemCount() {
        return ordersData.size();
    }


    public static class ClientViewHolder extends RecyclerView.ViewHolder  {

        final TextView txtPaymentClient, txtPaymentSumma,txtPaymentDate,txtPaymentTime;
        ClientViewHolder(View view){
            super(view);
            txtPaymentClient = (TextView) view.findViewById(R.id.txtPaymentClient);
            txtPaymentSumma = (TextView) view.findViewById(R.id.txtPaymentSumma);
            txtPaymentDate = (TextView) view.findViewById(R.id.txtPaymentDate);
            txtPaymentTime = (TextView) view.findViewById(R.id.txtPaymentTime);

        }


        }

    }

