//土地类

//种植状态枚举类型，OK表示可以种植，ING表示种植中，NO表示不能种植，即未翻地
enum State {OK,ING,NO}

public class Land
{
	private int size;				//szie = 9
	private State plantState[];		//种植状态数组，每一个元素对应一块土地
	private int fertility[];			//土地肥力数组，即每块小土地收获的棵数
	private Crop crop[];
	
	//构造函数
	public Land() 
	{
		this.size = 9;
		
		this.plantState = new State[this.size];
		for(int i = 0; i < this.size; i++)
		{
			this.plantState[i] = State.OK;
		}
		
		this.fertility = new int[this.size];
		for(int i = 0; i < this.size; i++)
		{
			this.fertility[i] = 10;
		}
		
		this.crop = new Crop[this.size];
		for(int i = 0; i < this.size; i++)
		{
			this.crop[i] = null;
		}
	}
	
	//获得土地块数
	public int getSize()
	{
		return this.size;
	}
	
	//设置土地块数
	private void setSize(int size)
	{
		this.size = size;
	}
	
	//获得第i小块土地种植状态
	public State getPlantState(int i)
	{
		if(i >= 0 && i < this.size)
		{
			return this.plantState[i];
		}
	}
	
	//设置第i小块土地的种植状态
	public void setPlantState(int i,State state)
	{
		this.plantState[i].valueOf(state.toString());
	}
	
	//获得第i小块土地的的肥力，即收获的棵数
	public int getFertility(int i)
	{
		return this.fertility[i];
	}
	
	//设置第i小块土地的肥力
	private void setFertility(int i, int fertility)
	{ 
		this.fertility[i]  = fertility;
	}
	
	//获得第i小块土地上的作物对象引用
	public Crop getCrop(int i)
	{
		if(i >= 0 && i < this.size)
		{
			return this.crop[i];
		}
	}
	
	//设置第i小块土地上的作物对象引用
	public void setCrop(int i, Crop crop)
	{
		this.crop[i] = crop;
	}
}


