import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int n;
        if(System.getProperty("user.language").equalsIgnoreCase("pl")){
            n=Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbe"));
        }else{
            n=Integer.parseInt(JOptionPane.showInputDialog("Write your number"));
        }
        int kroki=0, x=n;

        while(n>1){
            if(n%2==0){
                n=n/2;
            }else{
                n=n*3; n=n+1;
            }
            kroki++;
        }
        String toShow;
        if(System.getProperty("user.language").equalsIgnoreCase("pl")){
            toShow = "Liczba krokow potrzebna aby osiagnac 1: "+String.valueOf(kroki)+" przy uzyciu liczby: "+x;
        }else{
            toShow = "It takes: "+String.valueOf(kroki)+" steps to reach 1 using number: "+x;
        }

        JOptionPane.showMessageDialog(null, toShow);

    }
}
