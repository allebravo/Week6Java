
public class Card {
	private int value;
	private String name;
	
	public void describe(int value, String name) {
		System.out.print(value + " "+ name + " , ");
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}