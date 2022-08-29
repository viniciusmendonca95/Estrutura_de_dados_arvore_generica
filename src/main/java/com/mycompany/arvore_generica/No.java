/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arvore_generica;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author vinyj
 */
public class No {
    //Atributos do nó
    private int valor;
    private List<No> filhos;
    private int nivel;
    
    //Construtor do nó
    public No(int valor){
        this.valor = valor;
        this.filhos = new ArrayList<>();
        this.nivel = nivel;
    }
    
    //Método de adição ode filho ao nó
    public No adicionarFilhoAoNo(No no){
        no.nivel = nivel + 1;
        filhos.add(no);
        return no;
    }
  
    //Método de retorno do valor do nó
    public int getValorNo() {
        return valor;
    }
    
    //Método de retorno da lista de filhos do nó
    public List<No> getFilhosNo() {
        return filhos;
    }
    
    //Método de retorno do nível do nó
    public int getNivelNo() {
        return nivel;
    }  
}
