import person.Builder;
import person.Driver;
import person.Programmer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Khafiz",18);
        System.out.println(driver.toString());
        Programmer programmer = new Programmer("Kanykei",16);
        System.out.println(programmer.toString());
        Builder builder = new Builder("Madina",17);
        System.out.println(builder.toString());
    }
}