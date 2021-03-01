package Laba2; //����� Java �������

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //���������� ��� ������� ���������
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;
import javax.swing.*; // ���������� ��� GUI (��������� �� ������ awt)

public class subversion {

	public subversion() {
	JFrame main_GUI = new JFrame("subversion");	// �������� ������������ ����
	main_GUI.setTitle ("Using subversion for developers");
	main_GUI.setBounds(550,400,500,350);
	main_GUI.setResizable(false); // ������������� ������ ����
	
    Image logo = new Image();
    
	JPanel main_panel = new JPanel(); // ������ - ������������ ��� ����������� ����������� � ����
	main_panel.setLayout(null);
	main_GUI.add(main_panel);
	
	JButton button_exit = new JButton("�����"); // ��������� ������
	button_exit.setBounds(370, 200, 100, 40);
	ActionListener actionListener = new ListenerButton(); //������� ���������
	button_exit.addActionListener(actionListener); // ��������� ��������� � ������
	main_panel.add(button_exit);
	

	JLabel laba_info = new JLabel("������������ ������ �4"); // ����������� ������ ��� �����������
	laba_info.setBounds(150,0,150,30);
	main_panel.add(laba_info);
	JButton inform = new JButton("����������"); // ������ ������ ����������
	inform.setBounds(15, 200, 100, 40);
	ActionListener act = new InfoButton();
	inform.addActionListener(act);
	main_panel.add(inform);

	String[] peremesh = { // ���������� �������
	        "�����������  �������  �����  �  �������  ������  ����",
	        "�����������  �������  �����  �  ��������",
	        "�����������  �������  �����  �  ������� ����� ����",
	        "������������� ������ � �������24"
	    };
	JComboBox cb = new JComboBox(peremesh); // ���������� ������� ����������
	ActionListener actionListener3 = new ActionListener() { // �������� ���������
	    public void actionPerformed(ActionEvent e) {
	                String vibor = (String)cb.getSelectedItem();
	                switch (vibor) {
	                case "�����������  �������  �����  �  �������  ������  ����":  logo.setLocation(270, 5);
	                break;
	                case "�����������  �������  �����  �  ��������":  logo.setLocation(120, 5);
	                break;
	                case "�����������  �������  �����  �  ������� ����� ����":  logo.setLocation(0, 5);
	                break;
	                case "������������� ������ � �������24":
	                	PuzirSortirovka srt = new PuzirSortirovka();
	                	JOptionPane.showMessageDialog(null,"��������������� ������: " + Arrays.toString(srt.sort()) );
	                break;
	                }
	    }
	};
	        cb.addActionListener(actionListener3); // ���������� ��������� � ����������
	        cb.setBounds(15,150,350,50); // ����������� �������� ���� combobox
	        main_panel.add(cb); // ���������� combobox �� ������

JMenuBar menu_bar= new JMenuBar();
        JMenu menu= new JMenu("File");
        menu_bar.add (menu);
        JMenuItem menuitem1=new JMenuItem("Logo");
        menuitem1.addActionListener(new ActionListener() {
public void actionPerformed (ActionEvent event) {
        logo.setSize(1000, 1000);
        logo.setLocation(270, 5);
        main_panel.add(logo);
        main_panel.setVisible(false);
        main_panel.setVisible(true);
        }
        });
        menu.add(menuitem1); 
        
        JMenuItem menuitem3=new JMenuItem("��������� ���� � ������24");
        menu.add(menuitem3);   
        
        menu.add(menuitem1);        
        JMenuItem menuitem2=new JMenuItem("Exit");
        ActionListener actionListener2 = new ListenerButton(); //������� ���������
        menuitem2.addActionListener(actionListener2); // ��������� ��������� � ������
        menu.add(menuitem2);            
        main_GUI.setJMenuBar(menu_bar);
        
        JTextField Field1 = new JTextField(15);
        Field1.setBounds(15,120,100,20);
        Field1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c> '9')) &&(c != '.')){
                    e.consume();  // ����������� ����� ����
                }
            }
        });

 
        main_panel.add(Field1);

        JTextField Field2 = new JTextField(15);
        Field2.setBounds(120,120,190,20);
        Field2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0')|| (c> '9'))){
                    e.consume();  // ����������� ����� ����
                }
            }
        });

        main_panel.add(Field2);

        JTextField Field3 = new JTextField(15);
        Field3.setBounds(320,120,160,20);
        Field3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0')|| (c> '9')) &&(c != '.')){
                    e.consume();  // ����������� ����� ����
                }
            }
        });

        main_panel.add(Field3);


        JLabel h1 = new JLabel("������� ������");
        JLabel S1 = new JLabel("������� ���-�� ������ ���������");
        JLabel S2 = new JLabel("������� ������� ���������");
        h1.setBounds(15,100,100,20);
        S1.setBounds(115,100,200,20);
        S2.setBounds(320,100,200,20);
        main_panel.add(h1);
        main_panel.add(S1);
        main_panel.add(S2);
        
        JButton vichislit = new JButton("��������� V");
    	vichislit.setBounds(15,70,120,30);
    	main_panel.add(vichislit);
    	JLabel otvet = new JLabel();
    	otvet.setBounds(150,70,200,30);
    	ActionListener actionListener4 = new ActionListener() { // �������� ���������
    	    public void actionPerformed(ActionEvent e) {
    	    	 try {
    	                if (e.getSource() == vichislit) {
    	                	double h = Double.parseDouble(Field1.getText());
    	                	double n = Double.parseDouble(Field2.getText());
    	                	double a = Double.parseDouble(Field3.getText());
    	                	String otv;
    	                	if (n<3) {
    	                		otv = "������� ���-�� ������ ������ 2";
    	                	} else {
    	                	double V = (n*a*a*h)/(12*Math.tan(Math.toRadians(180)/n));
    	                	otv = "V=" + V;
    	                	}
    	                	otvet.setText(otv);
    	                	main_panel.add(otvet);
    	                	otvet.setVisible(false);
    	                	otvet.setVisible(true);
    	                    }

    	                }  catch (Exception ex){ JOptionPane.showMessageDialog(null, "������� � ���� �����");}
    	                }
    	        };
    	        vichislit.addActionListener(actionListener4); 
        
        
        main_GUI.setVisible(true);
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);} // �������� ���� JFrame � �������� Java



	

	public static void main(String[] args) { // ���������� �������: http://www.mstu.edu.ru/study/materials/java/
		subversion student= new subversion();
		
	}

}
