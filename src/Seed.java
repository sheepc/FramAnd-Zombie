//�����࣬�̳���ֲ����
public class Seed extends Plants
{
	private int ripeTime;	//����ʱ��
	private int seedLevel;	//����Ȩ��
	private int price;		//�۸�
	
	//���캯��
	public Seed(String name, int number, int ripeTime, int seedLevel, int price) 
	{
		super(name, number);
		
		this.ripeTime = ripeTime;
		this.seedLevel = seedLevel;
		this.price = price;
	}
	
	//��ó���ʱ��
	public int getRipeTime()
	{
		return this.ripeTime;
	}
	
	//��ù���Ȩ��
	public int getSeedLevel()
	{
		return this.seedLevel;
	}
	
	//��õ���
	public int getPrice()
	{
		return this.price;
	}
}
