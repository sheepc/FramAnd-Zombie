//植物类
public class Plants
{
	private String name;
	private int number;
	
	//构造函数
	public Plants(String name, int number)
	{
		this.name = name;
		this.number = number;
	}
	
	//获得植物名
	public String getName()
	{
		return this.name;
	}
	
	//获得植物数量
	public int getNumber()
	{
		return this.number;
	}
	
	//设置植物数量
	public void setNumber(int number)
	{
		this.number = number;
	}
}
