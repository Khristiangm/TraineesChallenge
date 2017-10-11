package com.training.Domain;

/**
 * Created by KH389659 on 11/10/2017.
 */
public abstract class Abstractentity {

    protected String name;

    public Abstractentity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("[Name= %s]", this.name);
    }
}
