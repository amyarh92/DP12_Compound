/**
 * Created by coupang on 2015. 10. 21..
 */
public class DuckFactory extends AbstrackDuckFactory {
	@Override public Quackable createMallardDuck() {
		return new MallardDuck();
	}

	@Override public Quackable createRedheadDuck() {
		return new RedheadDuck();
	}

	@Override public Quackable createDuckCall() {
		return new DuckCall();
	}

	@Override public Quackable createRubberDuck() {
		return new RubberDuck();
	}
}
