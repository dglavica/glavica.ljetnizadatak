/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Avalg
 */
public class Tvrtka extends Entitet {

    private String nazivTvrtke;
    private String oib;
    private String vlasnik;
    private String djelatnost;

    public String getNazivTvrtke() {
        return nazivTvrtke;
    }

    public void setNazivTvrtke(String nazivTvrtke) {
        this.nazivTvrtke = nazivTvrtke;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public String getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(String vlasnik) {
        this.vlasnik = vlasnik;
    }

    public String getDjelatnost() {
        return djelatnost;
    }

    public void setDjelatnost(String djelatnost) {
        this.djelatnost = djelatnost;
    }

    @Override
    public String toString() {
        return "Tvrtka (" + nazivTvrtke + ')';
    }

}
