package week7.hw7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Date;

/**
 * Created by Tordlin on 02/09/2015.
 */
public class NotePad extends JFrame {

    private JTextField filePathField;
    private JTextArea textArea;
    private JButton loadButton;
    private JButton saveButton;

    public NotePad() {
        super("NotePad");
        init();
    }

    private void init() {
        filePathField = new JTextField("File path:");
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        initButtons();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(new Dimension(500, 700));

        JPanel bottomPanel = new JPanel(new GridLayout(1, 2));
        bottomPanel.add(loadButton);
        bottomPanel.add(saveButton);

        getContentPane().add(filePathField, BorderLayout.NORTH);
        getContentPane().add(textArea, BorderLayout.CENTER);
        getContentPane().add(bottomPanel, BorderLayout.SOUTH);

    }

    private void initButtons() {
        boolean exitFromLoop = true;
        BufferedReader reader = null;
        BufferedWriter writer = null;

        loadButton = new JButton("LOAD");
        saveButton = new JButton("SAVE");

        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String filePath = filePathField.getText();
                StringBuilder builder = new StringBuilder();
                File file = new File(filePath);
                if (file.exists()) {
                    try {
                        reader = new BufferedReader(new FileReader(filePath));
                        while (exitFromLoop) {
                            int i = reader.read();
                            if (i != -1) {
                                builder.append(filePath);
                            } else {
                                exitFromLoop = false;
                            }
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } finally {
                        if (reader != null) {
                            reader.close();
                        }
                    }
                } else {
                    System.out.println("File doesn`t exist. Please check your path");
                }
                textArea.setText(builder.toString());
            }
        });

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String filePath = filePathField.getText());
                StringBuilder builder = new StringBuilder();
                File file = new File(filePath);
                if (!(file.exists())) {
                    try {
                        file.createNewFile(filePath);
                        writer = new BufferedWriter(new FileWriter(filePath));
                        writer.write(textArea.getText());
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        if (writer != null) {
                            writer.close();
                        }
                    }
                } else {
                    System.out.println("File with this path exist. Please choose another path");
                }
                textArea.setText(builder.toString());
            }
        });
    }
}
