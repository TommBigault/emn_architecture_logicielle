package pckg;

public interface EtatAddition<T> {
	
	default boolean estAddition() {
		return false;
	}
	
	default T gaucheAddition() {
		throw new UnsupportedOperationException();
	}
	
	default T droitAddition() {
		throw new UnsupportedOperationException();
	}
}
