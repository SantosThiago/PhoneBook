import java.util.*;

public class Person {
  private String name;
  private String address;
  private int number;
  
  public Person(String name, int number, String address){
    this.name = name;
    this.address = address;
    this.number = number;
  }

  public String toString(){
    return "Name : " + this.name + "\nAddress : " + this.address + "\nNumber : " + this.number;
  }

  public void setName(String name){
      this.name = name;
  }

    public void setAddress(String address){
      this.address = address;
  }


  public void setNumber(int number){
      this.number = number;
  }

  public String getName(){
    return this.name;
  }

  public String getAddress(){
    return this.address;
  }

  public int getNumber(){
    return this.number;
  }
}