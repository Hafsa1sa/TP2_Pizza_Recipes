package com.example.pizzarecipes.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import com.example.pizzarecipes.R;
import com.example.pizzarecipes.classes.Produit;

public class PizzaAdapter extends BaseAdapter {
    private List<Produit> produit;
    private LayoutInflater inflater;

    public PizzaAdapter(List<Produit> produit, Activity activity) {
        this.produit = produit;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return produit.size();
    }

    @Override
    public Object getItem(int position) {
        return produit.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView = inflater.inflate(R.layout.item,null);

        TextView id = convertView.findViewById(R.id.id);
        TextView nom = convertView.findViewById(R.id.nom);
        TextView nbrIngredients = convertView.findViewById(R.id.nbrIngredients);
        TextView duree= convertView.findViewById(R.id.duree);
        ImageView imageView = convertView.findViewById(R.id.imageView);


        id.setText(produit.get(position).getId()+"");
        nom.setText(produit.get(position).getNom()+"");
        duree.setText(produit.get(position).getDuree()+"");
        nbrIngredients.setText(produit.get(position).getNbrIngredients()+"");
        imageView.setImageResource(produit.get(position).getPhoto());

        return convertView;
    }
}
