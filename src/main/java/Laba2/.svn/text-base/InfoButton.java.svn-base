package Laba2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class InfoButton implements ActionListener {
	public void actionPerformed(ActionEvent e)
	{
		final JFrame info_pane = new JFrame(); // Создание графического окна
		info_pane.setTitle("Информация");
		info_pane.setBounds(800, 300, 500, 300);
		info_pane.setResizable(false); // Фиксированный размер окна
		
		JPanel sec_panel = new JPanel(); // Панель - используется для организации компонентов в окне
        sec_panel.setLayout(null); // Устанавливается менеджер компоновки
        info_pane.add(sec_panel);
        
        String num[] = new String[4];
        
        //Считывем и запоминаем построчно данные из файла в массив строк
        try {
        	String dir = System.getProperty("java.class.path");
        	Path path = Paths.get(dir);
        	Path ddd = path.getParent();
        	Path ddd1 = ddd.getParent();
        	String kkk = ddd1.toString();
        	String kkk1 = kkk + "/src/main/resources/teams.txt";
        	File file = new File(kkk1);
        	Scanner scanner = new Scanner(file);
        	int i = 0;
        	while (i <= 3) {
        		num[i] = scanner.nextLine();
        		i++;
        		}
        	}
        	catch (Exception ex) { //обработка исключения
        	System.out.println(ex.getMessage());
        	}
        
        // Добавляются члены группы
        JLabel text = new JLabel("Номера зачетных книжек указаны ниже");
        text.setBounds(30, 0, 400, 30);
        JLabel moder = new JLabel(num[0]);
        moder.setBounds(30, 30, 400, 30);
        JLabel first = new JLabel(num[1]);
        first.setBounds(30, 60, 400, 30);
        JLabel second = new JLabel(num[2]);
        second.setBounds(30, 90, 400, 30);
        JLabel third = new JLabel(num[3]);
        third.setBounds(30, 120, 400, 30);

      
        // Кнопка возврата
        JButton button_back = new JButton("Назад");
        button_back.setBounds(270, 200, 100, 40);
        button_back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                info_pane.dispose(); // Закрытие окна информации
            }
        });
        
        // Добавление на панель созданные компоненты
        sec_panel.add(text);
        sec_panel.add(moder);
        sec_panel.add(first);
        sec_panel.add(second);
        sec_panel.add(third);
        sec_panel.add(button_back);
        
        info_pane.setVisible(true);
        info_pane.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
