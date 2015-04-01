import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int n;
        if(System.getProperty("user.language").equalsIgnoreCase("pl")){
            n = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbe"));
        }else{
            n = Integer.parseInt(JOptionPane.showInputDialog("Write your number"));
        }
        int kroki = 0;

        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3;
                n = n + 1;
            }
            kroki++;
        }
        System.out.println(kroki);
    }
}
