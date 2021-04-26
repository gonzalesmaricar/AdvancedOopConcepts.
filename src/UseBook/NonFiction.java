package UseBook;

public class NonFiction extends Book {
	
	public NonFiction(String title) {
		super(title); //call superclass (parent)
		setPrice();
	}
	@Override
	public void setPrice() {
		// TODO Auto-generated method stub
		price = 37.99;
	}
	
	void showInfo()
	{
	   System.out.println("NonFiction - Title: " + getTitle() + " $"+getPrice());
	   }
}