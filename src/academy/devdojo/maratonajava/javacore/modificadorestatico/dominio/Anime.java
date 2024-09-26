package academy.devdojo.maratonajava.javacore.modificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    //Bloco de inicialização estático
    static {
        System.out.println("Bloco de inicialização estático 01");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = (i+1);
        }
    }

    static {
        System.out.println("Bloco de inicialização estático 02");
    }

    static {
        System.out.println("Bloco de inicialização estático 03");
    }
    //Bloco de inicialização de instância
    {
        System.out.println("Bloco de inicialização não estático 01");
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodios : this.episodios){
            System.out.print(episodios + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return this.nome;
    }

    public int[] getEpisodios() {
        return this.episodios;
    }
}
