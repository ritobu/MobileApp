package com.grontol.pakartanamanobat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.grontol.lib.views.WrapPager;
import com.grontol.pakartanamanobat.fragment.AdpGambar;
import com.grontol.pakartanamanobat.items.ItemTanaman;
import com.grontol.pakartanamanobat.utility.Keys;


public class ActDetailInfo extends AppCompatActivity
{
    TextView txtTitle, txtInfo;
    
    WrapPager wrapPager;
    AdpGambar adpGambar;
    
    ItemTanaman it;
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_info);
        
        txtTitle = (TextView)findViewById(R.id.txtTitle);
        txtInfo = (TextView)findViewById(R.id.txtInfo);
        
        fillData();
        
        wrapPager = (WrapPager)findViewById(R.id.viewPager);
        adpGambar = new AdpGambar(getSupportFragmentManager(), it.getGallery());
        wrapPager.setAdapter(adpGambar);
    }
    
    private void fillData()
    {
        it = (ItemTanaman)getIntent().getSerializableExtra(Keys.ITEM_TANAMAN);
        
        getSupportActionBar().setTitle("Info " + it.getNamaTanaman());
        
        txtTitle.setText(it.getNamaTanaman());
        txtInfo.setText(it.getInfo());
    }
}
