package pckg;

public class CasLitteral implements EtatLitteral {

	private int n;
	
	public CasLitteral(int n) {
		this.n = n;
	}
	
	public boolean estLitteral() {
		return true;
	}
	
	public int val() {
		return this.n;
	}
}
