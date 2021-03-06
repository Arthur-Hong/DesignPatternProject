package Animal;
import Action.*;
import Action.ExerciseAction.RunAction;
import Base.*;
import Product.sheepFactory;

public  class Sheep extends Animal {

	public Sheep() {
		this.Animalname = "Sheep";
		exercise= new RunAction();
		exercise.getself(this);
		breed=new BreedAction();
		breed.getself(this);
		sleep = new c1sleep();
		sleep.getself(this);
		shower = new ShowerAction(1);
		shower.getself(this);
		showerclass = 2;
		mem = new Memento("alive");
		product = new sheepFactory();
	}


}
