package dao.basicimpl;

import dao.DAO;
import model.Person;
import model.Stanowisko;

import java.util.ArrayList;
import java.util.List;

public class RamDAO implements DAO{
    private List<Person> persons = new ArrayList<>();
    private List<Stanowisko> stanowiska = new ArrayList<>();

    public RamDAO(){
        Stanowisko st1 = new Stanowisko(1,"Kierownik");
        Stanowisko st2 = new Stanowisko(2,"Sekretarz");
        stanowiska.add(st1);
        stanowiska.add(st2);
        Person p = new Person("Mateusz", "Wasiak","wasiak.jpg" );
        p.setStanowisko(st2);
        p.setId(1);
        persons.add(p);
        p = new Person("Harold","InPain", "harold.jpg");
        p.setStanowisko(st1);
        p.setId(2);
        persons.add(p);
    }
    public List<Person> getAllPersons() {
        return persons;
    }

    @Override
    public List<Stanowisko> getAllStanowisko() {
        return stanowiska;
    }

    @Override
    public Person getPersonById(int id) {
        for (Person p : persons){
            if(p.getId() == id)
                return p;
        }
        return null;
    }

    @Override
    public Stanowisko getStanowisko(int id) {
        for (Stanowisko st : stanowiska){
            if(st.getId() == id)
                return st;
        }
        return null;
    }
}
