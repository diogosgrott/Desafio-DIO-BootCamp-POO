package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    private String Titulo;
    private String descricao;
    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        Titulo = titulo;
        this.descricao = descricao;
        this.data = data;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "Titulo='" + Titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }
}
