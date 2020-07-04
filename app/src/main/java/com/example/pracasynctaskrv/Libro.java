package com.example.pracasynctaskrv;

import android.widget.ImageView;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class Libro {
    String titulo;
    String autor;
    String anio;
    String descripcion;
    //int foto;

    public Libro(String titulo, String autor, String anio, String descripcion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.descripcion = descripcion;
        //this.foto = foto;
    }

}
