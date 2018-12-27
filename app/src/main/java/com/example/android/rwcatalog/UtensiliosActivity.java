package com.example.android.rwcatalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class UtensiliosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.producto_list);

        final  ArrayList<Producto> productos = new ArrayList<Producto>();
        productos.add(new Producto("HolA", "HOLA2", R.drawable.chef1));
        productos.add(new Producto("HolA", "HOLA2", R.drawable.chef2));
        productos.add(new Producto("HolA", "HOLA2", R.drawable.juego_gourmet));
        productos.add(new Producto("HolA", "HOLA2", R.drawable.gran_cacerola));
        productos.add(new Producto("HolA", "HOLA2", R.drawable.max_cooker));
        productos.add(new Producto("HolA", "HOLA2", R.drawable.la_princesa));

        ProductoAdapter adapter = new ProductoAdapter(this, productos, R.color.category_utensilios);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
