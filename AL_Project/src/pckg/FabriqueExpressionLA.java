package pckg;

public interface FabriqueExpressionLA extends FabriqueLitteralAddition<ExpressionLA> {

	default ExpressionLA litteral(int val) {
		return new LitteralLA(val);
	}
	
	default ExpressionLA addition(AdditionLA g, AdditionLA d) {
		return new AdditionLA(g, d);
	}
	
}
