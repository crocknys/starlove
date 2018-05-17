package fr.perrine.starlove;

public class ProfileModel {


    private String userName;
    private String genre;
    private String species;
    private int mass;
    private double height;
    private String avatar;

    public ProfileModel() {}

    public ProfileModel(String userName, String genre, String species, int mass, double height, String avatar) {
        this.userName = userName;
        this.genre = genre;
        this.species = species;
        this.mass = mass;
        this.height = height;
        this.avatar = avatar;
    }

    public ProfileModel(String avatar) {
        this.avatar = avatar;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
