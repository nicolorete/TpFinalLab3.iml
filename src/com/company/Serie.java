package com.company;

public class Serie extends Entretenimiento{
    private int cant_temporada;
    private String creador;

    public Serie(){
        super();
        this.cant_temporada = 3;
    }

    public Serie(String titulo, String creador) {
        super();
        this.setTitulo(titulo);
        this.creador = creador;
        this.cant_temporada = 3;
    }

    public Serie(String titulo, int cant_temporada, Genero genero, String creador) {
        super(titulo, genero);
        this.cant_temporada = cant_temporada;
        this.creador = creador;
    }

    public int getCant_temporada() {
        return cant_temporada;
    }

    public void setCant_temporada(int cant_temporada) {
        this.cant_temporada = cant_temporada;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "cant_temporada=" + cant_temporada +
                ", creador='" + creador + '\'' +
                ", genero='" + this.getGenero() + '\'' +
                ", titulo='" + this.getTitulo() + '\'' +
                ", entregado='" + this.isEntregado() + '\'' +
                '}';
    }

    public boolean compareTo(Object obj){
        Boolean result = false;
        if (obj instanceof Serie){
            Serie serieObj = (Serie) obj;
            if (cant_temporada == serieObj.getCant_temporada()) {
                result = true;
            }
        }
        return result;
    }

}
