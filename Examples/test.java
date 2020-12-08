import java.util.*;
class Main {
  public static void main(String[] args) {
    PhoneBook a = new PhoneBook();
    Person p = new Person("Person1", 99999999 , "Street A");
    Person p2 = new Person ("Person2",88888888,"Street B");
    Person p3 = new Person ("Person3",88889999,"Street C");
    a.insert(p);
    a.insert(p2);
    a.insert(p3);
    a.insert(new Person("Person1",77777777,"Street D"));
    a.remove("Person2");
    System.out.println(a.ListContacts());
  }
}