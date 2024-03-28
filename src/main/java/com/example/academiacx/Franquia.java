package com.example.academiacx;

import jakarta.persistence.*;

@Entity
@Table(name = "franquia")
public class Franquia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn (name ="genero_id")
    private Genero genre;

    @ManyToOne
    @JoinColumn (name  = "estudio_id")
    private Estudio studio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genero getGenre() {
        return genre;
    }

    public void setGenre(Genero genre) {
        this.genre = genre;
    }

    public Estudio getStudio() {
        return studio;
    }

    public void setStudio(Estudio studio) {
        this.studio = studio;
    }
}
