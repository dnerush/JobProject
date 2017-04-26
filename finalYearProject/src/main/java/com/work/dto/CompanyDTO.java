package com.work.dto;

import com.work.model.Vacancy;

import java.util.List;

public class CompanyDTO {

    private AccountDTO accountDTO = new AccountDTO();
    private String name;
    private String type;
    private String description;
    private String logo;
    private String country;
    private String city;
    private List<Vacancy> vacancies;

    public CompanyDTO(){
        super();
    }

    public CompanyDTO(long id, String login, String password, String email, String phone,
                   String name, String type, String description, String logo, String country,
                   String city, List<Vacancy> vacancies) {
        accountDTO.setLogin(login);
        accountDTO.setPassword1(password);
        accountDTO.setEmail(email);
        accountDTO.setPhone(phone);
        this.name = name;
        this.type = type;
        this.description = description;
        this.logo = logo;
        this.country = country;
        this.city = city;
        this.vacancies = vacancies;
    }

    public long getId() {
        return accountDTO.getId();
    }

    public void setId(long id) {
        accountDTO.setId(id);
    }

    public String getLogin() {
        return accountDTO.getLogin();
    }

    public void setLogin(String login) {
        accountDTO.setLogin(login);
    }

    public String getPassword1() {
        return accountDTO.getPassword1();
    }

    public void setPassword1(String password) {
        accountDTO.setPassword1(password);
    }

    public String getPassword2() {
        return accountDTO.getPassword2();
    }

    public void setPassword2(String password) {
        accountDTO.setPassword2(password);
    }

    public String getEmail() {
        return accountDTO.getEmail();
    }

    public void setEmail(String email) {
        accountDTO.setEmail(email);
    }

    public String getPhone() {
        return accountDTO.getPhone();
    }

    public void setPhone(String phone) {
        accountDTO.setPhone(phone);
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

    public List<Vacancy> getVacancies() {
        return vacancies;
    }

    public void setVacancies(List<Vacancy> vacancies) {
        this.vacancies = vacancies;
    }

    @Override
    public String toString() {
        return "CompanyDTO{" +
                "accountDTO=" + accountDTO +
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

        CompanyDTO that = (CompanyDTO) o;

        if (accountDTO != null ? !accountDTO.equals(that.accountDTO) : that.accountDTO != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (logo != null ? !logo.equals(that.logo) : that.logo != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        return vacancies != null ? vacancies.equals(that.vacancies) : that.vacancies == null;
    }

    @Override
    public int hashCode() {
        int result = accountDTO != null ? accountDTO.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (logo != null ? logo.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (vacancies != null ? vacancies.hashCode() : 0);
        return result;
    }
}
