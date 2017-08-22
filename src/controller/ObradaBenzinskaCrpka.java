/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.BenzinskaCrpka;

/**
 *
 * @author Avalg
 */
public class ObradaBenzinskaCrpka {

    private Connection veza;
    private PreparedStatement izraz;
    private ResultSet rs;

    public ObradaBenzinskaCrpka() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            veza = DriverManager.getConnection("jdbc:mysql://127.0.0.1/benzinska_crpka", "edunova", "edunova");
        } catch (Exception e) {

        }

    }

    public void zatvoriVezu() {
        try {
            veza.close();
        } catch (SQLException ex) {

        }
    }

    public List<BenzinskaCrpka> getBenzinskeCrpke() {

        List<BenzinskaCrpka> benzinskeCrpke = new ArrayList<>();
        try {
            izraz = veza.prepareStatement("select * from benzinska_crpka where obrisano=false");
            rs = izraz.executeQuery();
            BenzinskaCrpka bc;
            while (rs.next()) {
                bc = new BenzinskaCrpka();
                bc.setSifra(rs.getInt("sifra"));
                bc.setNaziv(rs.getString("naziv"));
                bc.setAdresa(rs.getString("adresa"));
                bc.setOib(rs.getString("oib"));
                bc.setEmail(rs.getString("email"));

                benzinskeCrpke.add(bc);
            }
            rs.close();
            izraz.close();
        } catch (Exception e) {

        }
        return benzinskeCrpke;
    }

    public void kreirajBenzinskaCrpka(BenzinskaCrpka bc) {
        try {
            izraz = veza.prepareStatement("insert into benzinska_crpka (naziv, adresa, oib, email) values (?,?,?,?)");
            izraz.setString(1, bc.getNaziv());
            izraz.setString(2, bc.getAdresa());
            izraz.setString(3, bc.getOib());
            izraz.setString(4, bc.getEmail());
            izraz.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void promjeniBenzinskaCrpka(BenzinskaCrpka bc) {
        try {
            izraz = veza.prepareStatement("update benzinska_crpka set naziv=?, adresa=?, oib=?, email=? where sifra=?");
            izraz.setString(1, bc.getNaziv());
            izraz.setString(2, bc.getAdresa());
            izraz.setString(3, bc.getOib());
            izraz.setString(4, bc.getEmail());
            izraz.setInt(5, bc.getSifra());
            izraz.execute();
        } catch (Exception e) {

        }
    }

    public void obrisiBenzinskaCrpka(BenzinskaCrpka bc) {
        try {
            izraz = veza.prepareStatement("update benzinska_crpka set obrisano=true where sifra=?");
            izraz.setInt(1, bc.getSifra());
            izraz.execute();
        } catch (Exception e) {

        }
    }

}
