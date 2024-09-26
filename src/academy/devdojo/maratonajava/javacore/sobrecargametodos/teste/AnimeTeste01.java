package academy.devdojo.maratonajava.javacore.sobrecargametodos.teste;

import academy.devdojo.maratonajava.javacore.sobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Death Note","TV",37, "Ação");
        anime.imprime();
    }
}
