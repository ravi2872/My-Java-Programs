package observe;

public class Main {
	public static void main(String[] args) {
		ObservableValue ov = new ObservableValue(1);
		TextObserver to = new TextObserver(ov);
		TextObserver too = new TextObserver(ov);
		ov.addObserver(to);
		ov.addObserver(too);
		ov.setValue(100);
	}
}