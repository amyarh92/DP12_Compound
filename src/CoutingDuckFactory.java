/**
 * Created by coupang on 2015. 10. 21..
 */
public class CoutingDuckFactory extends AbstrackDuckFactory {
	@Override public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}

	@Override public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}

	@Override public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}

	@Override public Quackable createRubberDuck() {
		return new QuackCounter(new RedheadDuck());
	}
}
