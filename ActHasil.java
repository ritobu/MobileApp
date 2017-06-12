package com.grontol.pakartanamanobat;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.grontol.pakartanamanobat.items.ItemPenyakit;
import com.grontol.pakartanamanobat.items.ItemPertanyaan;
import com.grontol.pakartanamanobat.utility.Keys;

/**
 * Created by GrT on 12/10/2016.
 */

public class ActHasil extends AppCompatActivity implements View.OnClickListener
{
    TextView txtDeskripsi;
    View vMenuUtama;
    
    String title;
    ItemPenyakit it;
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_hasil);
        
        txtDeskripsi = (TextView)findViewById(R.id.txtDeskripsi);
        vMenuUtama = findViewById(R.id.vMenuUtama);
        vMenuUtama.setOnClickListener(this);
        
        fillData();
    }
    
    private void fillData()
    {
        title = getIntent().getStringExtra(Keys.TITLE);
        it = (ItemPenyakit)getIntent().getSerializableExtra(Keys.ITEM_PENYAKIT);
        
        if (it != null)
        {
            String s = "Tanaman " + title + " anda terkena penyakit " + it.getNamaPenyakit() + "\n\n" +
                    "Solusi yang dapat dilakukan adalah :\n" + it.getSolusi();
            
            txtDeskripsi.setText(s);
            
        }
        else
        {
            txtDeskripsi.setText("Penyakit tidak dapat diidentifikasi");
        }
    }
    
    @Override
    public void onClick(View v)
    {
        if (v == vMenuUtama)
        {
            Intent i = new Intent(this, ActMenu.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            
            finish();
        }
    }
}
