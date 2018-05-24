
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
    static String[] delegacias = new String[100];
    static int atual = 0;

    public void solicitarInformacao(int posicao) {

        tipos[posicao] = JOptionPane.showInputDialog(null,
                "Selecione o tipo de viatura:",
                null,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{
                    "Automóvel", "Motocicleta"}, null).toString();
        marcas[posicao] = JOptionPane.showInputDialog("Digite a marca:");
        modelos[posicao] = JOptionPane.showInputDialog("Digite o modelo:");
        anos[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano:"));
        placas[posicao] = JOptionPane.showInputDialog("Digite a placa:")
                            .toUpperCase().replace("-", "").trim();
        licenciamentos[posicao] = JOptionPane.showInputDialog(
                            "Digite a data do próximo licenciamento:");
        
        Object[] delegaciasObject = new Object[CadastroDelegacias.atual];
        for (int posicaoAux = 0; posicaoAux < CadastroDelegacias.atual; posicaoAux++){
            delegaciasObject[posicaoAux] = CadastroDelegacias.nomes[posicaoAux];
        }
        
        delegacias[posicao] = JOptionPane.showInputDialog(null,
                "Selecione a delegacia de vinculação:",
                null,
                JOptionPane.QUESTION_MESSAGE,
                null,
                delegaciasObject, null).toString();
    }

    public void cadastrar() {
        solicitarInformacao(atual);
        atual++;
    }

    public void editar() {

        String busca = JOptionPane.showInputDialog("Digite a placa para editar a viatura:")
                .trim().toUpperCase().replace("-", "");
        for (int posicao = 0; posicao < atual; posicao++) {
            if (placas[posicao].equals(busca)) {
                solicitarInformacao(posicao);
                return;
            }

        }
    }

    public void listar() {

        String texto = "";
        for (int i = 0; i < atual; i++) {
            texto += placas[i] + "   " + tipos[i] + "   " + modelos[i] +
                    "   " + anos[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

}
