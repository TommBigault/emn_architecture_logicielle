package pckg;

public class AdditionLA extends CasAddition<ExpressionLA> implements EvaluationCasAddition<ExpressionLA>, 
														             EquivalenceCasUniversel<ExpressionLA>, 
														             FabriqueAddition<ExpressionLA>, 
														             ExpressionLA{

	public AdditionLA(ExpressionLA g, ExpressionLA d) {
		super(g, d);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int eval() {
		// TODO Auto-generated method stub
		return this.val();
	}

	@Override
	public boolean estEquivalent() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ExpressionLA litteral(int val) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExpressionLA addition(ExpressionLA g, ExpressionLA d) {
		// TODO Auto-generated method stub
		return null;
	}




}
