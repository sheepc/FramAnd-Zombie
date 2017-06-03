//种子类，继承自植物类
public class Seed extends Plants
{
	private int ripeTime;	//成熟时间
	private int seedLevel;	//购买权限
	private int price;		//价格
	
	//构造函数
	public Seed(String name, int number, int ripeTime, int seedLevel, int price) 
	{
		super(name, number);
		
		this.ripeTime = ripeTime;
		this.seedLevel = seedLevel;
		this.price = price;
	}
	
	//获得成熟时间
	public int getRipeTime()
	{
		return this.ripeTime;
	}
	
	//获得购买权限
	public int getSeedLevel()
	{
		return this.seedLevel;
	}
	
	//获得单价
	public int getPrice()
	{
		return this.price;
	}
}
