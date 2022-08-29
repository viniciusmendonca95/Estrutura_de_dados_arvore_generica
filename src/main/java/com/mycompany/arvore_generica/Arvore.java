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
public class Arvore {
    //Atributos da árvore generica
    private No noRaiz;
    private List<No> elementos;
   
    //Construtor da árvore generica
    public Arvore(No no) {
        this.noRaiz = no;
        this.elementos = new ArrayList<>();
    }
    
    //Método que retorna o nó raiz da árvore
    public No getNoRaiz(){
        return noRaiz;
    }
      
    //Método que gera e retorna a lista de elementos da árvore
    public List<No> geraElementos(No noRaiz) {
        if (noRaiz.getNivelNo() == 0) {
            elementos.add(noRaiz);
        }
        
        if (noRaiz.getFilhosNo().size() > 0) {
            for (No noFilho : noRaiz.getFilhosNo()){
                elementos.add(noFilho);   
                geraElementos(noFilho);        
            }  
        }
        
        return this.elementos;
    }
    
    //Método que printa os a lista de elementos gerada
    public void getElementos(){
        elementos.clear();
        List<No> elementos = new ArrayList<No>();
        elementos = geraElementos(noRaiz);
        
        for (No elemento : elementos) {
            System.out.print(elemento.getValorNo() + "  ");
        }
        System.out.println("");
    }
    
    //Método que retorna os nós folhas da árvore
    public void getNoFolha() {
        elementos.clear();
        elementos = geraElementos(noRaiz);
        
        List<No> nosFolhas = new ArrayList<No>();
        
        for (No elemento : elementos) {
            if (elemento.getFilhosNo().size() == 0) {
                nosFolhas.add(elemento);
            }
        }
        
        for (No noFolha : nosFolhas) {
            System.out.print(noFolha.getValorNo() + "  ");
        }
        System.out.println("");
    }
    
    //Método que retorna os nós internos da árvore
    public void getNoInterno() {
        elementos.clear();
        elementos = geraElementos(noRaiz);

        List<No> nosInternos = new ArrayList<No>();
        
        for (No elemento : elementos) {
            if (elemento.getFilhosNo().size() != 0) {
                nosInternos.add(elemento);
            }
        }

        for (No noInterno: nosInternos) {
            System.out.print(noInterno.getValorNo() + "  ");
        }
        System.out.println("");
    }
    
    //Método que printa a árvore de forma identada
    public void printArvore(No no){
        if (no.getNivelNo() == 0) {
            System.out.println(no.getValorNo());
        }
        if (no.getFilhosNo().size() > 0) {
            for (No noFilho : no.getFilhosNo()){
                String spaces = "";
                for (int i = 0; i < noFilho.getNivelNo(); i++){
                    spaces += "  ";
                }
                System.out.println(spaces + noFilho.getValorNo());     
                printArvore(noFilho); 
           }   
        }
    }
}
    