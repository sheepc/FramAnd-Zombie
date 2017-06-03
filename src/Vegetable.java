//�߲��࣬�̳���ֲ����
public class Vegetable extends Plants
{
	private int price;			//�۸�
	private int energy;			//�����������������ֵ
	private int fight;      	//ս����
	private int fightTime;  	//ս��ʱ��
	private int vegetableLevel;	//����Ȩ��
	
	public Vegetable(String name, int number, int price, int energy, int fight, int fightTime, int vegetabeLevel)
	{
		super(name, number);
		
		this.price = price;
		this.energy = energy;
		this.fight = fight;
		this.fightTime = fightTime;
		this.vegetableLevel = vegetabeLevel;
	}
	
	//��ü۸�
	public int getPrice()
	{
		return this.price;
	}
	
	//�������
	public int getEnergy()
	{
		return this.energy;
	}
	
	//���ս����
	public int getFight()
	{
		return this.fight;
	}
	
	//���ս��ʱ��
	public int getFightTime()
	{
		return this.fightTime;
	}
	
	//����ս��ʱ��
	private void setFightTime(int fightTime)
	{
		this.fightTime = fightTime;
	}
	
	//����߲˹���Ȩ��
	public int getVegetableLevel()
	{
		return this.vegetableLevel;
	}
}

