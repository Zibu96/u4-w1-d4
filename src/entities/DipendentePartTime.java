package entities;

import enums.Dipartimento;
import interfaces.CheckIn;

public class DipendentePartTime extends Dipendente implements CheckIn {
    public DipendentePartTime(int matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    public double calculatedSalary(int giorniLavorati) {

        if (giorniLavorati == 24) {
            return (this.stipendio * 5) * 24;

        } else if (giorniLavorati == 26) {
            return (this.stipendio * 5) * 26;

        } else if (giorniLavorati == 28) {
            return (this.stipendio * 5) * 26;

        } else if (giorniLavorati == 30) {
            return (this.stipendio * 5) * 30;
        } else return 0;
    }


    @Override
    public void checkIn() {
        System.out.println("sto iniziando il mio turno di 5 ore");
    }
}
