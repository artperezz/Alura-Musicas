package br.com.alura.paradis_musicas.modelos;

public class Musica extends Audio{
    private String album;
    private String Cantor;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return Cantor;
    }

    public void setCantor(String cantor) {
        Cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalReproducoes() > 2000){
            return 10;
        } else {
            return 7;
        }

    }
}
