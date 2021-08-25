package oop.poly;

public class Video extends Content{
	private String genre;
	
	public Video(String title, String genre) {
		super(title, 0);
		
		this.genre = genre;
	}

	@Override
	public void totalPrice() {
		int price;
		if(genre.equals("new")){
			price = 2000;
		}else if(genre.equals("comic")) {
			price = 1500;
		}else if(genre.equals("child")) {
			price = 1000;
		}else {
			price = 500;
		}

		super.setPrice(price);
	}
	
	
}
