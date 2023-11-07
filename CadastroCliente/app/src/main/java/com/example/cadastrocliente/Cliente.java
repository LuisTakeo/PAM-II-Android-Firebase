package com.example.cadastrocliente;

public class Cliente {
    private Integer     idCliente;
    private String  nome;
    private String  email;
    private String  celular;
    private String  telefone;
    private String  endereco;
    private String  complemento;
    private String  estado;
    private String  cidade;
    private String  cep;
    private String  status;

    Cliente ()
    {}

    Cliente(
            Integer idCliente,
            String nome,
            String email,
            String celular,
            String telefone,
            String endereco,
            String complemento,
            String estado,
            String cidade,
            String cep,
            String status)
    {
        this.idCliente = idCliente;
        this.nome = nome;
        this.email = email;
        this.celular = celular;
        this.telefone = telefone;
        this.endereco = endereco;
        this.complemento = complemento;
        this.estado = estado;
        this.cidade = cidade;
        this.cep = cep;
        this.status = status;
    }

    public Integer getIdCliente() {
        return idCliente;
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

    public String getStatus() {
        return status;
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

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
