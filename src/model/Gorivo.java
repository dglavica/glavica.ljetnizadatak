/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigDecimal;

/**
 *
 * @author Avalg
 */
public class Gorivo extends Entitet {

    private String vrsta;
    private BigDecimal prodajnaCijena;
    private BigDecimal kapacitetSpremnika;

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public BigDecimal getProdajnaCijena() {
        return prodajnaCijena;
    }

    public void setProdajnaCijena(BigDecimal prodajnaCijena) {
        this.prodajnaCijena = prodajnaCijena;
    }

    public BigDecimal getKapacitetSpremnika() {
        return kapacitetSpremnika;
    }

    public void setKapacitetSpremnika(BigDecimal kapacitetSpremnika) {
        this.kapacitetSpremnika = kapacitetSpremnika;
    }

    @Override
    public String toString() {
        return "Gorivo (" + vrsta + ')';
    }

}
