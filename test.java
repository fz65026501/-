import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Scrollbar;

import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;

public class test extends JFrame {

	private JPanel total;
	private JPanel contentPane;
	private JPanel title;
	private JPanel operation;
	private JPanel selection;
	private JPanel filename;
	private JPanel filesearch;
	private JPanel fileclass;
	private JPanel filekuo;
	private JPanel boolgongshi;
	/**
	 * @wbp.nonvisual location=-33,344
	 */
	private final JScrollPane scrollpane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");//�ı������ʽ
					SwingUtilities.updateComponentTreeUI(frame);
					frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
					frame.setVisible(true);
					frame.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);//�������
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	void makebutton(JPanel panel,String name) {
		JButton button = new JButton(name);
		panel.add(button);

	}
	
	void makelabel(JPanel panel,String name) {
		JLabel label = new JLabel(name);
		label.setFont(new Font("����", Font.PLAIN, 20));
		panel.add(label);
	}
	
	void filenameselect() {
		JLabel label = new JLabel("��ѡ����Ҫ�������ļ�·��:");
		JTextField text = new JTextField(20);
		JButton button = new JButton("ѡ��·��");
		filename.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		filename.add(label);
		filename.add(text);
		filename.add(button);
		filename.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "A"));
	}
	void filesearchselect() {
		JLabel label = new JLabel("��������Ҫ�������ļ���:");
		JTextField text = new JTextField(20);
		JRadioButton button1 = new JRadioButton("ǰ׺");
		JRadioButton button2 = new JRadioButton("��׺");
		JRadioButton button3 = new JRadioButton("ȫ��");
		JPanel gbutton = new JPanel();
		
		ButtonGroup group = new ButtonGroup();
		group.add(button1);
		group.add(button2);
		group.add(button3);
		
		gbutton.add(button1);
		gbutton.add(button2);
		gbutton.add(button3);
		filesearch.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		filesearch.add(label);
		filesearch.add(text);
		filesearch.add(gbutton);

		filesearch.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "B"));
	}
	void fileclassselect() {
		JLabel label = new JLabel("�ļ����:");
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"����","�ĵ�","ͼ��","��Ƶ","��Ƶ","��ִ���ļ�","����"}));
		comboBox.setToolTipText("");
		comboBox.setEditable(true);
		
		fileclass.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		fileclass.add(label);
		fileclass.add(comboBox);

		//filesearch.add(button);
		fileclass.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "C"));
	}
	void filekuoselect() {
		JLabel label = new JLabel("�ļ���չ��:");
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"����","txt","exe","doc","pdf","jpg","mp4"}));
		comboBox.setToolTipText("");
		comboBox.setEditable(true);
		
		filekuo.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		filekuo.add(label);
		filekuo.add(comboBox);

		//filesearch.add(button);
		filekuo.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "D"));
	}
	void boolgongshi() {
		JLabel label = new JLabel("���벼�����ʽ(��ѡ):");
		JTextField text = new JTextField(60);
		JButton button1 = new JButton("��(and)");
		JButton button2 = new JButton("��(or)");
		JButton button3 = new JButton("��(not)");
		JButton button4 = new JButton("���(nand)");
		JButton button5 = new JButton("���(nor)");
		JButton button6 = new JButton("���(xor)");
		JButton button7 = new JButton("������(");
		JButton button8 = new JButton("������)");
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));	
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
		panel2.add(button7);
		panel2.add(button8);
		
		panel1.add(label);
		panel1.add(text);
		panel1.add(panel2);
		
		JLabel label_1 = new JLabel("ʾ��: A and B or (C xor D),����A,B,C,D�ֱ�Ϊÿ�������߿����Ͻǵ���ĸ��ʶ,and�Ȳ�������������ֶ�����,Ҳ�ɵ����ť�Զ����롣");
		label_1.setForeground(Color.RED);
		panel3.add(label_1);
		boolgongshi.setLayout(new GridLayout(2,1));
		boolgongshi.add(panel1);
		boolgongshi.add(panel3);
		boolgongshi.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "�������ʽ"));
	}
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		total = new JPanel();
		total.setBorder(new EmptyBorder(5, 5, 5, 5));
		total.setLayout(new BorderLayout(0, 0));
		
		title = new JPanel();
		makelabel(title,"�ļ�������");
		
		selection = new JPanel();
		makebutton(selection,"ȷ��");
		makebutton(selection,"ȡ��");
		
		operation = new JPanel();
		operation.setBorder(new TitledBorder(null, "��ѡ����������", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		operation.setLayout(new GridLayout(5, 1));
		
		
		filename = new JPanel();
		filenameselect();
		
		filesearch = new JPanel();
		filesearchselect();
		
		fileclass = new JPanel();
		fileclassselect();
		
		filekuo = new JPanel();
		filekuoselect();
		
		boolgongshi = new JPanel();
		boolgongshi();
		
		operation.add(filename);
		operation.add(filesearch);
		operation.add(fileclass);
		operation.add(filekuo);
		operation.add(boolgongshi);

		
		scrollpane = new JScrollPane(total);
	   // Border etched = BorderFactory.createEtchedBorder();
	   // Border titled = BorderFactory.createTitledBorder(etched, "��ѡ����������");

		//total = new JPanel();
		total.add(title,BorderLayout.NORTH);
		total.add(selection, BorderLayout.SOUTH);
		total.add(operation, BorderLayout.CENTER);
		setTitle("�ļ�������");
		add(scrollpane);
	}

}
