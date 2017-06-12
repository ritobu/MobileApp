package com.grontol.pakartanamanobat.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.grontol.lib.utility.Imaging;
import com.grontol.pakartanamanobat.R;
import com.grontol.pakartanamanobat.utility.Keys;

/**
 * Created by GrT on 12/22/2016.
 */

public class FrgGambar extends Fragment
{
    String gambar;
    
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        gambar = getArguments().getString(Keys.GAMBAR);
    }
    
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.frg_gambar, container, false);
    
        ImageView imgGambar = (ImageView)v.findViewById(R.id.imgGambar);
        imgGambar.setImageBitmap(Imaging.getBitmapFromAsset(getActivity(), "images/" + gambar));
        
        return v;
    }
}
