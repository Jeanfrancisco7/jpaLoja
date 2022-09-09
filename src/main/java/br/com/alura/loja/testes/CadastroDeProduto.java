package br.com.alura.loja.testes;

import br.com.alura.loja.modelo.Produto;

import java.math.BigDecimal;

public class CadastroDeProduto {

    public void testar(){
        Produto celular = new Produto();
        celular.setNome("Xiaomi Redmi");
        celular.setDescricao("Muito Legal");
        celular.setPreco(new BigDecimal("800"));
    }
}
