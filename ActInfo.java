package com.grontol.pakartanamanobat;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.grontol.lib.sqlite.SQLiteManager;
import com.grontol.pakartanamanobat.classes.DataHelper;
import com.grontol.pakartanamanobat.utility.Keys;

/**
 * Created by GrT on 12/10/2016.
 */

public class ActInfo extends AppCompatActivity  implements View.OnClickListener
{
    View vKunyit, vJahe, vKayuManis, vJerukNipis, vLidahBuaya, vJambuBiji;
    View vKembali;
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_pilih_tanaman);
        
        SQLiteManager.setDbName("data.db");
        
        vKunyit = findViewById(R.id.vKunyit);
        vJahe = findViewById(R.id.vJahe);
        vKayuManis = findViewById(R.id.vKayuManis);
        vJerukNipis = findViewById(R.id.vJerukNipis);
        vLidahBuaya = findViewById(R.id.vLidahBuaya);
        vJambuBiji = findViewById(R.id.vJambuBiji);
        vKembali = findViewById(R.id.vKembali);
        
        vKunyit.setOnClickListener(this);
        vJahe.setOnClickListener(this);
        vKayuManis.setOnClickListener(this);
        vJerukNipis.setOnClickListener(this);
        vLidahBuaya.setOnClickListener(this);
        vJambuBiji.setOnClickListener(this);
        vKembali.setOnClickListener(this);
    }
    
    @Override
    public void onClick(View v)
    {
        if (v == vKunyit)
        {
            Intent i = new Intent(this, ActDetailInfo.class);
            i.putExtra(Keys.ITEM_TANAMAN, DataHelper.getTanaman(this, 1));
            startActivity(i);
        }
        else if (v == vJahe)
        {
            Intent i = new Intent(this, ActDetailInfo.class);
            i.putExtra(Keys.ITEM_TANAMAN, DataHelper.getTanaman(this, 2));
            startActivity(i);
        }
        else if (v == vKayuManis)
        {
            Intent i = new Intent(this, ActDetailInfo.class);
            i.putExtra(Keys.ITEM_TANAMAN, DataHelper.getTanaman(this, 3));
            startActivity(i);
        }
        else if (v == vJerukNipis)
        {
            Intent i = new Intent(this, ActDetailInfo.class);
            i.putExtra(Keys.ITEM_TANAMAN, DataHelper.getTanaman(this, 4));
            startActivity(i);
        }
        else if (v == vLidahBuaya)
        {
            Intent i = new Intent(this, ActDetailInfo.class);
            i.putExtra(Keys.ITEM_TANAMAN, DataHelper.getTanaman(this, 5));
            startActivity(i);
        }
        else if (v == vJambuBiji)
        {
            Intent i = new Intent(this, ActDetailInfo.class);
            i.putExtra(Keys.ITEM_TANAMAN, DataHelper.getTanaman(this, 6));
            startActivity(i);
        }
        else if (v == vKembali)
        {
            finish();
        }
    }
}
