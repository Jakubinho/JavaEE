package model;

public class Person {
    private int id;
    private String foto; //path to photo
    private String name;
    private String surname;
    private Stanowisko stanowisko;

    public Person(String name, String surname, String foto) {
        this.name = name;
        this.surname = surname;
        this.foto = foto;
    }
    public String desc(){
        return name+" "+surname;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Stanowisko getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(Stanowisko stanowisko) {
        this.stanowisko = stanowisko;
    }
}
