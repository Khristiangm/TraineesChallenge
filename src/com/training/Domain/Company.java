package com.training.Domain;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by KH389659 on 11/10/2017.
 */
public class Company extends Abstractentity {
    private String localization;
    private List<CardHolder> cardHolderArrayList = new ArrayList<>();


    /*
    *LIST = Pode repetir os elementos, sao necessariamente ordenadas, acesso e feito posicionalmente, E possivel inserir valores nulos.
    *SET = Nao pode repetir os elementos, Nao sao necessariamente Ordenados, nao a como acessar posicionalmente os elementos, nao e possivel inserir valores nulos por padrao.
    *MAP
     */
    public Company() {
        this("N/A","N/A");
    }

    public Company(String name, String localization, List<CardHolder> cardHolderArrayList) {
        super(name);
        this.localization = localization;
        this.cardHolderArrayList = cardHolderArrayList;
    }

    public Company(String name, String localization) {
        super(name);
        this.localization = localization;
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", localization='" + localization + '\'' +
                 '}';
    }

}
