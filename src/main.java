import java.util.ArrayList;
import java.util.List;

public class main{


    public static void main(String[] args) {
        List<Snack> snacks = new ArrayList<>();
        snacks.add(new Snack("Snicker", 0.5, 1));
        snacks.add(new Snack("Coke", 1.0, 2));
        snacks.add(new Snack("Pepsi", 0.3, 2));
        snacks.add(new Snack("Kitkat", 2.08, 2));
        snacks.add(new Snack("Cheetos", 3.02, 2));
        snacks.add(new Snack("Doritos", 3.05, 2));





        VendingMachine vendingMachine = new VendingMachine(snacks);
        //vendingMachine.getHandler().getFirstHandler().dispense(new Snack("Snickers", 0.5, 0));

        vendingMachine.selectSnack("Snicker");
        vendingMachine.insertMoney(0.5);
        vendingMachine.insertMoney(0.5);
      //  vendingMachine.insertMoney(0.5);
        //vendingMachine.insertMoney(0.25);

        vendingMachine.selectSnack("Coke");
        vendingMachine.insertMoney(1.0);
        //vendingMachine.insertMoney(1.0);

        vendingMachine.selectSnack("Pepsi");
        vendingMachine.insertMoney(0.5);

       /* vendingMachine.getHandler().getFirstHandler().dispense(new Snack("Snickers", 0.5, 0));*/
    }
}
