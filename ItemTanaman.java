package com.grontol.pakartanamanobat.items;

import android.content.Context;
import android.widget.Toast;

import com.grontol.lib.sql.SqlQuery;
import com.grontol.lib.sql.SqlRow;
import com.grontol.lib.sql.SqlStatus;
import com.grontol.lib.sql.SqlTableResult;
import com.grontol.lib.sqlite.SQLiteQuery;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by GrT on 12/22/2016.
 */

public class ItemTanaman implements Serializable
{
    private String idTanaman;
    private String namaTanaman;
    private String manfaat;
    private String info;
    
    private List<String> gallery;
    
    public ItemTanaman(Context context, SqlRow r)
    {
        idTanaman = r.getString("id_tanaman");
        namaTanaman = r.getString("nama_tanaman");
        manfaat = r.getString("manfaat");
        info = r.getString("info");
        
        gallery = new ArrayList<>();
    
        SQLiteQuery q = new SQLiteQuery(context, "SELECT * FROM tb_galeri WHERE id_tanaman = :idTanaman");
        q.addParam("idTanaman", idTanaman);
    
        SqlTableResult res = q.read();
        
        if (res.getStatus() == SqlStatus.OK)
        {
            for (SqlRow rr : res.getRows())
            {
                gallery.add(rr.getString("foto_tanaman"));
            }
        }
        else
        {
            Toast.makeText(context, res.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    
    public String getIdTanaman()
    {
        return idTanaman;
    }
    
    public void setIdTanaman(String idTanaman)
    {
        this.idTanaman = idTanaman;
    }
    
    public String getNamaTanaman()
    {
        return namaTanaman;
    }
    
    public void setNamaTanaman(String namaTanaman)
    {
        this.namaTanaman = namaTanaman;
    }
    
    public String getManfaat()
    {
        return manfaat;
    }
    
    public void setManfaat(String manfaat)
    {
        this.manfaat = manfaat;
    }
    
    public String getInfo()
    {
        return info;
    }
    
    public void setInfo(String info)
    {
        this.info = info;
    }
    
    public List<String> getGallery()
    {
        return gallery;
    }
    
    public void setGallery(List<String> gallery)
    {
        this.gallery = gallery;
    }
}
