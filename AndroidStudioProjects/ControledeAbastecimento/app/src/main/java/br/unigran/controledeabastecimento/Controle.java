package br.unigran.controledeabastecimento;

import java.util.Date;

public class Controle {

    private Integer km;
    private Integer quant;
    private String dia;
    private Integer valor;
    private Integer id;

    public Integer getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public Integer getQuant() {
        return quant;
    }

    public void setQuant(String quant) {
        this.quant = quant;
    }

    public String getDia(String string) {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = String.valueOf(dia);
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Controle{" +
                "km=" + km +
                ", quant=" + quant +
                ", dia='" + dia + '\'' +
                ", valor=" + valor +
                ", id=" + id +
                '}';
    }
}
