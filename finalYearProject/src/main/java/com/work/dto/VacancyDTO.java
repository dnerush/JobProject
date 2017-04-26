package com.work.dto;

public class VacancyDTO {

    private long id;
    private String name;
    private String type;
    private String description;
    private String sourceLink;
    private Boolean favourite;

    public VacancyDTO() {
    }

    public VacancyDTO(long id, String name, String type, String description, String sourceLink, Boolean favourite) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.sourceLink = sourceLink;
        this.favourite = favourite;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getSourceLink() {
        return sourceLink;
    }

    public void setSourceLink(String sourceLink) {
        this.sourceLink = sourceLink;
    }

    public Boolean getFavourite() {
        return favourite;
    }

    public void setFavourite(Boolean favourite) {
        this.favourite = favourite;
    }


    @Override
    public String toString() {
        return "Vacancy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", sourceLink='" + sourceLink + '\'' +
                ", favourite=" + favourite +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VacancyDTO that = (VacancyDTO) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (sourceLink != null ? !sourceLink.equals(that.sourceLink) : that.sourceLink != null) return false;
        return favourite != null ? favourite.equals(that.favourite) : that.favourite == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (sourceLink != null ? sourceLink.hashCode() : 0);
        result = 31 * result + (favourite != null ? favourite.hashCode() : 0);
        return result;
    }
}
