package GUI;
import Logic.Calculator_Model;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator_Controller {
    private Calculator_GUI GUI;
    private Calculator_Model Model;
    private Double Operand1;
    private Double Operand2;
    private String Operator;
    private Double result;



    public void Controller(Calculator_Model Model, Calculator_GUI GUI) {
        this.GUI = GUI;
        this.Model = Model;

        //Listeners for Number Buttons
        this.GUI.getButton1().addActionListener(new NumberListener());
        this.GUI.getButton2().addActionListener(new NumberListener());
        this.GUI.getButton3().addActionListener(new NumberListener());
        this.GUI.getButton4().addActionListener(new NumberListener());
        this.GUI.getButton5().addActionListener(new NumberListener());
        this.GUI.getButton6().addActionListener(new NumberListener());
        this.GUI.getButton7().addActionListener(new NumberListener());
        this.GUI.getButton8().addActionListener(new NumberListener());
        this.GUI.getButton9().addActionListener(new NumberListener());
        this.GUI.getButton0().addActionListener(new NumberListener());

        //Listeners for Operations
        this.GUI.getButtonAdd().addActionListener(new OperationListener("+"));
        this.GUI.getButtonSub().addActionListener(new OperationListener("-"));
        this.GUI.getButtonMulti().addActionListener(new OperationListener("X"));
        this.GUI.getButtonDiv().addActionListener(new OperationListener("/"));
        this.GUI.getButtonEquals().addActionListener(new EqualsListener());

        //Listeners for Calculator Functions: C, CE, DEL.
        this.GUI.getButtonCE().addActionListener(new CEListener());
        this.GUI.getButtonC().addActionListener(new CListener());
        this.GUI.getButtonDel().addActionListener(new DelListener());


    }
    class CEListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            GUI.getDisplayField().setText(null);
        }
    }

    class CListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            Operand1 = null;
            Operand2 = null;
            GUI.getDisplayField().setText(null);
        }
    }

    class DelListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            GUI.getDisplayField().setText(GUI.getDisplayField().getText().substring(0, GUI.getDisplayField().getText().length() - 1));
        }
    }

    class OperationListener implements ActionListener
    {

        private String Operation;

        public OperationListener(String Operation)
        {
            this.Operation = Operation;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if(GUI.getDisplayField().getText() != null) {
                Operand1 = Double.parseDouble(GUI.getDisplayField().getText());
                Operator = Operation;
                GUI.getDisplayField().setText(null);
            }
            else
            {
                Operand1 = 0.0;
            }
        }
    }

    class EqualsListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(GUI.getDisplayField().getText() != null)
            {
                Operand2 = Double.parseDouble(GUI.getDisplayField().getText());
                switch (Operator)
                {
                    case "+":
                        result = Model.add(Operand1,Operand2);
                        break;
                    case "-":
                        result = Model.Sub(Operand1,Operand2);
                        break;
                    case "X":
                        result = Model.Multi(Operand1, Operand2);
                        break;
                    case"/":
                        result = Model.Div(Operand1, Operand2);
                        break;
                }
                GUI.getDisplayField().setText(String.valueOf(result));
                Operator = "";
            }

        }
    }

    class NumberListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e){
            String Command = e.getActionCommand();
            GUI.getDisplayField().setText(GUI.getDisplayField().getText() + Command);
        }
    }

}


