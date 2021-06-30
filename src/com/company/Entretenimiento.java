package com.company;

public abstract class Entretenimiento {
    private String titulo;
    private boolean prestado;
    private Genero genero;

    public Entretenimiento(){
        this.prestado = false;
    }

    public Entretenimiento(String titulo, Genero genero) {
        this.titulo = titulo;
        this.genero = genero;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Entretenimiento{" +
                "titulo='" + titulo + '\'' +
                ", entregado=" + prestado +
                ", genero=" + genero +
                '}';
    }

    public boolean isEntregado(){
        return prestado;
    }

    public void entregar(){
        this.prestado = true;
    }

    public void devolver(){
        this.prestado = false;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (! (obj instanceof Entretenimiento)) return false;
        Entretenimiento serie = (Entretenimiento) obj;
        return titulo == serie.getTitulo();
    }
}
