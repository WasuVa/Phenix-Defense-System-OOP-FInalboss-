package Main;

import controller.Controller;
import view.MainController;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        new MainController(controller).setVisible(true);
    }    
}
