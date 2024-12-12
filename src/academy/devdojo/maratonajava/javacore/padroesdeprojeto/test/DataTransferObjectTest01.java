package academy.devdojo.maratonajava.javacore.padroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.padroesdeprojeto.dominio.*;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person person = new Person.PersonBuilder()
                .firstName("William")
                .lastName("Suane")
                .username("ViradoNoJiraya")
                .email("william.suane@devdojo.academy")
                .build();

        ReportDto reportDto = ReportDto.ReportDtoBuilder
                .builder()
                .aircraftName(aircraft.getName())
                .country(country)
                .currency(currency)
                .personName(person.getFirstName() + " " + person.getLastName())
                .build();

        System.out.println(reportDto);
    }
}
