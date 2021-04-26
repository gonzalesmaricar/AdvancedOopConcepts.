package UseBook;

public abstract class Book { 
		
		private String title;
		double price;
		
		
		public Book(String title) {
			this.title = title;
			this.price = 0.0;
		}
		
		public String getTitle() {
			return title;
		}
		
		public double getPrice() {
			return price;
		}
		
		public abstract void setPrice();		

	}


