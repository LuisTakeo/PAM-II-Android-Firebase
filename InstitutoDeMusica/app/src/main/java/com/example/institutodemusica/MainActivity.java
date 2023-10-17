package com.example.institutodemusica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference myRef = FirebaseDatabase. getInstance()
            .getReference("Alunos");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        criarAluno("001", "Luis Takeo", "A", "008");
        criarAluno("002", "Nath Xavier", "A", "008");
        criarAluno("003", "Damião", "B", "007");
        criarAluno("004", "Giovana", "A", "005");
        criarAluno("005", "Leticia", "A", "004");
    }
    protected void criarAluno(String rm, String nome, String turma, String sala)
    {
        myRef.child(rm).child("nome").setValue(nome);
        myRef.child(rm).child("turma").setValue(turma);
        myRef.child(rm).child("sala").setValue(sala);
    }
}