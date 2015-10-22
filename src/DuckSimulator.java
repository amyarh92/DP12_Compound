/**
 * Created by coupang on 2015. 10. 21..
 */
public class DuckSimulator {
	public static void main(String[] args){
		DuckSimulator simulator = new DuckSimulator();
		AbstrackDuckFactory duckFactory = new CoutingDuckFactory();
		simulator.simulate(duckFactory);
	}

	// quackcount를 위한 데코레이터! -> 새로운 행동을 활용하기 위함!
	// 오리 객체를 생성하는 작업을 한 군데 몰아서 하는작업 -> 팩토리 패턴

	void simulate(AbstrackDuckFactory duckFactory){
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		//goose
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("Duck Simulator : With Composite - Flocks");

		Flock flockOfDucks = new Flock();

		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);

		Flock flockOfMallards = new Flock();

		Quackable mallardOne = duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();

		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);

		flockOfDucks.add(flockOfMallards);

		System.out.println("Duck Simulator : Whole Flock Simulation");
		simulate(flockOfDucks);

		System.out.println("Duck Simulator : Mallard Flock Simulation");
		simulate(flockOfMallards);

		System.out.println("The Ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
	}

	void simulate(Quackable duck){
		duck.quack();
	}
}
