
import java.util.Scanner;

public class AddressBookSystem {
    AddressBookMethods addressBookMethods = new AddressBookMethods();

    public void addAddressBook() {

        while (true) {
            System.out.println("For adding details enter:   1");
            System.out.println("For editing details enter:  2");
            System.out.println("For deleting details enter: 3");
            System.out.println("For printing address book enter:    4");
            System.out.println("For printing address book sorted by name enter:  5");
            System.out.println("To exit press :     0");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    return;

                case 1:
                    addressBookMethods.addDetails();
                    break;

                case 2:
                    addressBookMethods.editDetails();
                    break;

                case 3:
                    addressBookMethods.deleteContact();
                    break;

                case 4:
                    addressBookMethods.printAddressBook();
                    break;

                case 5:
                    addressBookMethods.printAddressBookSortedByName();
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    public void printAddressBooks() {
        addressBookMethods.printAddressBook();
    }
}
