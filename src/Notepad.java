
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Notepad {

    Notepad() {
        JFrame jFrame = new JFrame("Блокнот");
        jFrame.setSize(800, 480);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font = new Font("Verdana", Font.PLAIN, 11);
        JMenuBar jMenuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("Файл");
        fileMenu.setFont(font);

        JMenuItem create = new JMenuItem("Создать");
        create.setFont(font);
        fileMenu.add(create);

        JMenuItem open = new JMenuItem("Открыть");
        open.setFont(font);
        fileMenu.add(open);

        JMenuItem save = new JMenuItem("Сохранить");
        save.setFont(font);
        fileMenu.add(save);

        JMenu saveAs = new JMenu("Сохранить как...");
        saveAs.setFont(font);
        fileMenu.add(saveAs);

        JMenuItem saveAsPDF = new JMenuItem("PDF файл");
        saveAsPDF.setFont(font);
        saveAs.add(saveAsPDF);

        JMenuItem saveAsTXT = new JMenuItem("TXT файл");
        saveAsPDF.setFont(font);
        saveAs.add(saveAsTXT);

        fileMenu.addSeparator();

        JMenuItem pageSettings = new JMenuItem("Параметры страницы...");
        pageSettings.setFont(font);
        fileMenu.add(pageSettings);

        JMenu print = new JMenu("Печать...");
        print.setFont(font);
        fileMenu.add(print);

        JMenuItem printP = new JMenuItem("на принтер");
        printP.setFont(font);
        print.add(printP);

        fileMenu.addSeparator();

        JMenuItem exitMenuItem = new JMenuItem("Выход");
        exitMenuItem.setFont(font);
        fileMenu.add(exitMenuItem);

        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }
        });

        jMenuBar.add(fileMenu);
        JMenu editMenu = new JMenu("Правка");
        editMenu.setFont(font);

        jMenuBar.add(editMenu);
        JMenu formatMenu = new JMenu("Формат");
        formatMenu.setFont(font);
        jMenuBar.add(formatMenu);

        JMenu viewMenu = new JMenu("Вид");
        viewMenu.setFont(font);
        jMenuBar.add(viewMenu);

        JMenu helpMenu = new JMenu("Справка");
        helpMenu.setFont(font);
        jMenuBar.add(helpMenu);

        JEditorPane editField = new JEditorPane();

        jFrame.add(jMenuBar);
        jFrame.setJMenuBar(jMenuBar);
        jFrame.add(editField);

        jFrame.setVisible(true);


    }

        }