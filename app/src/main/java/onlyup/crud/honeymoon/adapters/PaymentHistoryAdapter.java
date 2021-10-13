package onlyup.crud.honeymoon.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import onlyup.crud.honeymoon.R;
import onlyup.crud.honeymoon.activities.ClientDetailsActivity;
import onlyup.crud.honeymoon.activities.EditClientActivity;
import onlyup.crud.honeymoon.model.Clients;
import onlyup.crud.honeymoon.model.PaymentHistory;

public class PaymentHistoryAdapter extends RecyclerView.Adapter<PaymentHistoryAdapter.ClientViewHolder>{
    private final LayoutInflater inflater;
    private final List<PaymentHistory> paymentData;
    private Context mCtx;
    public PaymentHistoryAdapter(Context context, List<PaymentHistory> paymentData) {

        this.paymentData = paymentData;
        this.inflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public ClientViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.rv_item_payment, parent, false);

        return new ClientViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ClientViewHolder holder, int position) {
        PaymentHistory paymentHistory = paymentData.get(position);

        holder.txtPaymentClient.setText(paymentHistory.getClientName());
        holder.txtPaymentSumma.setText(paymentHistory.getClientSumma());
        holder.txtPaymentDate.setText(paymentHistory.getClientDate());
    }

    @Override
    public int getItemCount() {
        return paymentData.size();
    }


    public static class ClientViewHolder extends RecyclerView.ViewHolder  {

        final TextView txtPaymentClient, txtPaymentSumma,txtPaymentDate;
        ClientViewHolder(View view){
            super(view);
            txtPaymentClient = (TextView) view.findViewById(R.id.txtPaymentClient);
            txtPaymentSumma = (TextView) view.findViewById(R.id.txtPaymentSumma);
            txtPaymentDate = (TextView) view.findViewById(R.id.txtPaymentDate);

        }


        }

    }

