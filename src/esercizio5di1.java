import javax.swing.*;
public class esercizio5di1 {
    public static int moltiplicazione(int a, int b){
        a++;
        b++;
        return a * b;
    };
    public static void main(String[] args) {
        String numeroString = JOptionPane.showInputDialog(null, "inserire il primo numero");
        int a = Integer.parseInt(numeroString);

        String numeroString2 = JOptionPane.showInputDialog(null, "inserire il secondo numero");
        int b = Integer.parseInt(numeroString2);

        int risultato = moltiplicazione(a, b);
        String mensaje = "Il risultato della moltiplicazione aumentato di uno è di " + risultato;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
