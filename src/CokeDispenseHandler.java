
public class CokeDispenseHandler extends DispenseHandler {
    public CokeDispenseHandler(DispenseHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected String getHandlerName() {
        return "Coke dispenser";
    }

    @Override
    protected String getSnackName() {
        return "Coke";
    }
}
