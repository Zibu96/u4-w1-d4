package entities;

import enums.Dipartimento;

public class DipendenteFullTime extends Dipendente {


    public DipendenteFullTime(int matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }


    public double calculatedSalary(int giorniLavorati) {

        switch (giorniLavorati) {

            case 24:
                this.stipendio = (12.2 * 8) * 24;
                break;
            case 26:
                this.stipendio = (12.2 * 8) * 26;
                break;
            case 28:
                this.stipendio = (12.2 * 8) * 28;
                break;
            default:
                this.stipendio = (12.2 * 8) * 20;
        }
        return this.stipendio;
    }
}
