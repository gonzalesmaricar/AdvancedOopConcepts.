package UseBook;

public class UseBook {
	public static void main(String[] args) {
		int num = 3;
		Book[] fiction = new Book[num];
		Book[] nonFiction = new Book[num];
		Book Fprice = new Fiction("");
		Book Nfprice = new NonFiction("");
		
		fiction[0] = new Fiction("The Paying Guests. Sarah Waters.");
		fiction[1] = new Fiction("Jane Eyre. Charlotte Bront�");
		fiction[2] = new Fiction("Watership Down. Richard Adams.");
		
		
		nonFiction[0] = new NonFiction("How to Do Nothing by Jenny Odell.");
		nonFiction[1] = new NonFiction("Between the World and Me by Ta-Nehisi Coates");
		nonFiction[2] = new NonFiction("The Emperor of All Maladies: A Biography of Cancer by Siddhartha Mukherjee");
		
		
		System.out.println("\t" + num + " FICTION BOOKS\n");
		for (int i = 0; i < num; i++) {
			System.out.println((i+1) + ". " + fiction[i].getTitle() + "\n");
		}
		System.out.println("\t" + num + " NONFICTION BOOKS\n");
		for (int j = 0; j < num; j++) {
			System.out.println((j+1) + ". " + nonFiction[j].getTitle() + "\n");
		}
		
		System.out.println("==============================================================================\n");
		System.out.print("[ BOOK PRICE ]\n" +
						"Fiction: " + "$" + Fprice.getPrice() +
						"\nNonFiction: " + "$" + Nfprice.getPrice());
		
	}

}



