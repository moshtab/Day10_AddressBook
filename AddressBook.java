package addressBook;

import java.util.Scanner;

class ContactPerson {

	private String firstName, lastName, city, state;
	private long phoneNumber, zip;

	public void addContact() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First name");
		firstName = s.nextLine();

		System.out.println("Enter the Last name");
		lastName = s.nextLine();

		System.out.println("Enter the City name");
		city = s.nextLine();

		System.out.println("Enter the State name");
		state = s.nextLine();

		System.out.println("Enter the Phone number");
		phoneNumber = s.nextLong();

		System.out.println("Enter the Zip");
		zip = s.nextLong();

	}

	public void printContact() {
		System.out.println("First Name is : " + firstName);
		System.out.println("Last Name is : " + lastName);
		System.out.println("City Name is : " + city);
		System.out.println("State Name is : " + state);
		System.out.println("Phone Number is : " + phoneNumber);
		System.out.println("Zip is : " + zip);

	}
}

public class AddressBook {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");

		ContactPerson contact1 = new ContactPerson();
		ContactPerson contact2 = new ContactPerson();

		System.out.println("Adding Contact Details of Contact1 Person");
		contact1.addContact();
		System.out.println("Printing Contact Details of Contact1 Person");
		contact1.printContact();
		
        System.out.println();
		System.out.println("Adding Contact Details of Contact2 Person");
		contact2.addContact();
		System.out.println("Printing Contact Details of Contact2 Person");
		contact2.printContact();

	}

}
