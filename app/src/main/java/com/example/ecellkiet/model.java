package com.example.ecellkiet;

public class model {
    String Purl,Name,Year,Domain;


    model()
    {

    }

    public model(String purl, String name, String year, String domain) {
        Purl = purl;
        Name = name;
        Year = year;
        Domain = domain;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }
    public String getDomain() {
        return Domain;
    }

    public void setDomain(String domain) {
        Domain = domain;
}

    public String getPurl() {
        return Purl;
    }

    public void setPurl(String purl) {
        Purl = purl;
    }
}
