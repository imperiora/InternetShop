package start;

import java.util.Scanner;

import controller.ProSuppliesController;
import controller.RecSuppliesController;
import view.GeneralView;


public class Start {

    public static void main(String[] args) {

        new Start();
    }

    public Start() {
    	
    	ProSuppliesController prosuppliesController = new ProSuppliesController();
    	RecSuppliesController recsuppliesController = new RecSuppliesController();
        String cmd;
        Scanner scanner = new Scanner(System.in);
        boolean isEnd = true;
        
        while(isEnd) {
            System.out.println("Enter a command:");
            cmd = scanner.nextLine();
            switch (cmd) {
                case "exit":
                	isEnd = false;
                	GeneralView.exit();
                	break;
                case "list":         		
				prosuppliesController.list();
                	break;
                case "list2":
				
				recsuppliesController.list2();
            }	
        }
    }
}