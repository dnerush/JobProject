package com.work.model;

public class CV {
    private int id;
    private String name;
    private String secondName;
    private String patronymic; // отчество
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private Boolean sex; // false - мужской, male - женский
    private String residentialAddress; // адрес проживания
    private String registrationAddress; // адрес регистрации
    private String citizenship; // гражданство
    private String email;
    private String mobilePhone;
    private String additionalTelephone;
    private String skype;
    private String school;
    private String specialty;
    private String levelOfTraining;
    private String typeOfTraining;
    private int yearOfEnding;


    public CV() { }

    public CV(int id, String name, String secondName, String patronymic, int dayOfBirth, int monthOfBirth,
              int yearOfBirth, Boolean sex, String residentialAddress, String registrationAddress,
              String citizenship, String email, String mobilePhone, String additionalTelephone, String skype,
              String school, String specialty, String levelOfTraining, String typeOfTraining, int yearOfEnding) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.sex = sex;
        this.residentialAddress = residentialAddress;
        this.registrationAddress = registrationAddress;
        this.citizenship = citizenship;
        this.email = email;
        this.mobilePhone = mobilePhone;
        this.additionalTelephone = additionalTelephone;
        this.skype = skype;
        this.school = school;
        this.specialty = specialty;
        this.levelOfTraining = levelOfTraining;
        this.typeOfTraining = typeOfTraining;
        this.yearOfEnding = yearOfEnding;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getResidentialAddress() {
        return residentialAddress;
    }

    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    public String getRegistrationAddress() {
        return registrationAddress;
    }

    public void setRegistrationAddress(String registrationAddress) {
        this.registrationAddress = registrationAddress;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getAdditionalTelephone() {
        return additionalTelephone;
    }

    public void setAdditionalTelephone(String additionalTelephone) {
        this.additionalTelephone = additionalTelephone;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getLevelOfTraining() {
        return levelOfTraining;
    }

    public void setLevelOfTraining(String levelOfTraining) {
        this.levelOfTraining = levelOfTraining;
    }

    public String getTypeOfTraining() {
        return typeOfTraining;
    }

    public void setTypeOfTraining(String typeOfTraining) {
        this.typeOfTraining = typeOfTraining;
    }

    public int getYearOfEnding() {
        return yearOfEnding;
    }

    public void setYearOfEnding(int yearOfEnding) {
        this.yearOfEnding = yearOfEnding;
    }

    @Override
    public String toString() {
        return "CV{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", monthOfBirth=" + monthOfBirth +
                ", yearOfBirth=" + yearOfBirth +
                ", sex=" + sex +
                ", residentialAddress='" + residentialAddress + '\'' +
                ", registrationAddress='" + registrationAddress + '\'' +
                ", citizenship='" + citizenship + '\'' +
                ", email='" + email + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", additionalTelephone='" + additionalTelephone + '\'' +
                ", skype='" + skype + '\'' +
                ", school='" + school + '\'' +
                ", specialty='" + specialty + '\'' +
                ", levelOfTraining='" + levelOfTraining + '\'' +
                ", typeOfTraining='" + typeOfTraining + '\'' +
                ", yearOfEnding=" + yearOfEnding +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CV cv = (CV) o;

        if (id != cv.id) return false;
        if (dayOfBirth != cv.dayOfBirth) return false;
        if (monthOfBirth != cv.monthOfBirth) return false;
        if (yearOfBirth != cv.yearOfBirth) return false;
        if (yearOfEnding != cv.yearOfEnding) return false;
        if (name != null ? !name.equals(cv.name) : cv.name != null) return false;
        if (secondName != null ? !secondName.equals(cv.secondName) : cv.secondName != null) return false;
        if (patronymic != null ? !patronymic.equals(cv.patronymic) : cv.patronymic != null) return false;
        if (sex != null ? !sex.equals(cv.sex) : cv.sex != null) return false;
        if (residentialAddress != null ? !residentialAddress.equals(cv.residentialAddress) : cv.residentialAddress != null)
            return false;
        if (registrationAddress != null ? !registrationAddress.equals(cv.registrationAddress) : cv.registrationAddress != null)
            return false;
        if (citizenship != null ? !citizenship.equals(cv.citizenship) : cv.citizenship != null) return false;
        if (email != null ? !email.equals(cv.email) : cv.email != null) return false;
        if (mobilePhone != null ? !mobilePhone.equals(cv.mobilePhone) : cv.mobilePhone != null) return false;
        if (additionalTelephone != null ? !additionalTelephone.equals(cv.additionalTelephone) : cv.additionalTelephone != null)
            return false;
        if (skype != null ? !skype.equals(cv.skype) : cv.skype != null) return false;
        if (school != null ? !school.equals(cv.school) : cv.school != null) return false;
        if (specialty != null ? !specialty.equals(cv.specialty) : cv.specialty != null) return false;
        if (levelOfTraining != null ? !levelOfTraining.equals(cv.levelOfTraining) : cv.levelOfTraining != null)
            return false;
        return typeOfTraining != null ? typeOfTraining.equals(cv.typeOfTraining) : cv.typeOfTraining == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (patronymic != null ? patronymic.hashCode() : 0);
        result = 31 * result + dayOfBirth;
        result = 31 * result + monthOfBirth;
        result = 31 * result + yearOfBirth;
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (residentialAddress != null ? residentialAddress.hashCode() : 0);
        result = 31 * result + (registrationAddress != null ? registrationAddress.hashCode() : 0);
        result = 31 * result + (citizenship != null ? citizenship.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (mobilePhone != null ? mobilePhone.hashCode() : 0);
        result = 31 * result + (additionalTelephone != null ? additionalTelephone.hashCode() : 0);
        result = 31 * result + (skype != null ? skype.hashCode() : 0);
        result = 31 * result + (school != null ? school.hashCode() : 0);
        result = 31 * result + (specialty != null ? specialty.hashCode() : 0);
        result = 31 * result + (levelOfTraining != null ? levelOfTraining.hashCode() : 0);
        result = 31 * result + (typeOfTraining != null ? typeOfTraining.hashCode() : 0);
        result = 31 * result + yearOfEnding;
        return result;
    }
}
