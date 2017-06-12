package com.grontol.pakartanamanobat.items;

import com.grontol.lib.sql.SqlRow;

import java.io.Serializable;

/**
 * Created by GrT on 12/13/2016.
 */

public class ItemPenyakit implements Serializable
{
    private String idPenyakit;
    private String namaPenyakit;
    private String solusi;
    
    public ItemPenyakit(SqlRow r)
    {
        setIdPenyakit(r.getString("id_penyakit"));
        setNamaPenyakit(r.getString("nama_penyakit"));
        setSolusi(r.getString("solusi_penyakit"));
    }
    
    public String getIdPenyakit()
    {
        return idPenyakit;
    }
    
    public void setIdPenyakit(String idPenyakit)
    {
        this.idPenyakit = idPenyakit;
    }
    
    public String getNamaPenyakit()
    {
        return namaPenyakit;
    }
    
    public void setNamaPenyakit(String namaPenyakit)
    {
        this.namaPenyakit = namaPenyakit;
    }
    
    public String getSolusi()
    {
        return solusi;
    }
    
    public void setSolusi(String solusi)
    {
        this.solusi = solusi;
    }
}
