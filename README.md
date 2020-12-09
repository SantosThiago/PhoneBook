# Phonebook

Greetings!

Here is a project of the implementation of a Phonebook developed in Java using object-oriented programming.

## What can it do?
Our Phonebook can search for people on it, insert a new person, change the data of a person who already is on the Phonebook, remove someone, and show the list of every data registred in the Phonebook. 

## How to run it
Here is a list of the functions of the program to manipulate the Phonebook:
1) To create a new Phonebook, use: 
    - Phonebook [***name of the Phonebook***] = new Phonebook()


2) To create and add a new person to the Phonebook, use:
    - Person [***name of the variable***] = new Person("[***name of the person***]", [***phone number***], "[***person's address***]")
    
    By doing this, the program will create a new variable that contains the new person's name to add to the Phonebook, the phone number, and the address. However, this command only creates the person. To finally add this to the Phonebook, use the command:
    - [***name of the Phonebook***].insert([***name of the variable that contains all the data of the person you want to add***])


3) To search for someone in the Phonebook, use: 
    - Person [***name of the Phonebook***].search([***name of the person***])
   
   If the Phonebook contains two similar names, the program will return the first one. I.e., there is "Gabriel" and "Gabriela" on the Phonebook. If you search for "Gab" only, the program will only return Gabriel's data. 


4) To remove someone from the Phonebook, use: 
     - [***name of the Phonebook***].remove ([***name of the person***])
 
 5) To list everyone in the Phonebook, use: 
     - System.out.printIn([***name of the Phonebook***].ListContacts() )


There is an example on the repository. The file named *test.java* is on the *example* folder.

## Final thoughts 
Any help or comment will be highly appreciated. Thanks for reading!

