package com.example.android.rwcatalog;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProductoAdapter extends ArrayAdapter<Producto> {

    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;

    public ProductoAdapter(Context context, ArrayList<Producto> productos, int colorResourceId){
        super(context, 0, productos);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Producto currentProducto = getItem(position);

        TextView nombreProductoTextView = (TextView) listItemView.findViewById(R.id.nombreProducto_text_view);
        nombreProductoTextView.setText(currentProducto.getNombreProducto());

        TextView breveDescripTextView = (TextView) listItemView.findViewById(R.id.breveDescrip_text_view);
        breveDescripTextView.setText(currentProducto.getBreveDescrip());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if(currentProducto.hasImage()){
            imageView.setImageResource(currentProducto.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }

}
