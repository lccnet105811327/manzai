package lesson4;

public abstract class FoodCabinet {
	private String size; //4.現在這裡就有了從建構子接收的值

	FoodCabinet(String size) {
		this.size = size; //3.把值接進來之後，傳入此類別(this)的成員
	}

	public abstract void preserveFoods();
	
	public void showSize() {
		System.out.println("尺寸為: " + this.size); //5.往後使用的size就會是之前存入的
	}

}
