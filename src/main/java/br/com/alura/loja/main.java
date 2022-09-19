package br.com.alura.loja;

import br.com.alura.loja.testes.CadastroDeProduto;

public class main {
    public static void main(String args[]){
        new CadastroDeProduto().cadastrarProduto();
        new CadastroDeProduto().consultarById();
    }

}
