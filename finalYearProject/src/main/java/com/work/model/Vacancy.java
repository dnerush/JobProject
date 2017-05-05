package com.work.model;


public class Vacancy {

    private int id;
    private String name;
    private String type;
    private String description;
    private String sourceLink;
    private boolean favourite;


    public Vacancy() { }

    public Vacancy(/*int id, */String name, String type, String description, String sourceLink, Boolean favourite) {
        //this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.sourceLink = sourceLink;
        this.favourite = favourite;
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

    public boolean getFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
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

        Vacancy vacancy = (Vacancy) o;

        if (id != vacancy.id) return false;
        if (favourite != vacancy.favourite) return false;
        if (name != null ? !name.equals(vacancy.name) : vacancy.name != null) return false;
        if (type != null ? !type.equals(vacancy.type) : vacancy.type != null) return false;
        if (description != null ? !description.equals(vacancy.description) : vacancy.description != null) return false;
        return sourceLink != null ? sourceLink.equals(vacancy.sourceLink) : vacancy.sourceLink == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (sourceLink != null ? sourceLink.hashCode() : 0);
        result = 31 * result + (favourite ? 1 : 0);
        return result;
    }
}
