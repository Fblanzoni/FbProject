
package com.tntdiebold.auxsup.tntdiebold2;

import java.util.ArrayList;
import java.util.List;

public class Loja implements Comparable<Terminais> {
    
    private int idLoja;
    private String sigla;
    private String loja;
    private String numLoja;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;
    public static List<Loja> retornoLojas = new ArrayList<>();
   
    public Loja(int idLoja, String sigla, String loja, String numLoja, String endereco,
                String bairro, String cidade, String estado, String telefone){
       
       this.idLoja = idLoja;
       this.sigla = sigla;
       this.loja = loja;
       this.numLoja = numLoja;
       this.endereco = endereco;
       this.bairro = bairro;
       this.cidade = cidade;
       this.estado = estado;
       this.telefone = telefone;
              
    }

    public Loja() {
       super();
    }

    /**
     * @return the idLoja
     */
    public int getIdLoja() {
        return idLoja;
    }

    /**
     * @return the sigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * @return the loja
     */
    public String getLoja() {
        return loja;
    }

    /**
     * @return the numLoja
     */
    public String getNumLoja() {
        return numLoja;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    @Override
    public int compareTo(Terminais t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
