package entities;

import interfaces.CheckIn;

public class Volontario implements CheckIn {

    protected String nome;
    protected int età;
    protected String CV;

    public Volontario(String nome, int età, String CV) {
        this.nome = nome;
        this.età = età;
        this.CV = CV;

    }

    @Override
    public void checkIn() {
        System.out.println("sto iniziando il mio volontariato di 6 ore");
    }
}
