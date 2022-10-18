package com.example.assignment1gc200474224;

public class NuclearArms {

    String country,countryCode;
    int year,amountOfWeapons,id;

    public NuclearArms(String country, String countryCode, int year, int amountOfWeapons, int id){

        this.country = country;
        this.countryCode = countryCode;
        this.year = year;
        this.amountOfWeapons = amountOfWeapons;
        this.id = id;

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAmountOfWeapons() {
        return amountOfWeapons;
    }

    public void setAmountOfWeapons(int amountOfWeapons) {
        this.amountOfWeapons = amountOfWeapons;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
