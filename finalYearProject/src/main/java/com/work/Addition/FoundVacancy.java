package com.work.Addition;

/**
 * Created by Sky_el on 04.05.2017.
 */
public class FoundVacancy {
    private String name;
    private String companyName;
    private String description;
    private String sourceLink;

    public FoundVacancy() { }

    public FoundVacancy(String name, String companyName, String description, String link) {
        this.name = name;
        this.companyName = companyName;
        this.description = description;
        this.sourceLink = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSourceLink() {
        return sourceLink;
    }

    public void setSourceLink(String link) {
        this.sourceLink = link;
    }

    @Override
    public String toString() {
        return "FoundVacancy{" +
                "name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", description='" + description + '\'' +
                ", link='" + sourceLink + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FoundVacancy that = (FoundVacancy) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (companyName != null ? !companyName.equals(that.companyName) : that.companyName != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        return sourceLink != null ? sourceLink.equals(that.sourceLink) : that.sourceLink == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (sourceLink != null ? sourceLink.hashCode() : 0);
        return result;
    }
}
