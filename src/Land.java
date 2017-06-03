//������

//��ֲ״̬ö�����ͣ�OK��ʾ������ֲ��ING��ʾ��ֲ�У�NO��ʾ������ֲ����δ����
enum State {OK,ING,NO}

public class Land
{
	private int size;				//szie = 9
	private State plantState[];		//��ֲ״̬���飬ÿһ��Ԫ�ض�Ӧһ������
	private int fertility[];			//���ط������飬��ÿ��С�����ջ�Ŀ���
	private Crop crop[];
	
	//���캯��
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
	
	//������ؿ���
	public int getSize()
	{
		return this.size;
	}
	
	//�������ؿ���
	private void setSize(int size)
	{
		this.size = size;
	}
	
	//��õ�iС��������ֲ״̬
	public State getPlantState(int i)
	{
		if(i >= 0 && i < this.size)
		{
			return this.plantState[i];
		}
	}
	
	//���õ�iС�����ص���ֲ״̬
	public void setPlantState(int i,State state)
	{
		this.plantState[i].valueOf(state.toString());
	}
	
	//��õ�iС�����صĵķ��������ջ�Ŀ���
	public int getFertility(int i)
	{
		return this.fertility[i];
	}
	
	//���õ�iС�����صķ���
	private void setFertility(int i, int fertility)
	{ 
		this.fertility[i]  = fertility;
	}
	
	//��õ�iС�������ϵ������������
	public Crop getCrop(int i)
	{
		if(i >= 0 && i < this.size)
		{
			return this.crop[i];
		}
	}
	
	//���õ�iС�������ϵ������������
	public void setCrop(int i, Crop crop)
	{
		this.crop[i] = crop;
	}
}


