package academy.devdojo.maratonajava.javacore.colecoes.dominio;

public class Smartphone {

    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    // Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null;
    // Simétrico: para x e y diferentes de null, se x.equals(y) == true, logo y.equals(x) == true;
    // Transitividade: para x,y,z diferentes de null, se x.equals(y) == true e x.equals(z) == true, logo y.equals(z) == true;
    // Consistente: x.equals(x) sempre retorna true se x for diferente de null;
    // Não-nulidade: para x diferente de null, x.equals(null) tem que retornar false;
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return (serialNumber != null && serialNumber.equals(smartphone.serialNumber));
    }

    // Se x.equals(y) == true, x.hashCode() == y.hashCode();
    // x.hashCode() == y.hashCode(), não necessariamente o equals de x.equals(y) tem que ser true;
    // Se x.hashCode() != y.hashCode(), x.equals(y) == false ;
    @Override
    public int hashCode() {
        return this.serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "Serial Number = '" + serialNumber + '\'' +
                ", Marca = '" + marca + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}