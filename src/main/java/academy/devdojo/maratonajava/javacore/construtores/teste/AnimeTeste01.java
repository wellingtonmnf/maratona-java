package academy.devdojo.maratonajava.javacore.construtores.teste;

import academy.devdojo.maratonajava.javacore.construtores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Death Note","TV",37, "Ação","Toey Animation");
        anime.imprime();
    }
}
