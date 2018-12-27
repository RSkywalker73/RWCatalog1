package com.example.android.rwcatalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ComplementosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.producto_list);

        final ArrayList<Producto> productos = new ArrayList<Producto>();
        productos.add(new Producto("HolA", "HOLA2", R.drawable.ic_launcher_background));
        productos.add(new Producto("HolA", "HOLA2", R.drawable.ic_launcher_background));
        productos.add(new Producto("HolA", "HOLA2", R.drawable.ic_launcher_background));
        productos.add(new Producto("HolA", "HOLA2", R.drawable.ic_launcher_background));
        productos.add(new Producto("HolA", "HOLA2", R.drawable.ic_launcher_background));
        productos.add(new Producto("HolA", "HOLA2", R.drawable.ic_launcher_background));

        ProductoAdapter adapter = new ProductoAdapter(this, productos, R.color.category_complementos);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
