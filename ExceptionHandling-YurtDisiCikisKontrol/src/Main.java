
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Yolcu yolcu = new Yolcu();

        boolean cikis = false;

        while (!cikis) {

            try {
                yolcu.HarcKontrol();
            } catch (HarcException x) {
                x.printStackTrace();
                break;
            }

            try {
                yolcu.vizeDurumuKontrol();
            } catch (VizeException x) {
                x.printStackTrace();
                break;
            }

            try {
                yolcu.siyasiYasakKontrol();
            } catch (SiyasiException x) {
                x.printStackTrace();
                break;
            }

            System.out.println("YURT DISINA CIKABILIRSINIZ, KEYIFLI YOLCULUKAR.");
            cikis = true;
        }

    }
}
