package addressbookmanagementsystem;

/*
 *Ability to edit Contact in Address Book
 * @author : Rohit
 */

public class AddressBookMain {
    public static void main(String[] args) {

        System.out.println("------------------Welcome to Address Book Management System !---------------------");
        System.out.println();

        AddressBook addressBook = new AddressBook();

        // Calling option method to take choice of add, edit, delete or display
        addressBook.option();

        }
}
