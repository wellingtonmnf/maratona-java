package academy.devdojo.maratonajava.javacore.classesinternas.test;

class Animal {
    public void locomover() {
        System.out.println("Animal se locomovendo");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        // Classe interna anônima
        Animal animal = new Animal() { // Também é uma subclasse de Animal
            @Override
            public void locomover() {
                System.out.println("Animal se mexendo");
                pular(); // Acesso apenas internamente
            }

            public void pular() {
                System.out.println("Animal pulando");
            }
        };

        animal.locomover();
//        animal.pular(); // Não é possível fazer pq a variável não tem acesso ao método

    }
}
