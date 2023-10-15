
import java.util.Scanner;

public class Yolcu {

    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu() {
        Scanner input = new Scanner(System.in);
        System.out.print("yatirdiginiz harc bedeli: ");
        harc = input.nextInt();

        System.out.println("herhangi bir siyasi yasaginiz bulunuyor mu? (evet/hayir yaziniz.)");
        String cevap1 = input.next();

        if (cevap1.equals("evet")) {
            siyasiYasak = true;

        } else if (cevap1.equals("hayir")) {
            siyasiYasak = false;

        } else {
            System.out.println("evet veya hayir disinde bir sey yazdiniz. Sistem kapatiliyor.");
            return;
        }

        System.out.println("vizeniz var mi? (evet/hayir yaziniz.)");
        String cevap2 = input.next();

        if (cevap2.equals("evet")) {
            vizeDurumu = true;

        } 
        else if (cevap2.equals("hayir")) {
            vizeDurumu = false;

        } 
        else {
            System.out.println("evet veya hayir disinde bir sey yazdiniz. Sistem kapatiliyor.");
            return;
        }
    }

    public void HarcKontrol() throws HarcException{
        if (harc < 150) {
            throw new HarcException();
        } 
        else {
            System.out.println("yurt disi harc islemi tamamdir.");
        }
    }

    public void siyasiYasakKontrol() throws SiyasiException{
        if (siyasiYasak == true) {
            throw new SiyasiException();
        } 
        else {
            System.out.println("siyasi yasaginiz yoktur.");
        }
    }

    public void vizeDurumuKontrol() throws VizeException{
        if(vizeDurumu == false){
        throw new VizeException();
        
        }else{
        System.out.println("vizeniz mevcuttur.");
        }
            
            }

}
