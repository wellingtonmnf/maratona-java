package academy.devdojo.maratonajava.javacore.colecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga>{

    private Long id;
    private String nome;
    private double preco;

    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(id,"ID não pode ser nulo");
        Objects.requireNonNull(nome, "Nome não pode ser nulo");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "ID = " + id +
                ", Nome = '" + nome + '\'' +
                ", Preço = " + preco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome) && Objects.equals(preco, manga.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Manga outroManga) {
        //Se o atributo de this < outroManga, retorna negativo
        //Se o atributo de this = outroManga, retorna zero
        //Se o atributo de this > outroManga, retorna positivo

        //Implementação de lógica do compareTo()
//        if (this.id < outroManga.getId()){
//            return -1;
//        } else if (this.id.equals(outroManga.getId())) {
//            return 0;
//        } else {
//            return 1;
//        }

        // Caso os elementos sejam classes Wrapper, as mesmas já possuem
        // uma implementação de compareTo() que pode ser utilizada

        // O ideal é delegar a responsabilidade para as classes do Java
        // para evitar implementar código de forma desnecessária

        //return this.id.compareTo(outroManga.getId()); //Comparação por ID
        return this.nome.compareTo(outroManga.getNome()); //Comparação por nome
        //return Double.valueOf(preco).compareTo(outroManga.getPreco()); //Comparação por preço
        //return Double.compare(preco, outroManga.getPreco()); //Comparação por preço
    }
}