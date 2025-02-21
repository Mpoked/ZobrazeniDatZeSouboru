import javax.swing.*;

public class Form extends JFrame {
    private JTextField nazevDeskovky;
    private JRadioButton hodnoceni2;
    private JRadioButton hodnoceni3;
    private JCheckBox vlastnímHru;
    private JRadioButton hodnoceni1;
    private JButton predchozi;
    private JButton dalsi;
    private JPanel pnMain;

    public Form(){
        this.initComponents();
    }

    public void initComponents(){
        setContentPane(pnMain);
        setTitle("Deskovky");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }
}


