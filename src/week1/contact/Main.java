package week1.contact;

/**
 * Created by Tordlin on 12/07/2015.
 */
public class Main {
    public static void main(String[] args) {

        ContactList contactList = new ContactList();

        Contact contact = new Contact();// create instance(object) of class
        contact.phone = "+380933091219";
        contact.age = 23;
        contact.name = "Serhii";

        contactList.addContact(contact);
        contact.showInfo();

        Contact contact2 = new Contact();// create instance(object) of class
        // reference    =  object
        // link,control =  data(memory)
        contact2.phone = "+380932331254";
        contact2.age = 30;
        contact2.name = "Anton";

        contactList.addContact(contact2);
        contact2.showInfo();

        contactList.showAll();

        Contact removeContact = contactList.removeLast();
        removeContact.showInfo();

        ContactList findedList = contactList.find("Anton");
        findedList.showAll();
    }
}
