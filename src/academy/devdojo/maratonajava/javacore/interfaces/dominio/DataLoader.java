package academy.devdojo.maratonajava.javacore.interfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();

    default void checkingPermission(){
        System.out.println("Checando permissões");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
