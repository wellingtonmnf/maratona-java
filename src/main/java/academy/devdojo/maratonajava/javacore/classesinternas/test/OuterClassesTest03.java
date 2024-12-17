package academy.devdojo.maratonajava.javacore.classesinternas.test;

public class OuterClassesTest03 {

    private String name = "William";

    static class Nested {
        /* Pode acessar normalmente atributos não-estáticos
         * dentro da classe interna, pois eles tornam-se
         * atributos finais
         */
        private String lastName = "Suane";

        void print() {
            // Para acessar um atributo não-estático externo
            // é necessário instanciar a classe externa
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        // Não é necessário instanciar a classe externa
        // para usar os recursos da classe interna aninhada estática
        Nested nested = new Nested();
        nested.print();
    }
}
