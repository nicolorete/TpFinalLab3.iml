package com.company;

public class VideoJuego extends Entretenimiento{
    private int horas_juego;
    private String compania;

    public VideoJuego(){
        super();
        this.horas_juego = 10;
    }

    public VideoJuego(String titulo, String compania) {
        super();
        this.setTitulo(titulo);
        this.compania = compania;
        this.horas_juego = 10;
    }

    public VideoJuego(String titulo, int horas_juego, Genero genero, String compania) {
        super(titulo, genero);
        this.horas_juego = horas_juego;
        this.compania = compania;
    }

    public int getHoras_juego() {
        return horas_juego;
    }

    public void setHoras_juego(int horas_juego) {
        this.horas_juego = horas_juego;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "titulo='" + this.getTitulo() + '\'' +
                ", horas_juego=" + horas_juego +
                ", entregado=" + this.isEntregado() +
                ", genero=" + this.getGenero() +
                ", compania='" + compania + '\'' +
                '}';
    }

    public boolean compareTo(Object obj){
        Boolean result = false;
        if (obj instanceof VideoJuego){
            VideoJuego videoObj = (VideoJuego) obj;
            if (horas_juego == videoObj.getHoras_juego()) {
                result = true;
            }
        }
        return result;
    }
}
