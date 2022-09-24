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

    public void setKm(Integer km) {
        this.km = km;
    }

    public Integer getQuant() {
        return quant;
    }

    public void setQuant(Integer quant) {
        this.quant = quant;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = String.valueOf(dia);
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
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
