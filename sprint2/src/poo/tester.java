package poo;

import poo.app.Epass;
import poo.app.EpassStudent;
import poo.app.EpassTurista;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class tester {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Data de nascimento: ");
        String ddn = input.nextLine();

        LocalDate datanasc = null;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-uuu");
        try{
            datanasc = LocalDate.parse(ddn,formatter);
        }
        catch (DateTimeParseException e){
            System.out.println("Deve inserir data no formato dia-mês-ano...");
        }
        System.out.println("Data de nascimento é " + datanasc.format(formatter));
    }
}
