package entities;

import enums.Dipartimento;
import interfaces.CheckIn;

public class Dirigente extends Dipendente implements CheckIn {
    public Dirigente(int matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
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

    @Override
    public void checkIn() {
        System.out.println("sto iniziando la mia riunione di 4 ore");
    }
}
