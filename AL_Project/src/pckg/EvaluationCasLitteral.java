package pckg;

public interface EvaluationCasLitteral extends EtatLitteral, ServiceEvaluation {

	default int eval() {
		return this.val();
	}
	
}
