package com.grontol.pakartanamanobat.classes;

import android.content.Context;
import android.widget.Toast;

import com.grontol.lib.sql.SqlRowResult;
import com.grontol.lib.sql.SqlStatus;
import com.grontol.lib.sql.SqlTableResult;
import com.grontol.lib.sqlite.SQLiteQuery;
import com.grontol.pakartanamanobat.items.ItemPenyakit;
import com.grontol.pakartanamanobat.items.ItemPertanyaan;
import com.grontol.pakartanamanobat.items.ItemTanaman;

/**
 * Created by GrT on 12/13/2016.
 */

public class DataHelper
{
    public static ItemPertanyaan getKunyit(Context context)
    {
        ItemPertanyaan it = getPertanyaan(context, 1);
        
        // Node 1
        it.setYa(getPertanyaan(context, 5));
        it.setTidak(getPertanyaan(context, 10));
        
        // Node 1-5
        it.getYa().setYa(getPertanyaan(context, 6));
        it.getYa().setTidak(getPertanyaan(context, 2));
        
        // Node 1-5-6
        it.getYa().getYa().setYa(getPertanyaan(context, 7));
        it.getYa().getYa().getYa().setYa(getPertanyaan(context, 8));
        it.getYa().getYa().getYa().getYa().setYa(getPertanyaan(context, 11));
        it.getYa().getYa().getYa().getYa().getYa().setFinish(getPenyakit(context, 1));
        
        // Node 1-5-2
        it.getYa().getTidak().setYa(getPertanyaan(context, 3));
        it.getYa().getTidak().getYa().setFinish(getPenyakit(context, 3));
        
        // Node 1-10
        it.getTidak().setYa(getPertanyaan(context, 12));
        it.getTidak().getYa().setFinish(getPenyakit(context, 2));
        it.getTidak().setTidak(getPertanyaan(context, 5));
        
        // Node 1-10-5
        it.getTidak().getTidak().setYa(getPertanyaan(context, 4));
        it.getTidak().getTidak().getYa().setFinish(getPenyakit(context, 4));
        it.getTidak().getTidak().setTidak(getPertanyaan(context, 6));
        
        // Node 1-10-5-6
        it.getTidak().getTidak().getTidak().setYa(getPertanyaan(context, 9));
        it.getTidak().getTidak().getTidak().getYa().setYa(getPertanyaan(context, 12));
        it.getTidak().getTidak().getTidak().getYa().getYa().setFinish(getPenyakit(context, 5));
        
        return it;
    }
    
    public static ItemPertanyaan getJahe(Context context)
    {
        ItemPertanyaan it = getPertanyaan(context, 1);
        
        it.setYa(getPertanyaan(context, 5));
        it.setTidak(getPertanyaan(context, 6));
        
        // Node 1-5
        it.getYa().setYa(getPertanyaan(context, 6));
        it.getYa().setTidak(getPertanyaan(context, 4));
        
        // Node 1-5-6
        it.getYa().getYa().setYa(getPertanyaan(context, 7));
        it.getYa().getYa().setTidak(getPertanyaan(context, 5));
        
        // Node 1-5-6-7
        it.getYa().getYa().getYa().setYa(getPertanyaan(context, 8));
        it.getYa().getYa().getYa().getYa().setYa(getPertanyaan(context, 11));
        it.getYa().getYa().getYa().getYa().getYa().setFinish(getPenyakit(context, 1));
        
        // Node 1-5-6-5
        it.getYa().getYa().getTidak().setYa(getPertanyaan(context, 9));
        it.getYa().getYa().getTidak().getYa().setYa(getPertanyaan(context, 12));
        it.getYa().getYa().getTidak().getYa().getYa().setFinish(getPenyakit(context, 5));
        
        // Node 1-5-4
        it.getYa().getTidak().setFinish(getPenyakit(context, 4));
        
        // Node 1-6
        it.getTidak().setYa(getPertanyaan(context, 12));
        it.getTidak().getYa().setFinish(getPenyakit(context, 7));
        it.getTidak().setTidak(getPertanyaan(context, 13));
        
        // Node 1-6-13
        it.getTidak().getTidak().setYa(getPertanyaan(context, 12));
        it.getTidak().getTidak().getYa().setFinish(getPenyakit(context, 6));
        
        return it;
    }
    
    public static ItemPertanyaan getKayuManis(Context context)
    {
        ItemPertanyaan it = getPertanyaan(context, 14);
        
        it.setYa(getPertanyaan(context, 15));
        it.setTidak(getPertanyaan(context, 16));
        
        // Node 14-15
        it.getYa().setYa(getPertanyaan(context, 18));
        it.getYa().getYa().setYa(getPertanyaan(context, 19));
        it.getYa().getYa().getYa().setFinish(getPenyakit(context, 8));
        
        // Node 14-16
        it.getTidak().setYa(getPertanyaan(context, 14));
        it.getTidak().setTidak(getPertanyaan(context, 20));
        it.getTidak().getTidak().setFinish(getPenyakit(context, 10));
        
        // Node 14-16-14
        it.getTidak().getYa().setYa(getPertanyaan(context, 17));
        it.getTidak().getYa().getYa().setYa(getPertanyaan(context, 19));
        it.getTidak().getYa().getYa().getYa().setFinish(getPenyakit(context, 9));
        
        return it;
    }
    
