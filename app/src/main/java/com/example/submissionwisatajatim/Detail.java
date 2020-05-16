package com.example.submissionwisatajatim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Detail extends AppCompatActivity {
    public static final String EXTRA_LOCATOR = "locator" ;
    public static final String EXTRA_NAME = "nama";
    public static final String EXTRA_LIST = "list";
    public String title = "Daftar Tempat Wisata";

    private ImageView imglocator;
    private TextView tvnamakab,tvdetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBar(title);
        setContentView(R.layout.activity_detail);

        tvnamakab = findViewById(R.id.tv_detail_nama);
        tvdetail = findViewById(R.id.tv_detail_list);
        imglocator = findViewById(R.id.img_locator);

        String nama = getIntent().getStringExtra(EXTRA_NAME);
        String list = getIntent().getStringExtra(EXTRA_LIST);
        int location = getIntent().getIntExtra(EXTRA_LOCATOR,0);

        Glide.with(this)
                .load(location)
                .apply( new RequestOptions().override(400,250))
                .into(imglocator);
        tvnamakab.setText(nama);
        tvdetail.setText(list);
    }

    private void setActionBar(String profile) {
        if (getSupportActionBar()!=null){
            getSupportActionBar().setTitle(title);
        }
    }
}
