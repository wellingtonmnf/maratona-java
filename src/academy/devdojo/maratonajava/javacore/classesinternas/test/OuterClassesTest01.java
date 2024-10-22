package academy.devdojo.maratonajava.javacore.classesinternas.test;

public class OuterClassesTest01 {

    private String name = "Monkey D. Luffy";

    class Inner {
        public void printOuterClassAtribbute() {
            System.out.println(name);
            // O 'this' sempre faz referência a classe interna
            System.out.println(this);
            // É necessário chamar o 'this' dessa forma para a classe externa
            System.out.println(OuterClassesTest01.this);
        }
    }

    public static void main(String[] args) {
        // Primeira maneira de instaciar a classe interna
        OuterClassesTest01 outerClassesTest01 = new OuterClassesTest01();
        Inner inner = outerClassesTest01.new Inner();
        // Segunda maneira de instaciar a classe interna
        Inner inner1 = new OuterClassesTest01().new Inner();
        // Terceira maneira de instaciar a classe interna
        OuterClassesTest01.Inner inner2 = new OuterClassesTest01().new Inner();
        // Imprimindo o mesmo resultado
        inner.printOuterClassAtribbute();
        inner1.printOuterClassAtribbute();
        inner2.printOuterClassAtribbute();
    }
}