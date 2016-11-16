package pckg;

public class CasAddition<T> implements EtatAddition<T> {

	private T g;
	private T d;
	
	public CasAddition(T g, T d) {
		this.g = g;
		this.d = d;
	}
	
	public T gaucheAddition() {
		return this.g;
	}
	
	public T droitAddition() {
		return this.d;
	}
}
