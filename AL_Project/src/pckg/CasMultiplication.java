package pckg;

public class CasMultiplication<T> implements EtatMultiplication<T> {

	private T g;
	private T d;
	
	@Override
	public boolean estMultiplication() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public T gaucheMultiplication() {
		// TODO Auto-generated method stub
		return this.g;
	}
	
	@Override
	public T droitMultiplication() {
		// TODO Auto-generated method stub
		return this.d;
	}
}
