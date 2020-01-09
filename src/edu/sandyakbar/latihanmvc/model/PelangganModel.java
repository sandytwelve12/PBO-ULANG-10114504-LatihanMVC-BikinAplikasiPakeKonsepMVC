/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sandyakbar.latihanmvc.model;

import edu.sandyakbar.latihanmvc.event.PelangganListener;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 * NAMA      : Sandy Akbar
 * KELAS     : PBO-ULANG
 * NIM       : 10114504
 * Deskripsi :
 */
public class PelangganModel {
    
    
    private String nama;
    private String email;
    private String noTelp;
    
    private PelangganListener PelangganListener;

    public PelangganListener getPelangganListener() {
        return PelangganListener;
    }

    public void setPelangganListener(PelangganListener PelangganListener) {
        this.PelangganListener = PelangganListener;
    }
    
    
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public String getNoTelp() {
        return noTelp;
    }
    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
        fireOnChange();
    }
    protected void fireOnChange(){
        if (PelangganListener!=null){
            PelangganListener.onChange(this);
        }
    }
    
    public void resetForm(){
        setNama("");
        setEmail("");
        setNoTelp("");
    
    }
    public void simpanForm(){
        JOptionPane.showMessageDialog(null,"Berhasil Disimpan");

    }
    
}