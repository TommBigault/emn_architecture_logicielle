package pckg;

public interface ExpressionLA extends EtatLitteral, 
									  EtatAddition<ExpressionLA>, 
									  FabriqueLitteralAddition<ExpressionLA>, 
									  ServiceEvaluation, 
									  ServiceEquivalence<ExpressionLA> {

}
