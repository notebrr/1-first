public class Controller {
    final static String MSG = "MOMS";

    public static void runController() {
        Dialog dialog = new Dialog();
        View view = new View();

        double getNum = dialog.doDiag();
        double afterVat = CalculateVat.doVAT(getNum);
        view.doView(afterVat,MSG);
    }
}
