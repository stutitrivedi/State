public class DoritosDispenseHandler extends DispenseHandler {
    public DoritosDispenseHandler(DispenseHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected String getHandlerName() {
        return "Doritos dispenser";
    }

    @Override
    protected String getSnackName() {
        return "Doritos";
    }
}
