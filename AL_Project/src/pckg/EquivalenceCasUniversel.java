package pckg;

public interface EquivalenceCasUniversel<T extends ServiceEvaluation & ServiceEquivalence<T>> extends ServiceEvaluation, ServiceEquivalence<T> {
	
	default boolean estEquivalent(T a) {
		return this.eval() == a.eval();
	}

}
