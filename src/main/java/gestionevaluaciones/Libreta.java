/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionevaluaciones;

/**
 *
 * @author melil
 */
public class Libreta {
    String[] notasMate;
    String[] notasLeng;
    String[] notasHist;
    String[] notasCien;

    public String[] getNotasMate() {
        return notasMate;
    }

    public void setNotasMate(String[] notasMate) {
        this.notasMate = notasMate;
    }

    public String[] getNotasLeng() {
        return notasLeng;
    }

    public void setNotasLeng(String[] notasLeng) {
        this.notasLeng = notasLeng;
    }

    public String[] getNotasHist() {
        return notasHist;
    }

    public void setNotasHist(String[] notasHist) {
        this.notasHist = notasHist;
    }

    public String[] getNotasCien() {
        return notasCien;
    }

    public void setNotasCien(String[] notasCien) {
        this.notasCien = notasCien;
    }

    public Libreta(String[] notasMate, String[] notasLeng, String[] notasHist, String[] notasCien) {
        this.notasMate = notasMate;
        this.notasLeng = notasLeng;
        this.notasHist = notasHist;
        this.notasCien = notasCien;
    }
}
