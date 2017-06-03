//蔬菜类，继承自植物类
public class Vegetable extends Plants
{
	private int price;			//价格
	private int energy;			//能量，即补充的生命值
	private int fight;      	//战斗力
	private int fightTime;  	//战斗时间
	private int vegetableLevel;	//购买权限
	
	public Vegetable(String name, int number, int price, int energy, int fight, int fightTime, int vegetabeLevel)
	{
		super(name, number);
		
		this.price = price;
		this.energy = energy;
		this.fight = fight;
		this.fightTime = fightTime;
		this.vegetableLevel = vegetabeLevel;
	}
	
	//获得价格
	public int getPrice()
	{
		return this.price;
	}
	
	//获得能量
	public int getEnergy()
	{
		return this.energy;
	}
	
	//获得战斗力
	public int getFight()
	{
		return this.fight;
	}
	
	//获得战斗时间
	public int getFightTime()
	{
		return this.fightTime;
	}
	
	//设置战斗时间
	private void setFightTime(int fightTime)
	{
		this.fightTime = fightTime;
	}
	
	//获得蔬菜购买权限
	public int getVegetableLevel()
	{
		return this.vegetableLevel;
	}
}

