package virtualpetshelter;

import java.util.Random;

public class VirtualPet {
	

		String name;
		String description;
		int hunger;
		int thirst;
		int pillage;
				

		public VirtualPet(String newName, String newDescription) {
			name = newName;
			description = newDescription;
		}

		public VirtualPet(String newName, String newDescription, Integer newHunger, Integer newThirst, Integer newPillage) {
			name = newName;
			description = newDescription;
			hunger = newHunger;
			thirst = newThirst;
			pillage = newPillage;
		}
		
		Random r = new Random();

		//Tick method
			void tick() {
			hunger = hunger + r.nextInt(5);
			thirst = thirst + r.nextInt(5);
			pillage = pillage + r.nextInt(5) ;
		}

		// Hunger method
		void feedPet() {
			thirst = thirst + 10;
			pillage = pillage+ 10;
		}



		// Thirst methods
		void waterPet() {
			hunger = hunger + 10;
			pillage = pillage+ 10;
		}



		// Boredom methods
		void pillage() {
			thirst = thirst + 10;
			hunger = hunger + 10;
		}

		@Override
		public String toString() {
			return name + " the " + description ;
		}
	}
