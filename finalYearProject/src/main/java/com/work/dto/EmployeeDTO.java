package com.work.dto;

import com.work.model.CV;

public class EmployeeDTO {

    private AccountDTO accountDTO = new AccountDTO();
    private String name;
    private String secondName;
    private Integer age;
    private String sex;
    private String photoPath;
    private String country;
    private String city;
    private CV cv;

    public EmployeeDTO(){
        super();
    }

    public EmployeeDTO(long id, String login, String password, String email, String phone,
                    String name, String surname, String secondName, Integer age, String sex,
                    String photoPath, String country, String city, CV cv) {
        accountDTO.setLogin(login);
        accountDTO.setPassword1(password);
        accountDTO.setEmail(email);
        accountDTO.setPhone(phone);
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.sex = sex;
        this.photoPath = photoPath;
        this.country = country;
        this.city = city;
        this.cv = cv;
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

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
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

    public CV getCv() {
        return cv;
    }

    public void setCv(CV cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "accountDTO=" + accountDTO +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", photoPath='" + photoPath + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", cv=" + cv +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeDTO that = (EmployeeDTO) o;

        if (accountDTO != null ? !accountDTO.equals(that.accountDTO) : that.accountDTO != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (secondName != null ? !secondName.equals(that.secondName) : that.secondName != null) return false;
        if (age != null ? !age.equals(that.age) : that.age != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (photoPath != null ? !photoPath.equals(that.photoPath) : that.photoPath != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        return cv != null ? cv.equals(that.cv) : that.cv == null;
    }

    @Override
    public int hashCode() {
        int result = accountDTO != null ? accountDTO.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (photoPath != null ? photoPath.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (cv != null ? cv.hashCode() : 0);
        return result;
    }
}
