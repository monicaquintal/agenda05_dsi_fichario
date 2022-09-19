package forum_dsi_agenda05;

import javax.swing.JOptionPane;

public class Forum_dsi_agenda05 {

    public static void main(String[] args) {
        //declaração de variáveis
        String auxiliar1; //variável auxiliar1
        String auxiliar2; //variável auxiliar2
        int var_a; //primeiro valor inteiro
        int var_b; //segundo valor inteiro
        int resultado;
        
        // entrada de dados salvando na variável auxiliar (string)
    auxiliar1 = JOptionPane.showInputDialog("Entre com um número inteiro A:");
    auxiliar2 = JOptionPane.showInputDialog("Entre com um número inteiro B:");
        
        //conversão do tipo string para inteiro – Integer.parseInt
    var_a = Integer.parseInt(auxiliar1);
    var_b = Integer.parseInt(auxiliar2);
    
        //decisão e processamento
    if (var_a==var_b){
        resultado = var_a + var_b;
        }
        else {
        resultado = var_a * var_b;
        }
 
        //saída de dados
        JOptionPane.showMessageDialog(null,"Considerando que você digitou " + var_a + " e " + var_b + ", o resultado é: " + resultado);

}

}
