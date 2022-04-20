import java.awt.*;
import java.awt.event.*;
import Couche.CTransport.TransportCouche;
import Couche.Session.GenerationOfStart.Generer;
import Couche.Session.GenerationOfStart.generateSlec;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
/*
 * Created by JFormDesigner on Wed Apr 20 02:41:17 EDT 2022
 */



/**
 * @author ismael
 */
public class guix extends JFrame {
    public guix() {
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {

        TransportCouche transport = new TransportCouche();
        //fileUtility.Generate_S_lec("Couche/Session/S_lec.txt");
System.out.println("here");
        transport.DemarrerCommunication();
    }

    private void button2MouseClicked(MouseEvent e) {
        S_lec.setText("");
        S_ecr.setText("");
        L_ecr.setText("");
        L_lec.setText("");
        TransportCouche.ResetData();

    }

    private void button1(ActionEvent e) {
        try
        {
            //Probleme ici vous devez ccliquer 2 fois sur le bouton pour lancer la communication
            FileReader reader = new FileReader( "Couche/Session/S_lec.txt" );
            FileReader reader2 = new FileReader( "Couche/Session/S_ecr.txt" );
            FileReader reader3 = new FileReader( "Couche/LiasonDonnee/L_ecr.txt" );
            FileReader reader4 = new FileReader( "Couche/LiasonDonnee/L_lec.txt" );
            BufferedReader br2 = new BufferedReader( reader2 );
            BufferedReader br = new BufferedReader(reader);
            BufferedReader br3 = new BufferedReader(reader3);
            BufferedReader br4 = new BufferedReader(reader4);
            S_lec.read( br, null );
            S_ecr.read( br2, null );
            L_ecr.read( br3, null );
            L_lec.read( br4, null );

            br.close();
            br2.close();
            br3.close();
            br4.close();

        }
        catch(Exception e2) { System.out.println(e2); }
    }

    public void button3MouseClicked(MouseEvent e) throws IOException {
        generateSlec.RandomData();
        // TODO add your code here
    }

    private void button4MouseClicked(MouseEvent e) {
        String data =
                "Firefox       Edge       CONECT\n" +
                        "Firefox       Edge       DATA       hello word\n" +
                        "Firefox       Edge       LIB\n" +
                        "Chrome       Firefox       CONECT\n" +
                        "Chrome       Firefox       DATA       my enemey\n" +
                        "Chrome       Firefox       LIB\n" +
                        "Brave       Edge       DATA      887499887yu6867u5756u\n" +
                        "Firefox       Brave       CONECT\n" +
                        "Edge       Brave       DATA       nice\n" +
                        "Edge       Chrome       DATA       y6546¬¦¤¢¬345432\n" +
                        "Brave       Firefox       LIB\n" +
                        "1234        22          CONECT      UNDERCORVER\n" +
                        "22          1234        DATA        hello\n" +
                        "22          1234        LIB\n" +
                        "1234        22          CONECT      UNDERCORVER\n" +
                        "22          1234        DATA        hello\n" +
                        "22          1234        LIB" ;
        File filepath= new File("Couche/Session/S_lec.txt");

        try{
            if(!filepath.exists()) {
                final var newFile = filepath.createNewFile();
            }
            FileWriter fileWriter= new FileWriter(filepath);
            fileWriter.write(data);
            fileWriter.flush();
            fileWriter.close();

        } catch (IOException g) {
            g.printStackTrace();
        }
    }   


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - ismael
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        scrollPane1 = new JScrollPane();
        S_lec = new JTextArea();
        scrollPane2 = new JScrollPane();
        L_lec = new JTextArea();
        scrollPane3 = new JScrollPane();
        L_ecr = new JTextArea();
        scrollPane4 = new JScrollPane();
        S_ecr = new JTextArea();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();

        //======== this ========
        setTitle("PROJET DE SESSION INF1009");
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("S_lec");

        //---- label2 ----
        label2.setText("S_ecr");

        //---- label3 ----
        label3.setText("L_lec");

        //---- label4 ----
        label4.setText("L_ecr");

        //======== scrollPane1 ========
        {

            //---- S_lec ----
            S_lec.setFont(new Font(Font.MONOSPACED, Font.BOLD | Font.ITALIC, 10));
            scrollPane1.setViewportView(S_lec);
        }

        //======== scrollPane2 ========
        {

            //---- L_lec ----
            L_lec.setFont(new Font(Font.MONOSPACED, Font.BOLD | Font.ITALIC, 10));
            scrollPane2.setViewportView(L_lec);
        }

        //======== scrollPane3 ========
        {

            //---- L_ecr ----
            L_ecr.setFont(new Font(Font.MONOSPACED, Font.BOLD | Font.ITALIC, 10));
            scrollPane3.setViewportView(L_ecr);
        }

        //======== scrollPane4 ========
        {

            //---- S_ecr ----
            S_ecr.setFont(new Font(Font.MONOSPACED, Font.BOLD | Font.ITALIC, 10));
            scrollPane4.setViewportView(S_ecr);
        }

        //---- button1 ----
        button1.setText("Commencer");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
                button1MouseClicked(e);
            }
        });
        button1.addActionListener(e -> button1(e));

        //---- button2 ----
        button2.setText("Reset");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
                button2MouseClicked(e);
            }
        });

        //---- button3 ----
        button3.setText("Regener S_lec");
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    button3MouseClicked(e);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                try {
                    button3MouseClicked(e);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        //---- button4 ----
        button4.setText("Demo file");
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button4MouseClicked(e);
                button4MouseClicked(e);
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(26, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label1)
                                    .addGap(0, 187, Short.MAX_VALUE)))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label3)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)))
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(label4)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 567, Short.MAX_VALUE)
                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
                            .addGap(68, 68, 68))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(scrollPane4, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                .addComponent(scrollPane3, GroupLayout.Alignment.LEADING)
                                .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                                    .addComponent(label2)
                                    .addGap(0, 241, Short.MAX_VALUE)))
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                                    .addComponent(button4)
                                    .addGap(142, 142, 142))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 363, Short.MAX_VALUE)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addComponent(button3)
                                            .addContainerGap(100, Short.MAX_VALUE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(101, 101, 101))))))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(button1)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(button3)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                            .addComponent(button4)
                            .addGap(126, 126, 126))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addContainerGap(167, Short.MAX_VALUE)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label1)
                                .addComponent(label2))
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                .addComponent(scrollPane4, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label4)
                                .addComponent(button2))
                            .addGap(11, 11, 11))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)))
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                        .addComponent(scrollPane3, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                    .addContainerGap(136, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
/*public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new guix().setVisible(true);
            }
        });*/

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - ismael
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JScrollPane scrollPane1;
    private JTextArea S_lec;
    private JScrollPane scrollPane2;
    private JTextArea L_lec;
    private JScrollPane scrollPane3;
    private JTextArea L_ecr;
    private JScrollPane scrollPane4;
    private JTextArea S_ecr;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
