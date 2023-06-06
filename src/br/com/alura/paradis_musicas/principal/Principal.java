package br.com.alura.paradis_musicas.principal;

import br.com.alura.paradis_musicas.modelos.MinhasPreferidas;
import br.com.alura.paradis_musicas.modelos.Musica;
import br.com.alura.paradis_musicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Lose Yourself");
        minhaMusica.setCantor("Eminem");

        for (int i = 0; i < 1999 ; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50 ; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("FlowArtz");
        meuPodcast.setApresentador("Arthur");

        for (int i = 0; i < 5000 ; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000 ; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
