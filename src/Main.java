import Controller.Manager;
import View.Menu;
import Model.Contact;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contact> lc = new ArrayList<>();
        String[] options = {"Add a Contact", "Display all Contact", "Delete a Contact", "Exit"};
        Menu menu = new Menu("========= Contact program =========", options) {
            @Override

            public void execute(int choice) {
                switch (choice) {
                    case 1:
                        Manager.createContact(lc);
                        break;
                    case 2:
                        Manager.printAllContact(lc);
                        break;
                    case 3:
                        Manager.deleteContact(lc);
                        break;
                    case 4:
                        System.out.println("Exit");
                }
            }
        };
        menu.run();
    }

}