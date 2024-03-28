package com.example.academiacx;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "filmes")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String sinopse;
    private Integer anoLancamento;

    @ManyToOne
    @JoinColumn(name = "genero_id")
    private Genero genero;

    @ManyToOne
    @JoinColumn(name = "estudio_id")
    private Estudio estudio;

    @ManyToOne
    @JoinColumn(name = "franquia")
    private Franquia franquia;

    @OneToMany(mappedBy = "filme")
    private List<Streaming> streaming;

    @ManyToOne
    @JoinColumn(name = "diretor_id")
    private Diretor diretor;

    @ManyToOne
    @JoinColumn(name = "ator_id")
    private Ator ator;

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public String getSinopse() {

        return sinopse;
    }

    public void setSinopse(String sinopse) {

        this.sinopse = sinopse;
    }

    public Integer getAnoLancamento() {

        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {

        this.anoLancamento = anoLancamento;
    }

    public Genero getGenero() {

        return genero;
    }

    public void setGenero(Genero genero) {

        this.genero = genero;
    }

    public Estudio getEstudio() {

        return estudio;
    }

    public void setEstudio(Estudio estudio) {

        this.estudio = estudio;
    }

    public Franquia getFranquia() {
        return franquia;
    }

    public void setFranquia(Franquia franquia) {
        this.franquia = franquia;
    }

    public List<Streaming> getStreaming() {
        return streaming;
    }

    public void setStreaming(List<Streaming> streaming) {
        this.streaming = streaming;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public Ator getAtor() {
        return ator;
    }

    public void setAtor(Ator ator) {
        this.ator = ator;
    }
}
