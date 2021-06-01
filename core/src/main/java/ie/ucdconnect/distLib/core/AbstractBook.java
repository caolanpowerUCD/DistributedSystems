package ie.ucdconnect.distLib.core;

public class AbstractBook {    
	protected String title;
	protected String author;
	protected int totalCopies;
	protected int loanableCopies;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getTotalCopies(){
		return totalCopies;
	}

	public int getLoanableCopies(){
		return loanableCopies;
	}

	public boolean isLoanable(){
		return this.totalCopies - this.loanableCopies < this.totalCopies;
	}

	public boolean canReturn() {
		return this.totalCopies - this.loanableCopies > 0;
	}

	public boolean loan() {
		if (!this.isLoanable()) 
			return false;
		this.loanableCopies -= 1;
		return true;
	}

	// 'return' was taken
	public boolean unloan() {
		if ( !this.canReturn() )
			return false;
		this.loanableCopies += 1;
		return true;
	}

	public void setTotalCopies(int copies){
		this.totalCopies = copies;
	}
}