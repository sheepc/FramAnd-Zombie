import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Window.Type;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Button;
import java.awt.Point;

import javax.swing.JTextField;

import java.awt.CardLayout;
import java.awt.FlowLayout;

import javax.swing.JTextPane;
import javax.swing.JButton;

import java.awt.Choice;
import java.awt.Scrollbar;
import java.awt.List;
import java.awt.Canvas;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JMenu;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;

import java.awt.event.MouseMotionAdapter;
import java.beans.VetoableChangeListener;
import java.beans.PropertyChangeEvent;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;


public class User extends JFrame {
	private String name;
	private String password;
	private int fight;
	private int health;
	private int wealth;
	private Land land;
	private Vegetable vegetable[];
	private Seed seed[];
	private int vegetableLevel;		//蔬菜购买权限
	private int seedLevel;			//种子购买权限
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User frame = new User();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public User() {
		//初始化用户数据
		this.name = "sheepc";
		this.password = "123456";
		this.fight = 0;
		this.health = 100;
		this.land = new Land();
		this.wealth = 1000;
		this.vegetable = new Vegetable[3];
		this.vegetable[0] = new Vegetable("capsicum", 10, 10, 10, 20, 20, 1);
		this.vegetable[1] = new Vegetable("tomato", 0, 20, 20, 30, 20, 2);
		this.vegetable[2] = new Vegetable("pea", 0, 30, 30, 30, 20, 3);
		this.vegetableLevel = 1;
		this.seed = new Seed[3];
		this.seed[0] = new Seed("capsicum", 10, 10, 1, 1);
		this.seed[1] = new Seed("tomato", 0, 20, 2, 2);
		this.seed[2] = new Seed("pea", 0, 30, 3, 3);
		this.seedLevel = 1;
		
		//创建窗口
		setTitle("开心农场+植物大战僵尸");
		setBackground(new Color(240, 240, 240));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 20, 903, 700);
		//创建面板
		JPanel contentPane = new JPanel();
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		//创建农场面板
		JPanel landPanel = new JPanel();
		landPanel.setLayout(null);
		GridBagConstraints gbc_landPanel = new GridBagConstraints();
		gbc_landPanel.gridheight = 3;
		gbc_landPanel.insets = new Insets(0, 0, 5, 0);
		gbc_landPanel.fill = GridBagConstraints.BOTH;
		gbc_landPanel.gridx = 0;
		gbc_landPanel.gridy = 0;
		contentPane.add(landPanel, gbc_landPanel);
		
		JPanel panel1 = new JPanel();
		panel1.setOpaque(false);
		panel1.setBounds(284, 266, 62, 59);
		landPanel.add(panel1);
		panel1.setLayout(null);
		
		JLabel crop1 = new JLabel("1");
		crop1.setBounds(0, 0, 62, 59);
		panel1.add(crop1);
		
