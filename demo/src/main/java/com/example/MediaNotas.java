package demo.src.main.java.com.example;

import javax.swing.JOptionPane;

public class MediaNotas {
        public void calcularMedia(){
            double media, num1, num2, num3;
            num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
            num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
            num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
            media = num1 + num2 + num3 / 3;
            JOptionPane.showMessageDialog(null, "A média é: " + media);
    }
}