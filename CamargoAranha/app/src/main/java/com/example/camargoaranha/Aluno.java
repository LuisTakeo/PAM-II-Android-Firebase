package com.example.camargoaranha;

public class Aluno {
    private Integer     rmAluno;
    private String  nome;
    private String  email;
    private String  celular;
    private String  telefone;
    private String  endereco;
    private String  complemento;
    private String  estado;
    private String  cidade;
    private String  cep;
    private String  curso;

    Aluno ()
    {}

    Aluno(
            Integer rmAluno,
            String nome,
            String email,
            String celular,
            String telefone,
            String endereco,
            String complemento,
            String estado,
            String cidade,
            String cep,
            String curso)
    {
        this.rmAluno = rmAluno;
        this.nome = nome;
        this.email = email;
        this.celular = celular;
        this.telefone = telefone;
        this.endereco = endereco;
        this.complemento = complemento;
        this.estado = estado;
        this.cidade = cidade;
        this.cep = cep;
        this.curso = curso;
    }

    public Integer getRmAluno() {
        return rmAluno;
    }

    public String getCelular() {
        return celular;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEstado() {
        return estado;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setRmAluno(int rmAluno) {
        this.rmAluno = rmAluno;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
