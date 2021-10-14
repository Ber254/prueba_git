package pruebagit.entidades;

import pruebagit.utilidades.PalosCarta;

public class Carta {

    private Integer valor;
    private PalosCarta palo;

    public Carta() {
    }

    public Carta(Integer valor, PalosCarta palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public PalosCarta getPalo() {
        return palo;
    }

    public void setPalo(PalosCarta palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "valor=" + valor + ", palo=" + palo + '}';
    }
}
