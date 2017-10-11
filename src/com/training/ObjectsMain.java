package com.training;


import com.training.Domain.CardHolder;
import com.training.Domain.Company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by KH389659 on 10/10/2017.
 */
public class ObjectsMain {

    public static CardHolder inputCardHolder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CardHolder Name");
        String name = scanner.nextLine();

        System.out.println("CardHolder Number");
        String cardNumber = scanner.nextLine();
        return new CardHolder(name, cardNumber);
    }

    public static Company inputCompany() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Company Name, ");
        String name = scanner.nextLine();

        System.out.println("Company Localization, ");
        String localization = scanner.nextLine();

        return new Company(name, localization);
    }

    public static void main(String[] args) {

        CardHolder cardHolder1 = inputCardHolder();
        Company company1 = inputCompany();
        System.out.println(cardHolder1);
        System.out.println(company1);


        //       CardHolder khristian = new CardHolder("Khristian", "123456789", new Company("BRADESCO", "BACACHERI"));

//        List<CardHolder> cardHolders = new ArrayList<>();
//        cardHolders.add(khristian);

//        Company hsbc = new Company("HSBC","BRASIL");
//        System.out.println(hsbc.toString());
//
//        Company company1 = inputCompany();
//        System.out.println(company1);


    }
}
