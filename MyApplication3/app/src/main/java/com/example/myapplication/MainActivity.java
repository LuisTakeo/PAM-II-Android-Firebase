package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference myRef = FirebaseDatabase
            .getInstance()
            .getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseReference produtos = myRef.child("Produtos");

        Produto p = new Produto("Coca-cola zero", 9.99);
        produtos.child("001").setValue(p);

//        myRef.child("001")
//                .child("nome")
//                .setValue("Coca-Cola");
//        myRef.child("001")
//                .child("valor")
//                .setValue("9,99");
//        myRef.child("002")
//                .child("nome")
//                .setValue("Cafe");
//        myRef.child("002")
//                .child("valor")
//                .setValue("14,29");
//        myRef.child("003")
//                .child("nome")
//                .setValue("Chá");
//        myRef.child("003")
//                .child("valor")
//                .setValue("5,29");
//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference myRef = database.getReference("message");
//
//        myRef.setValue("Hello, World!");
    }
}