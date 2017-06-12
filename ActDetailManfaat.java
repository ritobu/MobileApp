package com.grontol.pakartanamanobat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.grontol.lib.views.WrapPager;
import com.grontol.pakartanamanobat.fragment.AdpGambar;
import com.grontol.pakartanamanobat.items.ItemTanaman;
import com.grontol.pakartanamanobat.utility.Keys;

/**
 * Created by GrT on 12/10/2016.
 */

public class ActDetailManfaat extends AppCompatActivity
{
    TextView txtTitle, txtManfaat;
    
    WrapPager wrapPager;
    AdpGambar adpGambar;
    
    ItemTanaman it;
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_manfaat);
        
        txtTitle = (TextView)findViewById(R.id.txtTitle);
        txtManfaat = (TextView)findViewById(R.id.txtManfaat);
        
        fillData();
        
        wrapPager = (WrapPager)findViewById(R.id.viewPager);
        adpGambar = new AdpGambar(getSupportFragmentManager(), it.getGallery());
        wrapPager.setAdapter(adpGambar);
    }
    
    private void fillData()
    {
        it = (ItemTanaman)getIntent().getSerializableExtra(Keys.ITEM_TANAMAN); 
        
        getSupportActionBar().setTitle("Manfaat " + it.getNamaTanaman());
        
        txtTitle.setText(it.getNamaTanaman());
        txtManfaat.setText("Manfaat dari " + it.getNamaTanaman() + " adalah :\n\n" + it.getManfaat());
    }
}
