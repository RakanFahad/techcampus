
public class practice {

	private String name ;
	private int x;
	
	public practice(String name , int x) {
		this.name= name ;
		this.x=x;
		
	}
	public void setName (String name) {
		
		this.name = name ;
		
	}
	public String getName () {
		
		return name;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public String toString() {

		return name + x;
}}
