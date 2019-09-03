package campomonetario;

import javax.swing.JTextField;

public class CampoMonetario {
    public static void main(String[] args) {
        //Exemplo de utilização
        JTextField campoMonetario = new JTextField();
        campoMonetario.setHorizontalAlignment(JTextField.RIGHT);
        campoMonetario.setDocument(new FormatarCampo(7,2));
    }  
}
