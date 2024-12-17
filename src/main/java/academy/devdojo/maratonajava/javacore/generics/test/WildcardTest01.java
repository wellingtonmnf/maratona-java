package academy.devdojo.maratonajava.javacore.generics.test;


abstract class Animal{
    public abstract void consulta();
}

class Cachorro extends Animal{

    @Override
    public void consulta() {
        System.out.println("Consultando cachorro");
    }
}

class Gato extends Animal{

    @Override
    public void consulta() {
        System.out.println("Consultando gato");
    }
}

public class WildcardTest01 {
    public static void main(String[] args) {

        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};

        printConsulta(cachorros);
        printConsulta(gatos);

        Animal[] animals = {new Gato(), new Cachorro()};
        Animal animal = new Gato();

        printConsulta(animals);

    }
    /* Utilizando arrays, o Generics funciona normalmente
     * com as regras de herança e polimorfismo, pois o Java
     * entende o que existe dentro dos arrays em tempo de execução
     */
    public static void printConsulta(Animal[] animals){
        for (Animal animal : animals) {
            animal.consulta();
        }
//        animals[1] = new Gato(); // Lança uma ArrayStoreException
        /* A linha acima está tentando colocar um objeto do tipo Gato
         * em um array do tipo Cachorro na primeira chamada do método.
         * Logo, será lançada uma exceção.
         */

    }
}
