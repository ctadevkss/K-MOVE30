package chap13;

public class BooksList {

	private String gcode;
	private String title;
	private String writer;
	private int price;
	
    private boolean lastPage = false;
    
	public String getGcode() {
		return gcode;
	}
	public void setGcode(String gcode) {
		this.gcode = gcode;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

    public void setLastPage(boolean lastPage) {
        this.lastPage = lastPage;
    }
    
    public boolean isLastPage() {
        return lastPage;
    }
    
	
}
