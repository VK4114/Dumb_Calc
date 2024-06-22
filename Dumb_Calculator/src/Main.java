import GUI.Calculator_Controller;
import GUI.Calculator_GUI;
import Logic.Calculator_Model;

public class Main {
    public static void main(String args[])
    {
        Calculator_GUI GUI = new Calculator_GUI();
        Calculator_Model Model = new Calculator_Model();
        GUI.Initialize();
        Calculator_Controller Controller = new Calculator_Controller();
        Controller.Controller(Model, GUI);

    }
}
