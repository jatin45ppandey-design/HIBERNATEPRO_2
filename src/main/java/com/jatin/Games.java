package com.jatin;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Games
{
    @Id
    private int id = 1;
    private String names = "RDR2";
    private int prices=5000;

    public int getPrices() {
        return prices;
    }

    public void setPrices(int prices) {
        this.prices = prices;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Games{" +
                "id=" + id +
                ", names='" + names + '\'' +
                ", prices=" + prices +
                '}';
    }
}

