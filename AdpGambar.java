package com.grontol.pakartanamanobat.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.grontol.pakartanamanobat.utility.Keys;

import java.util.List;

/**
 * Created by GrT on 12/22/2016.
 */

public class AdpGambar extends FragmentPagerAdapter
{
    List<String> gallery;
    FrgGambar[] frgs;
    
    public AdpGambar(FragmentManager fm, List<String> gallery)
    {
        super(fm);
        
        this.gallery = gallery;
        frgs = new FrgGambar[gallery.size()];
    }
    
    @Override
    public Fragment getItem(int position)
    {
        if (frgs[position] == null)
        {
            Bundle b = new Bundle();
            b.putString(Keys.GAMBAR, gallery.get(position));
            
            frgs[position] = new FrgGambar();
            frgs[position].setArguments(b);
        }
        
        return frgs[position];
    }
    
    @Override
    public int getCount()
    {
        return gallery.size();
    }
}
