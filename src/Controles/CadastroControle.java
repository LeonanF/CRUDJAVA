/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import Entidades.Produto;
import Telas.TelaPrincipal;

/**
 *
 * @author Estandates
 */
public class CadastroControle {
    
    
    TelaPrincipal tela;
    
    public CadastroControle(TelaPrincipal mainTela) {
        this.tela = mainTela;
    }
    
    public boolean cadastrarProduto(Produto p){    
        boolean result = false;
        
        if(p!=null && p.getNome().length()>0 && p.getPrecoCusto()!=0.0f && p.getPrecoVenda()!=0.0f && p.getEspecificacoes().length()>0){
            tela.addToList(p);
            result = true;
        }
        
        return result;        
    }
    
    public boolean atualizarProduto(String nome, String especificacoes, float precoVenda, float precoCusto, boolean habilitado, int index){
    
        boolean result = false;
        if(nome.length()>0 && precoCusto!=0.0f && precoVenda!=0.0f && especificacoes.length()>0){
            tela.attItem(nome, especificacoes, precoVenda, precoCusto, habilitado, index);
            result = true;
        }
        
        return result;
        
    } 
    
}