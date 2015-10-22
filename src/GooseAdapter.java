/**
 * Created by coupang on 2015. 10. 21..
 */
public class GooseAdapter implements Quackable {

	Goose goose;

	public GooseAdapter(Goose goose){
		this.goose = goose;
	}

	@Override
	public void quack() {
		goose.honk();
	}
}
