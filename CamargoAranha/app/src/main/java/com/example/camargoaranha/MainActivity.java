package com.example.camargoaranha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private EditText rmEditText;
    private EditText nomeEditText;
    private EditText emailEditText;
    private EditText celularEditText;
    private EditText telefoneEditText;
    private EditText enderecoEditText;
    private EditText complementoEditText;
    private EditText cidadeEditText;
    private EditText estadoEditText;
    private EditText cepEditText;
    private EditText cursoEditText;


    private DatabaseReference myRef = FirebaseDatabase.getInstance().getReference("Alunos");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nomeEditText = findViewById(R.id.editTextRmAluno);

        Aluno novoAluno = new Aluno();
        novoAluno.setRmAluno(nomeEditText.getText().toString());
        novoAluno.setNome(R.id.editTextNome);
        novoAluno.setEmail(R.id.editTextEmail);
        novoAluno.setCelular(R.id.editTextCelular);
        novoAluno.setTelefone(R.id.editTextTelefone);



        Aluno alunoNovo1 = new Aluno(1,
                "Ana",
                "ana@email.com",
                "1195555-5555",
                "5555-5555",
                "Rua das flores",
                "Curva 13",
                "São Paulo",
                "São Paulo",
                "03636-030",
                "Quimica"
        );
        Aluno alunoNovo2 = new Aluno(2,
                "Paulo",
                "paulo@paulo.com",
                "1196161-6161",
                "1151515151",
                "Rua dos bobos",
                "Segredo",
                "São Paulo",
                "São Paulo",
                "01001-000",
                "Nutrição"
        );
        Aluno alunoNovo3 = new Aluno(3,
                "Luis",
                "luis@email.com",
                "1196565-6565",
                "6565-6565",
                "Rua dos andares",
                "Bloco b",
                "Sp",
                "Sp",
                "02222-022",
                "Engenharia"

        );
        Aluno alunoNovo4 = new Aluno(4,
                "Nathalia",
                "natha@email.net",
                "1196666-9996",
                "Não possui",
                "Rua das Belezas",
                "Logo ali",
                "SP",
                "SP",
                "01234-567",
                "Engenharia"
        );
        Aluno alunoNovo5 = new Aluno(5,
                "Damião",
                "dami@email.com",
                "1197775-7575",
                "7575-7575",
                "Rua do belém",
                "Casa 1",
                "Rio de Janeiro",
                "Rio de Janeiro",
                "02121-021",
                "Doutorado"
        );

        criarCadastro(alunoNovo1);
        criarCadastro(alunoNovo2);
        criarCadastro(alunoNovo3);
        criarCadastro(alunoNovo4);
        criarCadastro(alunoNovo5);

    }

    protected void criarCadastro(Aluno aluno)
    {
        myRef.child(aluno.getRmAluno().toString()).setValue(aluno);

    }
}