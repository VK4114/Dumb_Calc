package GUI;
import javax.swing.*;
import java.awt.*;


public class Calculator_GUI extends JComponent {
    private JFrame Calc_F;
    private JPanel numberPanel;
    private JPanel operationPanel;
    private JPanel displayPanel;


    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button0;
    private JButton buttonAdd;
    private JButton buttonSub;
    private JButton buttonMulti;
    private JButton buttonDiv;
    private JButton buttonDel;
    private JButton buttonEquals;
    private JButton buttonC;
    private JButton buttonCE;

    private JTextField displayField;



    public void Initialize()
    {
        //Initialize Frame
        Calc_F = new JFrame("Dumb Calculator");
        Calc_F.setSize(800,800);
        Calc_F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Initialize Panels and TextFields
        numberPanel = new JPanel(new GridLayout(4, 3));
        operationPanel = new JPanel(new GridLayout(8, 1));
        displayPanel = new JPanel();
        displayField = new JTextField();
        displayField.setEditable(false);



        //Initialize Buttons
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        button0 = new JButton("0");
        buttonAdd = new JButton("+");
        buttonSub = new JButton("-");
        buttonMulti = new JButton("X");
        buttonDiv = new JButton("/");
        buttonDel = new JButton("Del");
        buttonEquals = new JButton("=");
        buttonC = new JButton("C");
        buttonCE = new JButton("CE");

        //Add Buttons to panels
        numberPanel.add(button7);
        numberPanel.add(button8);
        numberPanel.add(button9);
        numberPanel.add(button4);
        numberPanel.add(button5);
        numberPanel.add(button6);
        numberPanel.add(button1);
        numberPanel.add(button2);
        numberPanel.add(button3);
        numberPanel.add(button0);
        operationPanel.add(buttonAdd);
        operationPanel.add(buttonSub);
        operationPanel.add(buttonMulti);
        operationPanel.add(buttonDiv);
        operationPanel.add(buttonEquals);
        operationPanel.add(buttonDel);
        operationPanel.add(buttonCE);
        operationPanel.add(buttonC);



        //

        Calc_F.add(numberPanel, BorderLayout.CENTER);
        Calc_F.add(operationPanel, BorderLayout.EAST);
        Calc_F.add(displayPanel, BorderLayout.NORTH);


        displayPanel.add(displayField, BorderLayout.CENTER);
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setFont(new Font("Arial", Font.PLAIN, 24));
        displayField.setPreferredSize(new Dimension(200, 50));
        numberPanel.setPreferredSize(new Dimension(300, 400));
        operationPanel.setPreferredSize(new Dimension(150, 400));

        Calc_F.setVisible(true);







    }
    //Getters
    public JButton getButton1()
    {
        return button1;
    }
    public JButton getButton2()
    {
        return button2;
    }
    public JButton getButton3()
    {
        return button3;
    }
    public JButton getButton4()
    {
        return button4;
    }
    public JButton getButton5()
    {
        return button5;
    }
    public JButton getButton6()
    {
        return button6;
    }
    public JButton getButton7()
    {
        return button7;
    }
    public JButton getButton8()
    {
        return button8;
    }
    public JButton getButton9()
    {
        return button9;
    }
    public JButton getButton0()
    {
        return button0;
    }
    public JButton getButtonAdd()
    {
        return buttonAdd;
    }
    public JButton getButtonSub()
    {
        return buttonSub;
    }
    public JButton getButtonDiv()
    {
        return buttonDiv;
    }
    public JButton getButtonMulti()
    {
        return buttonMulti;
    }
    public JButton getButtonDel()
    {
        return buttonDel;
    }
    public JButton getButtonC()
    {
        return buttonC;
    }
    public JButton getButtonCE()
    {
        return buttonCE;
    }
    public JButton getButtonEquals()
    {
        return buttonEquals;
    }
    public JTextField getDisplayField()
    {
        return displayField;
    }





}
