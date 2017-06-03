//作物类，继承自植物类
public class Crop extends Plants
{
	private boolean dry;			//干旱状态，false不干旱，true干旱
	private boolean pest;			//虫害状态，false无虫害，true有虫害
	private int growSpeed;			//生长速度
	private int needTime;			//成熟仍需时间
	
	//构造函数
	public Crop(String name, int number, Boolean dry, Boolean pest, int growSpeed, int needTime) 
	{
		super(name, number);
		
		this.dry = dry;
		this.pest = pest;
		this.growSpeed = growSpeed;
		this.needTime = needTime;
	}
	
	//获得旱涝状态
	public boolean getDry()
	{
		return this.dry;
	}
	
	//设置旱涝状态
	public void setDry(boolean dry)
	{
		this.dry = dry;
	}
	
	//获得虫害状态
	public boolean getPest()
	{
		return this.pest;
	}
	
	//设置虫害状态
	public void setPest(boolean pest)
	{
		this.pest = pest;
	}
	
	//获得生长速度
	public int getGrowSpeed()
	{
		return this.growSpeed;
	}
	
	//设置生长速度
	private void setGrowSpeed(int growSpeed)
	{
		this.growSpeed = growSpeed;
	}
	
	//获得成熟仍需时间
	public int getNeedTime()
	{
		return this.needTime;
	}
	
	//设置成熟仍需时间
	private void setNeedTime(int needTime)
	{
		this.needTime = needTime;
	}
}
