package entities;

import enums.Dipartimento;
import interfaces.CheckIn;

public class Main {
    public static void main(String[] args) {


        //   Dipendente dipendente1 = new Dipendente((int) (Math.random() * 100), 2345.70, Dipartimento.VENDITE);
        //  Dipendente dipendente2 = new Dipendente((int) (Math.random() * 100), 3698.85, Dipartimento.AMMINISTRAZIONE);
        //   Dipendente dipendente3 = new Dipendente((int) (Math.random() * 100), 1964.20, Dipartimento.PRODUZIONE);


        //   dipendente1.setDipartimento(Dipartimento.PRODUZIONE);
        //   dipendente2.setDipartimento(Dipartimento.VENDITE);
//        dipendente3.setDipartimento(Dipartimento.AMMINISTRAZIONE);

//        Dipendente[] arrOfDipendenti = {dipendente1, dipendente2, dipendente3};
//        for (Dipendente dipendente : arrOfDipendenti) {
//            System.out.println("Dipendente con matricola " + dipendente.getMatricola());


        DipendenteFullTime dipendente1 = new DipendenteFullTime((int) (Math.random() * 100), 12.2, Dipartimento.VENDITE);
        DipendenteFullTime dipendente2 = new DipendenteFullTime((int) (Math.random() * 100), 12.2, Dipartimento.VENDITE);

        System.out.println("il salario del dipendente è di " + dipendente1.calculatedSalary(26));
        System.out.println("il salario del dipendente è di " + dipendente2.calculatedSalary(24));

        DipendentePartTime dipendente3 = new DipendentePartTime((int) (Math.random() * 100), 12.2, Dipartimento.VENDITE);
        DipendentePartTime dipendente4 = new DipendentePartTime((int) (Math.random() * 100), 12.2, Dipartimento.VENDITE);

        System.out.println("il salario del dipendente è di " + dipendente3.calculatedSalary(26));
        System.out.println("il salario del dipendente è di " + dipendente4.calculatedSalary(24));

        Dirigente dipendente5 = new Dirigente((int) (Math.random() * 100), 19.4, Dipartimento.VENDITE);
        Dirigente dipendente6 = new Dirigente((int) (Math.random() * 100), 19.4, Dipartimento.VENDITE);

        System.out.println("il salario del dipendente è di " + dipendente5.calculatedSalary(26));
        System.out.println("il salario del dipendente è di " + dipendente6.calculatedSalary(24));

        Dipendente[] arrOfDipendenti = {dipendente1, dipendente2, dipendente3, dipendente4, dipendente5, dipendente6};
        for (int i = 0; i < arrOfDipendenti.length; i++) {
            System.out.println("il salario del dipendente con matricola " + arrOfDipendenti[i].getMatricola() + " è di " + arrOfDipendenti[i].calculatedSalary(26));

        }
        Volontario volontario1 = new Volontario("gino", 32, "developer");
        CheckIn[] checkedIn = {dipendente1, dipendente6, volontario1};
    }


}