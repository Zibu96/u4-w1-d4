package entities;

import enums.Dipartimento;

public class DipendenteFullTime extends Dipendente {


    public DipendenteFullTime(int matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }


    @Override
    public double calculatedSalary(int giorniLavorati) {
        return super.calculatedSalary(giorniLavorati);
    }
}
