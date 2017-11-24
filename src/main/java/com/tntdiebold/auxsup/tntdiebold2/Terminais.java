package com.tntdiebold.auxsup.tntdiebold2;

import java.util.ArrayList;
import java.util.List;

public class Terminais implements Comparable<Terminais>  {
    
    private String idTerminal;
    private String numSerie;
    private String equipamentCode;
    private String ip;
    private String mascara;
    private String gateway;
    private String modelo;
    public static List<Terminais> retornoTerminais = new ArrayList<>();
    
    public Terminais(){
        super();
    }
    
    public Terminais(String idTerminal, String numSerie, String equipamentCode,
                     String ip, String mascara, String gateway, String modelo){
        
        this.idTerminal = idTerminal;
        this.numSerie = numSerie;
        this.equipamentCode = equipamentCode;
        this.ip = ip;
        this.mascara = mascara;
        this.gateway = gateway;       
        
    }

    /**
     * @return the idTerminal
     */
    public String getIdTerminal() {
        return idTerminal;
    }

    /**
     * @return the numSerie
     */
    public String getNumSerie() {
        return numSerie;
    }

    /**
     * @return the equipamentCode
     */
    public String getEquipamentCode() {
        return equipamentCode;
    }

    /**
     * @return the ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * @return the mascara
     */
    public String getMascara() {
        return mascara;
    }

    /**
     * @return the gateway
     */
    public String getGateway() {
        return gateway;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    @Override
    public int compareTo(Terminais outroTer) {
        
        int i = Integer.parseInt(this.idTerminal);
        int j = Integer.parseInt(outroTer.idTerminal);
        
        if (i < j) {
          return -1;
        }

        if (i > j) {
          return 1;
        }
        return 0;
        
    }
       
}

    

