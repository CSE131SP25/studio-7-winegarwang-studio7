package studio7;

public class Die {
	
	private int sides;
	private int results;
	
	public Die(int sides) {
		this.sides = sides;
		this.results = (int) (Math.random()*sides) + 1;
	}
	
	public int getResults() {
		return this.results;
	}
	

	public static void main(String[] args) {
		Die size = new Die(6);
		System.out.println(size.results);
	}
}
