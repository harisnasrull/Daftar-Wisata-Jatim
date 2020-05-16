package com.example.submissionwisatajatim;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class KabupatenAdapter extends RecyclerView.Adapter<KabupatenAdapter.ListViewHolder> {
    private Context context;
    private ArrayList<Kabupaten> listkab;

    KabupatenAdapter(Context context, ArrayList<Kabupaten> listkab){
        this.context = context;
        this.listkab = listkab;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_kabupaten,viewGroup,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Kabupaten kabupaten = listkab.get(position);
        Glide.with(holder.itemView.getContext())
                .load(kabupaten.getLogo())
                .apply(new RequestOptions().override(60,60))
                .into(holder.imgLogo);
        holder.tvNama.setText(kabupaten.getNama());
        holder.tvJenis.setText(kabupaten.getJenis());
        holder.listlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,Detail.class);
                intent.putExtra(Detail.EXTRA_NAME,kabupaten.getNama());
                intent.putExtra(Detail.EXTRA_LIST,kabupaten.getDetail());
                intent.putExtra(Detail.EXTRA_LOCATOR,kabupaten.getLocator());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listkab.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgLogo,imgLocator;
        TextView tvNama,tvDetail,tvJenis;
        LinearLayout listlayout;

        ListViewHolder( View itemView) {
            super(itemView);
            listlayout =itemView.findViewById(R.id.list_layout);
            imgLogo = itemView.findViewById(R.id.img_logo_kab);
            tvNama = itemView.findViewById(R.id.tv_nama_kabupaten);
            tvJenis = itemView.findViewById(R.id.tv_jenis);
            imgLocator = itemView.findViewById(R.id.img_locator);
            tvDetail = itemView.findViewById(R.id.tv_detail_list);
        }
    }
}
