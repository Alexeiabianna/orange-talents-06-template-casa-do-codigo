package com.casadocodigo.casadocodigo.config.validacao;

public class ErroCategoriaCadastro {

    public String campo = "Nome";
    private String erro = "Registro já existe";


    public ErroCategoriaCadastro() {
    }
    
    public String getErro() {
        return erro;
    } 
    
}