    public static ItemPertanyaan getJerukNipis(Context context)
    {
        ItemPertanyaan it = getPertanyaan(context, 21);
        
        // Node 21
        it.setYa(getPertanyaan(context, 27));
        it.setTidak(getPertanyaan(context, 23));
        
        // Node 27
        it.getYa().setYa(getPertanyaan(context, 28));
        it.getYa().getYa().setFinish(getPenyakit(context, 11));
        it.getYa().setTidak(getPertanyaan(context, 29));
        it.getYa().getTidak().setFinish(getPenyakit(context, 14));
        
        // Node 21-23
        it.getTidak().setYa(getPertanyaan(context, 26));
        it.getTidak().setTidak(getPertanyaan(context, 30));
        
        // Node 21-23-26
        it.getTidak().getYa().setFinish(getPenyakit(context, 12));
        it.getTidak().getYa().setTidak(getPertanyaan(context, 22));
        it.getTidak().getYa().getTidak().setFinish(getPenyakit(context, 13));
        
        // Node 21-23-30
        it.getTidak().getTidak().setFinish(getPenyakit(context, 15));
        it.getTidak().getTidak().setTidak(getPertanyaan(context, 23));
        it.getTidak().getTidak().getTidak().setYa(getPertanyaan(context, 24));
        it.getTidak().getTidak().getTidak().getYa().setYa(getPertanyaan(context, 25));
        it.getTidak().getTidak().getTidak().getYa().getYa().setFinish(getPenyakit(context, 10));
        
        return it;
    }
    
    public static ItemPertanyaan getLidahBuaya(Context context)
    {
        ItemPertanyaan it = getPertanyaan(context, 31);
        
        it.setYa(getPertanyaan(context, 32));
        it.setTidak(getPertanyaan(context, 33));
        
        // Node 31-32
        it.getYa().setYa(getPertanyaan(context, 33));
        it.getYa().getYa().setFinish(getPenyakit(context, 16));
        
        // Node 31-33
        it.getTidak().setYa(getPertanyaan(context, 35));
        it.getTidak().getYa().setFinish(getPenyakit(context, 17));
        it.getTidak().setTidak(getPertanyaan(context, 34));
        it.getTidak().getTidak().setFinish(getPenyakit(context, 18));
        
        return it;
    }
    
    public static ItemPertanyaan getJambuBiji(Context context)
    {
        ItemPertanyaan it = getPertanyaan(context, 34);
        
        it.setYa(getPertanyaan(context, 40));
        it.setTidak(getPertanyaan(context, 39));
        
        // Node 34-40
        it.getYa().setYa(getPertanyaan(context, 41));
        it.getYa().getYa().setFinish(getPenyakit(context, 19));
        it.getYa().setTidak(getPertanyaan(context, 37));
        it.getYa().getTidak().setFinish(getPenyakit(context, 21));
        
        // Node 34-39
        it.getTidak().setFinish(getPenyakit(context, 20));
        it.getTidak().setTidak(getPertanyaan(context, 38));
        it.getTidak().getTidak().setFinish(getPenyakit(context, 22));
        
        return it;
    }
    
    public static ItemPertanyaan getPertanyaan(Context context, int id)
    {
        ItemPertanyaan it = null;
        
        SQLiteQuery q = new SQLiteQuery(context);
        q.append("SELECT * FROM tb_gejala WHERE id_gejala = :id");
        q.addParam("id", id + "");
    
        SqlTableResult res = q.read();
        
        if (res.getStatus() == SqlStatus.OK)
        {
            if (res.rowCount() > 0)
            it = new ItemPertanyaan(res.row(0));
        }
        else
        {
            Toast.makeText(context, res.getMessage(), Toast.LENGTH_SHORT).show();
        }
        
        return it;
    }
    
    public static ItemPenyakit getPenyakit(Context context, int id)
    {
        ItemPenyakit it = null;
        
        SQLiteQuery q = new SQLiteQuery(context);
        q.append("SELECT * FROM tb_penyakit WHERE id_penyakit = :id");
        q.addParam("id", id + "");
        
        SqlTableResult res = q.read();
        
        if (res.getStatus() == SqlStatus.OK)
        {
            if (res.rowCount() > 0)
                it = new ItemPenyakit(res.row(0));
        }
        else
        {
            Toast.makeText(context, res.getMessage(), Toast.LENGTH_SHORT).show();
        }
        
        return it;
    }
    
    public static ItemTanaman getTanaman(Context context, int id)
    {
        ItemTanaman it = null;
        
        SQLiteQuery q = new SQLiteQuery(context);
        q.append("SELECT * FROM tb_tanaman WHERE id_tanaman = :id");
        q.addParam("id", id + "");
        
        SqlTableResult res = q.read();
        
        if (res.getStatus() == SqlStatus.OK)
        {
            if (res.rowCount() > 0)
                it = new ItemTanaman(context, res.row(0));
        }
        else
        {
            Toast.makeText(context, res.getMessage(), Toast.LENGTH_SHORT).show();
        }
        
        return it;
    }
}
