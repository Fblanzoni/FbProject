package com.tntdiebold.auxsup.tntdiebold2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class BuscaDados {
        
    public static void pesquisaDados(JComboBox cliente, JComboBox campoTer, JTextField campo) {
        
        try{
 
            Terminais.retornoTerminais.clear();
            Loja.retornoLojas.clear();
            
            
            Connection con = new ConexaoBancoDeDados().getConnection();
            String sql = "SELECT * FROM cadastro.clientes WHERE " + 
                          cliente.getName() + " LIKE ?";
                        
            PreparedStatement consulta = con.prepareStatement(sql);
            consulta.setString(1, "%" + cliente.getSelectedItem() + "%");
            ResultSet resultadoConsul = consulta.executeQuery();
            
            int idCliente =0;
            
            while(resultadoConsul.next()){
                idCliente = resultadoConsul.getInt(1);
            }
            
            String tipoDado="";
            String tabela="";
            String dadoCampo="";
            
            if(campo != null){
                int i = campo.getName().indexOf(".");
                tabela = campo.getName().substring(0, i);
                tipoDado = campo.getName().substring(i+1);
                dadoCampo = "'" + campo.getText() + "'";
                
            } else if(campoTer != null){
            
                tabela = "lojas";
                tipoDado = "numLoja";
                dadoCampo = (String) campoTer.getSelectedItem();
                dadoCampo =  "'" + dadoCampo.substring(2, 5) + "'";

            }
            
            sql = "SELECT * FROM cadastro." + tabela +
                  " WHERE clientes_id LIKE " + idCliente + " AND " + tipoDado + " LIKE " + dadoCampo;
            System.out.println(idCliente);
            consulta = con.prepareStatement(sql);
            resultadoConsul = consulta.executeQuery();
            int idLoja=0;

            while(resultadoConsul.next()){

                idLoja = resultadoConsul.getInt(1);
                String sigla = resultadoConsul.getString(3);
                String loja = resultadoConsul.getString(4);
                String numLoja = resultadoConsul.getString(5);
                String endereco = resultadoConsul.getString(6);
                String bairro = resultadoConsul.getString(7);
                String cidade = resultadoConsul.getString(8);
                String estado = resultadoConsul.getString(9);
                String telefone = resultadoConsul.getString(10);
                
                Loja.retornoLojas.add(new Loja(idLoja, sigla, loja, numLoja, endereco, bairro, cidade, estado, telefone));

            }

            tabela = "terminais";
            tipoDado = "id_lojas";      
            sql = "SELECT * FROM cadastro." + tabela + " WHERE " + tipoDado + " LIKE ?";

   
            consulta = con.prepareStatement(sql);
            consulta.setInt(1, idLoja);
            resultadoConsul = consulta.executeQuery();

            while(resultadoConsul.next()){

                String idTerminal = resultadoConsul.getString(2);
                String numSerie = resultadoConsul.getString(3);
                String ip = resultadoConsul.getString(4);
                String mascara = resultadoConsul.getString(5);
                String gateway = resultadoConsul.getString(6);
                String modelo = resultadoConsul.getString(7);
 
                Terminais.retornoTerminais.add(new Terminais(idTerminal, numSerie, "", ip, mascara, gateway, modelo));
                Collections.sort(Terminais.retornoTerminais);
            }
            

            
            resultadoConsul.close();
            consulta.close();

        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    
}
