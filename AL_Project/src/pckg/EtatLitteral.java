package pckg;

public interface EtatLitteral {
	
	default boolean estLitteral() {
		return false;
	}
	
	default int val() {
		throw new UnsupportedOperationException();
	}
}
