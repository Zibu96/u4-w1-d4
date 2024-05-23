package entities;

import enums.Dipartimento;
import interfaces.CheckIn;

public class DipendenteFullTime extends Dipendente implements CheckIn {


    public DipendenteFullTime(int matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }


    @Override
    public double calculatedSalary(int giorniLavorati) {
        return super.calculatedSalary(giorniLavorati);
    }

    @Override
    public void checkIn() {
        System.out.println("sto iniziando il mio turno di 8 ore");
    }
}
