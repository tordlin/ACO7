package week1.contact;

/**
 * Created by Tordlin on 12/07/2015.
 */
public class ContactList {
    Contact[] contacts = new Contact[10];// null
    int freePlace = 0;


    public void addContact(Contact contact){
        contacts[freePlace] = contact;
        freePlace++;
    }

    public void showAll() {
        for (int i = 0; i < contacts.length; i++) {
           contacts[i].showInfo();
        }
    }

    public Contact removeLast() {
        Contact removedContact = contacts[freePlace - 1];
        contacts[freePlace - 1] = null;
        return removedContact;
    }

    public ContactList find(String name) {
        ContactList findedList = new ContactList();
        for (int i = 0; i < freePlace; i++) {
            if(contacts[i].name.equals(name)){
                findedList.addContact(contacts[i]);
            }
        }
        return findedList;
    }
}
