package praktikum;

import javax.swing.*;

public class Form extends JFrame {
    JLabel lForm, lName, lNim, lGender, lReligion, lAddress;
    JTextField tfName, tfNim;
    JRadioButton rbMale, rbFemale;
    JComboBox cbReligion;
    JTextArea taAddress;
    String[] religion = {"Islam", "Kristen", "Hindu", "Budha"};
    JButton bOk;

    public void displayForm() {
        setTitle("Personal Data");
        lForm = new JLabel("DATA DIRI MAHASISWA");
        lName = new JLabel("Nama");
        tfName = new JTextField();
        lNim = new JLabel("NIM");
        tfNim = new JTextField();
        lGender = new JLabel("Jenis Kelamin");
        rbMale = new JRadioButton("Laki-laki");
        rbFemale = new JRadioButton("Perempuan");
        lReligion = new JLabel("Agama");
        cbReligion = new JComboBox(religion);
        lAddress = new JLabel("Alamat");
        taAddress = new JTextArea();
        bOk = new JButton("OK");

        ButtonGroup gender = new ButtonGroup();
        gender.add(rbMale);
        gender.add(rbFemale);

        setLayout(null);
        add(lForm);
        add(lName);
        add(tfName);
        add(lNim);
        add(tfNim);
        add(lGender);
        add(rbMale);
        add(rbFemale);
        add(lReligion);
        add(cbReligion);
        add(lAddress);
        add(taAddress);
        add(bOk);

        lForm.setBounds(200, 40, 300, 30);
        lName.setBounds(100, 80, 100, 30);
        tfName.setBounds(210, 80, 150, 30);
        lNim.setBounds(100, 120, 100, 30);
        tfNim.setBounds(210, 120, 150, 30);
        lGender.setBounds(100, 160, 100, 30);
        rbMale.setBounds(210, 160, 100, 30);
        rbFemale.setBounds(320, 160, 100, 30);
        lReligion.setBounds(100, 200, 100, 30);
        cbReligion.setBounds(210, 200, 150, 30);
        lAddress.setBounds(100, 240, 100, 30);
        taAddress.setBounds(210, 240, 200, 70);
        bOk.setBounds(350, 320, 60, 30);

        setSize(550, 450);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
