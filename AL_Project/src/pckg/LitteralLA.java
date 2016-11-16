package pckg;

public class LitteralLA extends CasLitteral implements EvaluationCasLitteral, 
													   EquivalenceCasUniversel<ExpressionLA>, 
													   FabriqueExpressionLA, 
													   ExpressionLA {

	public LitteralLA(int n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int eval() {
		// TODO Auto-generated method stub
		return 0;
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
