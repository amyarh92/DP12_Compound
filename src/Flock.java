import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by coupang on 2015. 10. 21..
 */

// 오리떼를 관리하는 기능 -> 컴포지트 패턴
public class Flock implements Quackable {
	ArrayList quackers = new ArrayList();

	public void add(Quackable quacker){
		quackers.add(quacker);
	}
	@Override
	public void quack() {
		Iterator iterator = quackers.iterator();
		while (iterator.hasNext()){
			Quackable quacker = (Quackable)iterator.next();
			quacker.quack();
		}

	}
}
