package com.grontol.pakartanamanobat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActMenu extends AppCompatActivity implements View.OnClickListener
{
    View vIdentifikasi;
    View vManfaat;
    View vInfo;
    View vKeluar;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_menu);
        
        vIdentifikasi = findViewById(R.id.vIdentifikasi);
        vManfaat = findViewById(R.id.vManfaat);
        vInfo = findViewById(R.id.vInfo);
        vKeluar = findViewById(R.id.vKeluar);
        
        vIdentifikasi.setOnClickListener(this);
        vManfaat.setOnClickListener(this);
        vInfo.setOnClickListener(this);
        vKeluar.setOnClickListener(this);
    }
    
    @Override
    public void onClick(View v)
    {
        if (v == vIdentifikasi)
        {
            Intent i = new Intent(this, ActIdentifikasi.class);
            startActivity(i);
        }
        else if (v == vManfaat)
        {
            Intent i = new Intent(this, ActManfaat.class);
            startActivity(i);
        }
        else if (v == vInfo)
        {
            Intent i = new Intent(this, ActInfo.class);
            startActivity(i);
        }
        else if (v == vKeluar)
        {
            finish();
        }
    }
}
