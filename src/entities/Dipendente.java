package entities;

import enums.Dipartimento;

public abstract class Dipendente {

    protected int matricola;
    protected double stipendio;
    protected Dipartimento dipartimento;

    public Dipendente(int matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public double calculatedSalary(int giorniLavorati) {

        if (giorniLavorati == 24) {
            return (this.stipendio * 8) * 24;

        } else if (giorniLavorati == 26) {
            return (this.stipendio * 8) * 26;

        } else if (giorniLavorati == 28) {
            return (this.stipendio * 8) * 26;

        } else if (giorniLavorati == 30) {
            return (this.stipendio * 8) * 30;
        } else return 0;
    }
}
