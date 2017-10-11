package com.training.Domain;

/**
 * Created by KH389659 on 10/10/2017.
 */
public class CardHolder extends Abstractentity {

    private String cardNumber;
    private Company company;

    public CardHolder(String name) {
        super(name);
    }

    public CardHolder(String name, String cardNumber) {
        super(name);
        this.cardNumber = cardNumber;
    }

    public CardHolder(String name, String cardNumber, Company company) {
        super(name);
        this.cardNumber = cardNumber;
        this.company = company;
    }

    @Override
    public String toString() {
        return "CardHolder{" +
                "name='" + name + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                 '}';
    }


}
