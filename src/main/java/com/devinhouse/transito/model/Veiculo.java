package com.devinhouse.transito.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="VEICULOS")
public class Veiculo {
    @Id
    private String placa;

    @Enumerated(EnumType.STRING)
    private TipoVeiculo tipoVeiculo;
    private String nome;
    private Integer anoFabricacao;
    private String cor;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "veiculo")
    private List<Multa> multas;

    public Veiculo() {

    }

    public Veiculo(String placa, TipoVeiculo tipoVeiculo, String nome, Integer anoFabricacao, String cor){
        this.placa = placa;
        this.tipoVeiculo = tipoVeiculo;
        this.nome = nome;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", tipoVeiculo=" + tipoVeiculo +
                ", nome='" + nome + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                ", cor='" + cor + '\'' +
                '}';
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public List<Multa> getMultas() {
        return multas;
    }

    public void setMultas(List<Multa> multas) {
        this.multas = multas;
    }
}