		JLabel land1 = new JLabel("1");
		land1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			
			}
		});
		land1.setBounds(0, 0, 61, 56);
		panel1.add(land1);
		land1.setHorizontalAlignment(SwingConstants.CENTER);
		land1.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\\u4EE3\u7801\\java\\\u5F00\u5FC3\u519C\u573A+\u690D\u7269\u5927\u6218\u50F5\u5C38\\happyfarm_image\\soilImg\\emptySoil.png"));
		
		JPanel panel2 = new JPanel();
		panel2.setOpaque(false);
		panel2.setBounds(201, 312, 62, 59);
		landPanel.add(panel2);
		panel2.setLayout(null);
		
		JLabel crop2 = new JLabel("2");
		crop2.setBounds(0, 0, 62, 59);
		panel2.add(crop2);
		
		JLabel land2 = new JLabel("2");
		land2.setBounds(0, 0, 61, 56);
		panel2.add(land2);
		land2.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\\u4EE3\u7801\\java\\\u5F00\u5FC3\u519C\u573A+\u690D\u7269\u5927\u6218\u50F5\u5C38\\happyfarm_image\\soilImg\\emptySoil.png"));
		land2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel3 = new JPanel();
		panel3.setOpaque(false);
		panel3.setBounds(111, 354, 62, 59);
		landPanel.add(panel3);
		panel3.setLayout(null);
		
		JLabel crop3 = new JLabel("3");
		crop3.setBounds(0, 0, 62, 59);
		panel3.add(crop3);
		
		JLabel land3 = new JLabel("3");
		land3.setBounds(0, 0, 61, 56);
		panel3.add(land3);
		land3.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\\u4EE3\u7801\\java\\\u5F00\u5FC3\u519C\u573A+\u690D\u7269\u5927\u6218\u50F5\u5C38\\happyfarm_image\\soilImg\\emptySoil.png"));
		land3.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel4 = new JPanel();
		panel4.setBounds(373, 312, 62, 59);
		landPanel.add(panel4);
		panel4.setOpaque(false);
		panel4.setLayout(null);
		
		JLabel crop4 = new JLabel("4");
		crop4.setBounds(0, 0, 62, 59);
		panel4.add(crop4);
		
		JLabel land4 = new JLabel("4");
		land4.setBounds(0, 0, 61, 56);
		panel4.add(land4);
		land4.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\\u4EE3\u7801\\java\\\u5F00\u5FC3\u519C\u573A+\u690D\u7269\u5927\u6218\u50F5\u5C38\\happyfarm_image\\soilImg\\emptySoil.png"));
		land4.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel5 = new JPanel();
		panel5.setOpaque(false);
		panel5.setBounds(284, 354, 62, 59);
		landPanel.add(panel5);
		panel5.setLayout(null);
		
		JLabel crop5 = new JLabel("5");
		crop5.setBounds(0, 0, 62, 59);
		panel5.add(crop5);
		
		JLabel land5 = new JLabel("5");
		land5.setBounds(0, 0, 61, 56);
		panel5.add(land5);
		land5.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\\u4EE3\u7801\\java\\\u5F00\u5FC3\u519C\u573A+\u690D\u7269\u5927\u6218\u50F5\u5C38\\happyfarm_image\\soilImg\\emptySoil.png"));
		land5.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel6 = new JPanel();
		panel6.setOpaque(false);
		panel6.setBounds(187, 392, 62, 59);
		landPanel.add(panel6);
		panel6.setLayout(null);
		
		JLabel crop6 = new JLabel("6");
		crop6.setBounds(0, 0, 62, 59);
		panel6.add(crop6);
		
		JLabel land6 = new JLabel("6");
		land6.setBounds(0, 0, 61, 56);
		panel6.add(land6);
		land6.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\\u4EE3\u7801\\java\\\u5F00\u5FC3\u519C\u573A+\u690D\u7269\u5927\u6218\u50F5\u5C38\\happyfarm_image\\soilImg\\emptySoil.png"));
		land6.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel7 = new JPanel();
		panel7.setOpaque(false);
		panel7.setBounds(284, 442, 62, 59);
		landPanel.add(panel7);
		panel7.setLayout(null);
		
		JLabel crop7 = new JLabel("7");
		crop7.setBounds(0, 0, 62, 59);
		panel7.add(crop7);
		
		JLabel land7 = new JLabel("7");
		land7.setBounds(0, 0, 61, 56);
		panel7.add(land7);
		land7.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\\u4EE3\u7801\\java\\\u5F00\u5FC3\u519C\u573A+\u690D\u7269\u5927\u6218\u50F5\u5C38\\happyfarm_image\\soilImg\\emptySoil.png"));
		land7.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel8 = new JPanel();
		panel8.setOpaque(false);
		panel8.setBounds(373, 405, 62, 59);
		landPanel.add(panel8);
		panel8.setLayout(null);
		
		JLabel crop8 = new JLabel("8");
		crop8.setBounds(0, 0, 62, 59);
		panel8.add(crop8);
		
		JLabel land8 = new JLabel("8");
		land8.setBounds(0, 0, 61, 56);
		panel8.add(land8);
		land8.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\\u4EE3\u7801\\java\\\u5F00\u5FC3\u519C\u573A+\u690D\u7269\u5927\u6218\u50F5\u5C38\\happyfarm_image\\soilImg\\emptySoil.png"));
		land8.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel9 = new JPanel();
		panel9.setOpaque(false);
		panel9.setLayout(null);
		panel9.setBounds(472, 354, 62, 59);
		landPanel.add(panel9);
		
		JLabel crop9 = new JLabel("9");
		crop9.setBounds(0, 0, 62, 59);
		panel9.add(crop9);
		
		JLabel land9 = new JLabel("9");
		land9.setBounds(0, 0, 61, 56);
		panel9.add(land9);
		land9.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\\u4EE3\u7801\\java\\\u5F00\u5FC3\u519C\u573A+\u690D\u7269\u5927\u6218\u50F5\u5C38\\happyfarm_image\\soilImg\\emptySoil.png"));
		land9.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel landBground= new JLabel("");
		landBground.setBounds(0, 0, 903, 700);
		landBground.setHorizontalAlignment(SwingConstants.CENTER);
		landBground.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\\u4EE3\u7801\\java\\\u5F00\u5FC3\u519C\u573A+\u690D\u7269\u5927\u6218\u50F5\u5C38\\happyfarm_image\\background\\background_1.jpg"));
		landPanel.add(landBground);
		//创建按钮面板
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(new Color(51, 255, 255));
		GridBagConstraints gbc_buttonPanel = new GridBagConstraints();
		gbc_buttonPanel.insets = new Insets(0, 0, 5, 0);
		gbc_buttonPanel.fill = GridBagConstraints.BOTH;
		gbc_buttonPanel.gridx = 0;
		gbc_buttonPanel.gridy = 3;
		contentPane.add(buttonPanel, gbc_buttonPanel);
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		//播种菜单
		JMenu seedMenu = new JMenu("播种");
		seedMenu.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\\u4EE3\u7801\\java\\\u5F00\u5FC3\u519C\u573A+\u690D\u7269\u5927\u6218\u50F5\u5C38\\happyfarm_image\\smallOperateImg\\bag_a.png"));

		seedMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				seedMenu.setPopupMenuVisible(true);
			}
			
		});
		//播种辣椒
		JMenuItem capsicum = new JMenuItem("辣椒");
		capsicum.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(seed[0].getNumber() > 0)
				{
					capsicum.setBackground(Color.gray);
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				capsicum.setBackground(getBackground());
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				seedMenu.setPopupMenuVisible(false);
				if(seed[0].getNumber() > 0)
				{
					Cursor coursor = Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("C:\\Users\\Administrator\\Desktop\\代码\\java\\开心农场+植物大战僵尸\\happyfarm_image\\cropImg\\seedCapsicum\\0.png").getImage(),new Point(10,20), "stick");
					setCursor(coursor);
				}else{
					new JOptionPane().showMessageDialog(getParent(), "种子不足，请购买");
				}
			}
		});
		//播种西红柿
		JMenuItem tomato = new JMenuItem("西红柿");
		tomato.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				tomato.setBackground(Color.gray);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				tomato.setBackground(getBackground());
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				seedMenu.setPopupMenuVisible(false);
				if(seed[1].getNumber() > 0)
				{
					Cursor coursor = Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("C:\\Users\\Administrator\\Desktop\\代码\\java\\开心农场+植物大战僵尸\\happyfarm_image\\cropImg\\seedCapsicum\\0.png").getImage(),new Point(10,20), "stick");
					setCursor(coursor);
				}else {
					new JOptionPane().showMessageDialog(getParent(), "种子不足，请购买");
				}
			}
		});
		//播种豌豆
		JMenuItem pea = new JMenuItem("豌豆");
		pea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pea.setBackground(Color.gray);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pea.setBackground(getBackground());
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				seedMenu.setPopupMenuVisible(false);
				if(seed[2].getNumber() > 0)
				{
					Cursor coursor = Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("C:\\Users\\Administrator\\Desktop\\代码\\java\\开心农场+植物大战僵尸\\happyfarm_image\\cropImg\\seedCapsicum\\0.png").getImage(),new Point(10,20), "stick");
					setCursor(coursor);
				}else {
					new JOptionPane().showMessageDialog(getParent(), "种子不足，请购买");
				}
			}
		});
		//取消
		JMenuItem exit = new JMenuItem("取消");
		exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				seedMenu.setPopupMenuVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				exit.setBackground(Color.gray);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				exit.setBackground(getBackground());
			}
		});
		//为播种菜单添加子项
		seedMenu.add(capsicum);
		seedMenu.add(tomato);
		seedMenu.add(pea);
		seedMenu.add(exit);
		
		//浇水按钮
		JButton water = new JButton("浇水");
		water.setContentAreaFilled(false);//按钮透明
		water.setBorderPainted(false);//隐藏按钮边框
		water.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				seedMenu.setPopupMenuVisible(false);
			}
		});
		water.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\\u4EE3\u7801\\java\\\u5F00\u5FC3\u519C\u573A+\u690D\u7269\u5927\u6218\u50F5\u5C38\\happyfarm_image\\smallOperateImg\\jug_a.png"));
		water.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		//除虫按钮
		JButton insect = new JButton("除虫");
		insect.setContentAreaFilled(false);//按钮透明
		insect.setBorderPainted(false);//隐藏按钮边框
		insect.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				seedMenu.setPopupMenuVisible(false);
			}
		});
		insect.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\\u4EE3\u7801\\java\\\u5F00\u5FC3\u519C\u573A+\u690D\u7269\u5927\u6218\u50F5\u5C38\\happyfarm_image\\smallOperateImg\\biocide_a.png"));
		
		//翻土按钮
		JButton soil = new JButton("翻土");
		soil.setContentAreaFilled(false);//按钮透明
		soil.setBorderPainted(false);//隐藏按钮边框
		soil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				seedMenu.setPopupMenuVisible(false);
			}
		});
		soil.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\\u4EE3\u7801\\java\\\u5F00\u5FC3\u519C\u573A+\u690D\u7269\u5927\u6218\u50F5\u5C38\\happyfarm_image\\smallOperateImg\\spade_a.png"));
		soil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonPanel.add(seedMenu);
		buttonPanel.add(water);
		buttonPanel.add(insect);
		buttonPanel.add(soil);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane}));
	}
	
	//种植蔬菜,kind表示蔬菜的种类
	//检查对应种子的数量，检查土地的状态,
	private boolean growVegetable(String kind,int i)
	{
		State plantState = this.land.getPlantState(i);
		
		if(plantState == State.ING)
		{
			new JOptionPane().showMessageDialog(getParent(), "这块土地已有作物");
		    return false;
		}
		
		if(plantState == State.NO)
		{
			new JOptionPane().showMessageDialog(getParent(), "这块土地未翻土");
			return false;
		}
		
		switch(kind)
		{
			case "capsicum":
				if(this.seed[0].getNumber() <= 0)
				{
				    new JOptionPane().showMessageDialog(getParent(), "种子不足，请购买");
				    return false;
				}else{
					this.seed[0].setNumber(this.seed[0].getNumber()-1);
					this.land.setPlantState(i, State.ING);
					this.land.setCrop(i, new Crop("capsicum", this.land.getFertility(i), false, false, this.seed[0].getSeedLevel(), this.seed[0].getRipeTime()));
					return true;
				}
				break;
			case "tomato":
				if(this.seed[1].getNumber() <= 0)
				{
				    new JOptionPane().showMessageDialog(getParent(), "种子不足，请购买");
				    return false;
				}else{
					this.seed[1].setNumber(this.seed[1].getNumber()-1);
					this.land.setPlantState(i, State.ING);
					this.land.setCrop(i, new Crop("tomato", this.land.getFertility(i), false, false, this.seed[1].getSeedLevel(), this.seed[1].getRipeTime()));
					return true;
				}
				break;
			case "pea":
				if(this.seed[2].getNumber() <= 0)
				{
				    new JOptionPane().showMessageDialog(getParent(), "种子不足，请购买");
				    return false;
				}else{
					this.seed[2].setNumber(this.seed[2].getNumber()-1);
					this.land.setPlantState(i, State.ING);
					this.land.setCrop(i, new Crop("pea", this.land.getFertility(i), false, false, this.seed[2].getSeedLevel(), this.seed[2].getRipeTime()));
					return true;
				}
				break;
			default:
				 new JOptionPane().showMessageDialog(getParent(), "错误，growVegetable");
				 return false;
		}
		
	}
	
	//为作物浇水
	//为Land的作物Crop[i]浇水
	private boolean giveWater(int i)
	{
		if(this.land.getCrop(i).getDry() == true)
		{
			this.land.getCrop(i).setDry(false);
			return true;
		}
		else{
			return false;
		}
	}
	
	//为作物除虫
	//为Land的作物Crop[i]除虫
	private boolean killPest(int i)
	{
		if(this.land.getCrop(i).getPest() == true)
		{
			this.land.getCrop(i).setPest(false);
			return true;
		}
		else{
			return false;
		}
	}
	
	//收获作物
	//收获土地上的第i小块土地上的作物
	private boolean gain(int i)
	{
		if(this.land.getCrop(i).getNeedTime() == 0)
		{
			int kind;
			switch(this.land.getCrop(i).getName())
			{
			case "capsicum":
				kind = 0;
				break;
			case "tomato":
				kind = 1;
				break;
			case "pea":
				kind = 2;
				break;
			default:
				return false;
			}
			this.vegetable[i].setNumber(this.vegetable[i].getNumber()+this.land.getCrop(i).getNumber());
			this.land.setCrop(i, null);
			return true;
		}else{
			return false;
		}
	}
	
	//翻地
	//将土地上的第i小块土地翻地
	private boolean dealLand(int i)
	{
		if(this.land.getPlantState(i) == State.NO)
		{
			this.land.setPlantState(i, State.OK);
			return true;
		}else{
			return false;
		}
	}
	
	//购买种子
	//knd为种子的类别，number为种子的数量
	private boolean buySeed(String kind, int number)
	{
		int i;
		switch(kind)
		{
		case "capsicum":
			i = 0;
			break;
		case "tomato":
			i = 1;
			break;
		case "pea":
			i = 2;
			break;
		default:
			return false;
		}
		
		if(this.seed[i].getPrice()*number < this.wealth)
		{
			this.wealth = this.wealth - this.seed[i].getPrice()*number;
			this.seed[i].setNumber(this.seed[i].getNumber()+number);
			return true;
		}else{
			return false;
		}
	}
	
	//购买成熟蔬菜
	//knd为成熟蔬菜的类别，number为成熟蔬菜的数量
	private boolean buyVegetale(String kind, int number)
	{
		int i;
		switch(kind)
		{
		case "capsicum":
			i = 0;
			break;
		case "tomato":
			i = 1;
			break;
		case "pea":
			i = 2;
			break;
		default:
			return false;
		}
		
		if(this.vegetable[i].getPrice()*number < this.wealth)
		{
			this.wealth = this.wealth - this.vegetable[i].getPrice()*number;
			this.vegetable[i].setNumber(this.vegetable[i].getNumber()+number);
			return true;
		}else{
			return false;
		}
	}
	
	//打僵尸
	private void playGame()
	{
		
	}
	
	//获得成熟蔬菜的购买权限
	public int getVegetableLevel()
	{
		return this.vegetableLevel;
	}
	
	//设置成熟蔬菜的购买权限
	private boolean setVegetableLevel(int level)
	{
		if(level < 1)
		{
			return false;
		}
		this.vegetableLevel = level;
		return true;
	}
	
	//获得种子的购买权限
	public int getSeedLevel()
	{
		return this.seedLevel;
	}
	
	//设置种子的购买权限
	private boolean setSeedLevel(int level)
	{
		if(level < 0)
		{
			return false;
		}
		this.seedLevel = level;
		return true;
	}

	//进食成熟蔬菜
	private boolean eatVegetable(String kind,int number)
	{
		if(number <= 0)
		{
			return false;
		}
		
		int i;
		switch(kind)
		{
		case "capsicum":
			i = 0;
			break;
		case "tomato":
			i = 1;
			break;
		case "pea":
			i = 2;
			break;
		default:
			return false;
		}
		
		if(this.vegetable[i].getNumber() > number)
		{
			for(int j = 1; j <= number&& this.health <= 100;j++)
			{
				this.vegetable[i].setNumber(this.vegetable[i].getNumber()-1);
				this.health = this.health + this.vegetable[i].getEnergy();
			}
			//吃多了
			if(this.health > 100)
			{
				this.health = 100;
			}
			return true;
		}
		else{
			//还要加东西
			return false;
		}
	}
	
	//获得生命值
	public int getHealth()
	{
		return this.health;
	}
	
	//设置生命值
	private boolean setHealth(int Health)
	{
		if(health > 0 && health <= 100)
		{
			this.health = health;
			return true;
		}
		else{
			return false;
		}
	}
	
	//获得财富
	public int getWealth()
	{
		return this.wealth;
	}
	
	//设置财富
	private boolean setWealth(int weath)
	{
		if(weath < 0)
		{
			return false;
		}
		this.wealth = weath;
		return true;
	}
	
	//获得战斗力
	public int getFight()
	{
		return this.fight;
	}
	
	//设置战斗力
	private boolean setFight(int fight)
	{
		if(fight < 0)
		{
			return false;
		}
		this.fight = fight;
		return true;
	}
	
	//查看战斗力排行榜
	public boolean getFightLine()
	{
		
	}

}
