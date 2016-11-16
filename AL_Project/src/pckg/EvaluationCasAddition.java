package pckg;

public interface EvaluationCasAddition<T extends EtatAddition<T> & ServiceEvaluation> 
			 	 extends EtatAddition<T>, 
			 			 ServiceEvaluation  {
	
	default int eval() {
		return this.gaucheAddition().eval() + this.droitAddition().eval();
	}
}
