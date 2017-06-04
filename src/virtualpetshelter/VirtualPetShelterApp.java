package virtualpetshelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPetShelter shelter = new VirtualPetShelter();

		System.out.println("Welcome to the Queen Anne's Revenge Pet Shelter. "
				+ "\nWe have some stowaways that could use your assistance. ");

		VirtualPet louie = new VirtualPet("Louie", "Ginger Cat", 40, 50, 30);
		VirtualPet jack = new VirtualPet("Jack", " Parrot", 20, 50, 30);
		VirtualPet sally = new VirtualPet("Sally", "Snake", 40, 50, 30);
		VirtualPet henry = new VirtualPet("Henry", "Monkey", 50, 20, 30);

		shelter.addPet(louie);
		shelter.addPet(jack);
		shelter.addPet(sally);
		shelter.addPet(henry);

		System.out.println("This is the status of our pets:\n");

		System.out.println("Name\tHunger\tThirst\tPillage\t");
		System.out.println("___________________________________");

		for (VirtualPet current : shelter.pets()) {
			System.out.println(
					"" + current.name + "\t" + current.hunger + "\t" + current.thirst + "\t" + current.pillage + "\t");
			System.out.println("___________________________________");
		}

		boolean enterShelter = false;
		while (!enterShelter) {

			System.out.println("\nWhat do you want to do? Enter a number.");
			System.out.println("1. Feed our pets some stinky pirate grub");
			System.out.println("2. Give water our pets");
			System.out.println("3. Pillage and sail the 7 seas with a pet");
			System.out.println("4. Adopt a pet");
			System.out.println("5. Give us a stowaway");
			System.out.println("6. Quit");

			String userInput = input.next();

			switch (userInput) {
			case "1":// Feed all pets
				shelter.feedAllPets();
				System.out.println("You fed our pets some stinky pirate grub.");
				break;

			case "2":// Water all pets
				shelter.waterAllPets();
				System.out.println("You gave all our pets some water.");
				break;

			case "3":// play with a pet
				System.out
						.println("Which pet do you want to pillage and sail the 7 seas with? Enter their name below.");
				for (VirtualPet currentPet : shelter.pets()) {
					System.out.println(currentPet.name + ", the " + currentPet.description);
				}

				String pillageWithPet = input.next();

				VirtualPet goPillage = shelter.getPet(pillageWithPet);
				shelter.playOne(goPillage);
				System.out.println("You pillage and sail the 7 seas with " + pillageWithPet + ".");
				break;

			case "4":// adopt a pet
				System.out.println("Which pet do you want to adopt? Enter their name below.");
				for (VirtualPet currentPet : shelter.pets()) {
					System.out.println(currentPet.name + ", " + currentPet.description);
				}

				String adoptName = input.next();

				shelter.adoptPet(adoptName);
				System.out.println("You adopted " + adoptName + " to travel the world with you. ");
				break;

			case "5":// admit a pet
				System.out.println("You have a stowaway for us? I guess that's ok..");
				System.out.println("What is the stowaway name?");
				String newPetName = input.next().toLowerCase();
				System.out.println("What kind of animal is the stowaway ?");
				String newPetDescription = input.next();
				System.out.println("");
				VirtualPet admitPet = new VirtualPet(newPetName, newPetDescription);
				shelter.addPet(admitPet);
				System.out.println("We will take good care of " + admitPet + " and put them to work on the deck.");
				break;

			case "6":
				System.out.println("You have left the Queen Anne's Revenge Pet Shelter.");
				System.exit(0);
			}

			System.out.println("\nThis is the status of our pets:");

			System.out.println("Name\t|Hunger\t|Thirst\t|Pillage\t");
			System.out.println("___________________________________");

			for (VirtualPet current : shelter.pets()) {
				System.out.println(
						current.name + "\t" + current.hunger + "\t" + current.thirst + "\t" + current.pillage + "\t");
				System.out.println("___________________________________");

			}

			shelter.tickAllPets();

		}

		input.close();

	}
}