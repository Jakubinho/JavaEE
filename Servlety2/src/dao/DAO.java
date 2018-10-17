package dao;

import model.Person;
import model.Stanowisko;

import java.util.List;

public interface DAO {
    List<Person> getAllPersons();
    List<Stanowisko> getAllStanowisko();
    Person getPersonById(int id);
    Stanowisko getStanowisko(int id);
}
