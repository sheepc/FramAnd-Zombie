//�����࣬�̳���ֲ����
public class Crop extends Plants
{
	private boolean dry;			//�ɺ�״̬��false���ɺ���true�ɺ�
	private boolean pest;			//�溦״̬��false�޳溦��true�г溦
	private int growSpeed;			//�����ٶ�
	private int needTime;			//��������ʱ��
	
	//���캯��
	public Crop(String name, int number, Boolean dry, Boolean pest, int growSpeed, int needTime) 
	{
		super(name, number);
		
		this.dry = dry;
		this.pest = pest;
		this.growSpeed = growSpeed;
		this.needTime = needTime;
	}
	
	//��ú���״̬
	public boolean getDry()
	{
		return this.dry;
	}
	
	//���ú���״̬
	public void setDry(boolean dry)
	{
		this.dry = dry;
	}
	
	//��ó溦״̬
	public boolean getPest()
	{
		return this.pest;
	}
	
	//���ó溦״̬
	public void setPest(boolean pest)
	{
		this.pest = pest;
	}
	
	//��������ٶ�
	public int getGrowSpeed()
	{
		return this.growSpeed;
	}
	
	//���������ٶ�
	private void setGrowSpeed(int growSpeed)
	{
		this.growSpeed = growSpeed;
	}
	
	//��ó�������ʱ��
	public int getNeedTime()
	{
		return this.needTime;
	}
	
	//���ó�������ʱ��
	private void setNeedTime(int needTime)
	{
		this.needTime = needTime;
	}
}
