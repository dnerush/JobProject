package com.work.model;

import java.util.List;

public class Company  {

    private int id;
    private String name;
    private String type;
    private String description;
    private String logo;
    private String country;
    private String city;

    private List<Vacancy> vacancies;

    public Company() { }

    public Company(int id, String name, String type, String description, String logo, String country, String city) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.logo = logo;
        this.country = country;
        this.city = city;
    }

    public List<Vacancy> getVacancies() {
        return vacancies;
    }

    public void setVacancies(List<Vacancy> vacancies) {
        this.vacancies = vacancies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", logo='" + logo + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", vacancies=" + vacancies +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company company = (Company) o;

        if (id != company.id) return false;
        if (name != null ? !name.equals(company.name) : company.name != null) return false;
        if (type != null ? !type.equals(company.type) : company.type != null) return false;
        if (description != null ? !description.equals(company.description) : company.description != null) return false;
        if (logo != null ? !logo.equals(company.logo) : company.logo != null) return false;
        if (country != null ? !country.equals(company.country) : company.country != null) return false;
        return city != null ? city.equals(company.city) : company.city == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (logo != null ? logo.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }
}
