package com.example.pizzarecipes;

import android.os.Bundle;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class DetailsActivity extends AppCompatActivity {
    private TextView nom,textView3,description,textView7,ingredients;
    private ImageView photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        nom=findViewById(R.id.nom);
        textView3=findViewById(R.id.textView3);
        description=findViewById(R.id.description);
        textView7=findViewById(R.id.textView7);
        ingredients=findViewById(R.id.ingredients);
        photo=findViewById(R.id.photo);
        photo.setImageResource( getIntent().getIntExtra("photo", 0));
        nom.setText(this.getIntent().getStringExtra("nom"));
        description.setText(this.getIntent().getStringExtra("description"));
        ingredients.setText(this.getIntent().getStringExtra("detailsIngred"));


    }
}