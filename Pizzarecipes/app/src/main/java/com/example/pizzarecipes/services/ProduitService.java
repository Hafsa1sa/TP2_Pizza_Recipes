package com.example.pizzarecipes.services;
import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.dao.IDao;

import java.util.ArrayList;
import  java.util.List;

public class ProduitService implements IDao<Produit> {
    private List<Produit> produit;

    public ProduitService(){
    produit=new ArrayList<>();
    }
    @Override
    public boolean create(Produit o){
        return produit.add(o);
    }
    @Override
    public boolean delete(Produit o){
        return produit.remove(o);
    }
    @Override
    public boolean update(Produit o){
        return false;
    }
    @Override
    public Produit findById(int id){
        for(Produit p:produit)
            if(p.getId()==id)
                return p;
        return null;
    }
    public List<Produit> findAll(){
        return produit;
    }
}

