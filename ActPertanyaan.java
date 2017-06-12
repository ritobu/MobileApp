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

public class ActPertanyaan extends AppCompatActivity implements View.OnClickListener
{
    TextView txtPertanyaan;    
    View vYa, vTidak;
    
    String title;
    ItemPertanyaan it;
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_pertanyaan);
        
        txtPertanyaan = (TextView)findViewById(R.id.txtPertanyaan);
        
        vYa = findViewById(R.id.vYa);
        vTidak = findViewById(R.id.vTidak);
        
        vYa.setOnClickListener(this);
        vTidak.setOnClickListener(this);
        
        fillData();
    }
    
    private void fillData()
    {
        title = getIntent().getStringExtra(Keys.TITLE);
        it = (ItemPertanyaan)getIntent().getSerializableExtra(Keys.ITEM_PERTANYAAN);
        
        getSupportActionBar().setTitle(title);
        
        refreshPertanyaan();
    }
    
    private void refreshPertanyaan()
    {
        txtPertanyaan.setText(it.getGejala());
    }
    
    @Override
    public void onClick(View v)
    {
        if (v == vYa)
        {
            if (it.getFinish() != null)
            {
                openHasil(it.getFinish());
            }
            else if (it.getYa() != null)
            {
                it = it.getYa();
                refreshPertanyaan();
            }
            else
            {
                openHasil(null);
            }
        }
        else if (v == vTidak)
        {
            if (it.getTidak() != null)
            {
                it = it.getTidak();
                refreshPertanyaan();
            }
            else
            {
                openHasil(null);
            }
        }
    }
    
    private void openHasil(ItemPenyakit itp)
    {
        Intent i = new Intent(this, ActHasil.class);
        i.putExtra(Keys.TITLE, title);
        
        if (itp != null)
            i.putExtra(Keys.ITEM_PENYAKIT, itp);
        
        startActivity(i);
        finish();
    }
}
