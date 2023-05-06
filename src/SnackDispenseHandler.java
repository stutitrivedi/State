public class SnackDispenseHandler {
    private DispenseHandler firstHandler;

    public SnackDispenseHandler() {
        this.firstHandler = new SnickerDispenseHandler(new CokeDispenseHandler(new CheetosDispenseHandler(new DoritosDispenseHandler(new PepsiDispenseHandler (new KitkatDispenseHandler (null))))));
    }

    public DispenseHandler getFirstHandler() {
        return firstHandler;
    }
}
