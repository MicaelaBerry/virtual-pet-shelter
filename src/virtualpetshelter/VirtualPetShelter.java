package virtualpetshelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class VirtualPetShelter {
	Map<String, VirtualPet> shelterPets = new HashMap<String, VirtualPet>();


	public Collection<VirtualPet> pets() {
		return shelterPets.values();
	}


	// feed method
	public void feedAllPets() {
		for (VirtualPet p : shelterPets.values()) {
			p.feedPet();
		}
	}

	// give water to pets method
	public void waterAllPets() {
		for (VirtualPet pet : shelterPets.values()) {
			pet.waterPet();
		}
	}

	// get pet method
	public VirtualPet getPet(String name) {
		return shelterPets.get(name);
	}

	// pillage or play with specific pet
	public void playOne(VirtualPet pet) {
		pet.pillage();
	}
	
	// adding pets method
	public void addPet(VirtualPet pet) {
		shelterPets.put(pet.name.toLowerCase(), pet);
	}

	// remove pet method
	public void adoptPet(String removedPet) {
		shelterPets.remove(removedPet);
	}
	
	// Tick method
	public void tickAllPets() {
		for (VirtualPet p : shelterPets.values()) {
		p.tick();
		}
	}
	}