package com.example.cadastrocliente;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference myRef = FirebaseDatabase.getInstance().getReference("Clientes");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cliente clienteNovo1 = new Cliente(1,
                "Ana",
                "ana@email.com",
                "1195555-5555",
                "5555-5555",
                "Rua das flores",
                "Curva 13",
                "São Paulo",
                "São Paulo",
                "03636-030",
                "Ativo"
        );
        Cliente clienteNovo2 = new Cliente(2,
                "Paulo",
                "paulo@paulo.com",
                "1196161-6161",
                "1151515151",
                "Rua dos bobos",
                "Segredo",
                "São Paulo",
                "São Paulo",
                "01001-000",
                "Inativo"
        );
        Cliente clienteNovo3 = new Cliente(3,
                "Luis",
                "luis@email.com",
                "1196565-6565",
                "6565-6565",
                "Rua dos andares",
                "Bloco b",
                "Sp",
                "Sp",
                "02222-022",
                "Ativo"

        );
        Cliente clienteNovo4 = new Cliente(4,
                "Nathalia",
                "natha@email.net",
                "1196666-9996",
                "Não possui",
                "Rua das Belezas",
                "Logo ali",
                "SP",
                "SP",
                "01234-567",
                "Ativo"
        );
        Cliente clienteNovo5 = new Cliente(5,
                "Damião",
                "dami@email.com",
                "1197775-7575",
                "7575-7575",
                "Rua do belém",
                "Casa 1",
                "Rio de Janeiro",
                "Rio de Janeiro",
                "02121-021",
                "Inativo"
                );
        myRef.child("001").setValue(clienteNovo1);

        criarCadastro(clienteNovo1);
        criarCadastro(clienteNovo2);
        criarCadastro(clienteNovo3);
        criarCadastro(clienteNovo4);
        criarCadastro(clienteNovo5);


    }

    protected void criarCadastro(Cliente cliente)
    {
        myRef.child(cliente.getIdCliente().toString()).setValue(cliente);

    }
}