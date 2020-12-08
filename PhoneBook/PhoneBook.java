import java.util.*;

public class PhoneBook
{
  List<Person> contacts;

  public PhoneBook(){
    contacts = new ArrayList<Person>();
  }

  public void insert (Person p){
    Person pAux = this.search(p.getName());
    if (pAux == null)
        contacts.add(p);
    else
        this.overwrite(pAux, p);
  }

  public Person search(String name) {
    for(Person p : contacts)
        if (p.getName() == name)
            return p;
    return null;
  }

  public void remove (String name){
    Person p = this.search(name);
    if (p != null)
        contacts.remove(p);
  }

  private void overwrite (Person old, Person _new){
      old.setName(_new.getName());
      old.setAddress(_new.getAddress());
      old.setNumber(_new.getNumber());
  }

  public String ListContacts(){
    String exit = "";
    for(Person p : contacts)
        exit = exit + p.toString() + "\n------------------------\n";
    return exit;
  }
}