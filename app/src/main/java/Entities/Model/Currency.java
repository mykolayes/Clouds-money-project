package Entities.Model;


public class Currency {

    String country;
    String symbol;

    public Currency(String country, String symbol) {
        this.country = country;
        this.symbol = symbol;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCountry() {
        return country;
    }

    public String getSymbol() {
        return symbol;
    }
}

