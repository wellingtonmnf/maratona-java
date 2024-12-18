package academy.devdojo.maratonajava.javacore.classesinternas.test;

public class OuterClassesTest02 {

    private String name = "Midoryia";

    void print(final String param) {

        String lastName = "Izuku"; // Variável local efetivamente final
//        lastName = "Uzumaki"; // Não é possível fazer alterações. A variável precisa ser final ou efetivamente final

        class LocalClass {
            public void printLocal() {
                System.out.println(param);
                System.out.println(name + " " + lastName);
            }
        }
        // Primeira maneira de instaciar a classe interna
        LocalClass localClass = new LocalClass();
        localClass.printLocal();
        // Segunda maneira de instaciar a classe interna
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {

        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print("Olá!");
    }
}
