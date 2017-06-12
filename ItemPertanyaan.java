package com.grontol.pakartanamanobat.items;

import com.grontol.lib.sql.SqlRow;

import java.io.Serializable;

/**
 * Created by GrT on 12/13/2016.
 */

public class ItemPertanyaan implements Serializable
{
    private String idGejala;
    private String gejala;
    
    private ItemPertanyaan ya;
    private ItemPertanyaan tidak;
    
    private ItemPenyakit finish;
    
    public ItemPertanyaan(SqlRow r)
    {
        setIdGejala(r.getString("id_gejala"));
        setGejala(r.getString("nama_gejala"));
    }
    
    public String getIdGejala()
    {
        return idGejala;
    }
    
    public void setIdGejala(String idGejala)
    {
        this.idGejala = idGejala;
    }
    
    public String getGejala()
    {
        return gejala;
    }
    
    public void setGejala(String gejala)
    {
        this.gejala = gejala;
    }
    
    public ItemPertanyaan getYa()
    {
        return ya;
    }
    
    public void setYa(ItemPertanyaan ya)
    {
        this.ya = ya;
    }
    
    public ItemPertanyaan getTidak()
    {
        return tidak;
    }
    
    public void setTidak(ItemPertanyaan tidak)
    {
        this.tidak = tidak;
    }
    
    public ItemPenyakit getFinish()
    {
        return finish;
    }
    
    public void setFinish(ItemPenyakit finish)
    {
        this.finish = finish;
    }
}
