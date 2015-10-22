import java.util.Observer;

/**
 * Created by coupang on 2015. 10. 21..
 */

// 개별 오리의 행동을 관찰하고 싶다! -> 객체 행동 관측 -> 옵저버패턴
public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
