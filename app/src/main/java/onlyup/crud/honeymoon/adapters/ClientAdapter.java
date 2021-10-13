package onlyup.crud.honeymoon.adapters;

import android.content.Context;
<<<<<<< HEAD
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
=======
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
>>>>>>> 9d3b8c4 (Second one)
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import onlyup.crud.honeymoon.R;
<<<<<<< HEAD
import onlyup.crud.honeymoon.model.Clients;

public class ClientAdapter extends RecyclerView.Adapter<ClientAdapter.ViewHolder>{
    private final LayoutInflater inflater;
    private final List<Clients> clientsData;

=======
import onlyup.crud.honeymoon.activities.ClientDetailsActivity;
import onlyup.crud.honeymoon.activities.EditClientActivity;
import onlyup.crud.honeymoon.model.Clients;

public class ClientAdapter extends RecyclerView.Adapter<ClientAdapter.ClientViewHolder>{
    private final LayoutInflater inflater;
    private final List<Clients> clientsData;
    private Context mCtx;
>>>>>>> 9d3b8c4 (Second one)
    public ClientAdapter(Context context, List<Clients> clientsData) {

        this.clientsData = clientsData;
        this.inflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
<<<<<<< HEAD
    public ClientAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.rv_item_clients, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ClientAdapter.ViewHolder holder, int position) {
=======
    public ClientViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.rv_item_clients, parent, false);

        return new ClientViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ClientViewHolder holder, int position) {
>>>>>>> 9d3b8c4 (Second one)
        Clients clients = clientsData.get(position);

        holder.txtClientName.setText(clients.getClientName());
        holder.txtClientPhone.setText(clients.getPhoneNumber());
    }

    @Override
    public int getItemCount() {
        return clientsData.size();
    }
<<<<<<< HEAD
    public static class ViewHolder extends RecyclerView.ViewHolder {

        final TextView txtClientName, txtClientPhone;
        ViewHolder(View view){
            super(view);
            txtClientName = (TextView) view.findViewById(R.id.txtClientName);
            txtClientPhone = (TextView) view.findViewById(R.id.txtClientPhone);
        }
=======


    public static class ClientViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public Button btnReturn, btnDetail;
        public  ImageButton btnEdit;
        final TextView txtClientName, txtClientPhone;
        ClientViewHolder(View view){
            super(view);
            txtClientName = (TextView) view.findViewById(R.id.txtClientName);
            txtClientPhone = (TextView) view.findViewById(R.id.txtClientPhone);
            btnReturn=view.findViewById(R.id.btnReturn);
            btnDetail=view.findViewById(R.id.btnDetail);
            btnEdit=view.findViewById(R.id.btnEdit);
             btnEdit.setOnClickListener(this);
            btnReturn.setOnClickListener(this);
            btnDetail.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            switch (view.getId()){
            case R.id.btnEdit:
                Intent btnEditIntent = new Intent(view.getContext(), EditClientActivity.class);
                btnEditIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                view.getContext().startActivity(btnEditIntent);
                break;
                case R.id.btnDetail:
                    Intent btnDetailIntent = new Intent(view.getContext(), ClientDetailsActivity.class);
                    btnDetailIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    view.getContext().startActivity(btnDetailIntent);
                    break;

            }
        }

>>>>>>> 9d3b8c4 (Second one)
    }
}
