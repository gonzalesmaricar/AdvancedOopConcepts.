package UseBook;

	public class Fiction extends Book {
		
		public Fiction(String title) {
			super(title); //call superclass (parent)
			setPrice();
			
		}
		@Override
		public void setPrice() {
			// TODO Auto-generated method stub
			price = 24.99;
		}
		
		void showInfo()
		{
		   System.out.println("Fiction - Title: " + getTitle() + " $"+getPrice());
		   }
	}



