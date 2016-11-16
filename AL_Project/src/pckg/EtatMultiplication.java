package pckg;

public interface EtatMultiplication<T> {

	default boolean estMultiplication() {
		return false;
	}
	
	default T gaucheMultiplication() {
		throw new UnsupportedOperationException();
	}
	
	default T droitMultiplication() {
		throw new UnsupportedOperationException();
	}
}
