
package cadastro.polícia;

import javax.swing.JOptionPane;

/**
 *
 * @author Leticia
 */
public class CadastroViaturas {

   
    String[] tipos = new String[100];
    String[] marcas = new String[100];
    String[] modelos = new String[100];
    int[] anos = new int[100];
    String[] placas = new String[100];
    String[] licenciamentos = new String[100];
    int[] delegacias = new int[100];
    int atual = 0;
      
    public void solicitarInformacao(int posicao) {

        tipos[posicao] = JOptionPane.showInputDialog(null,
        "Selecione o tipo de viatura:",
        "VIATURAS",
        JOptionPane.QUESTION_MESSAGE,
        null,
        new Object []{
            "Automóvel", "Motocicleta"}, null).toString();
        marcas[posicao] = JOptionPane.showInputDialog("Digite a marca:");
        modelos[posicao] = JOptionPane.showInputDialog("Digite o modelo:");
        anos[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano:"));
        placas[posicao] = JOptionPane.showInputDialog("Digite a placa:");
        licenciamentos[posicao] = JOptionPane.showInputDialog("Digite a data do próximo licenciamento:");
        modelos[posicao] = JOptionPane.showInputDialog("Digite o modelo:");
        delegacias[posicao] = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Selecione a delegacia de vinculação:",
        "VIATURAS",
        JOptionPane.QUESTION_MESSAGE,
        null,
        new Object []{
            "DRP Centro", "DRP Norte", "DRP Sul"}, null).toString());
        }
        
    public void cadastrar(){
        solicitarInformacao(atual);
        atual++;
    }

    public void editar() {

        String busca = JOptionPane.showInputDialog("Digite a placa para editar:")
                       .trim().toUpperCase().replace("-", "");
        for (int i = 0; i < atual; i++) {
            if (placas[i].equals(busca)) {
                solicitarInformacao(i);
                return;
            }

        }
    }
    
    
    public void listar() {

        String texto = "";
        for (int i = 0; i < atual; i++) {
            texto += placas[i] + "   " + tipos[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }
      
}
