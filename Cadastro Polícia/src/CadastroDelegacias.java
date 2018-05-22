
import javax.swing.JOptionPane;

/**
 *
 * @author Leticia
 */
public class CadastroDelegacias {

    static String[] nomes = new String[100];
    String[] enderecos = new String[100];
    String[] telefones = new String[100];
    String[] horarios = new String[100];
    String[] delegados = new String[100];
    String[] datas = new String[100];
    String[] areas = new String[100];
    static int atual = 0;

    public void solicitarInformacao(int posicao) {

        nomes[posicao] = JOptionPane.showInputDialog("Digite o nome da delegacia:");
        enderecos[posicao] = JOptionPane.showInputDialog("Digite o endereço:");
        telefones[posicao] = JOptionPane.showInputDialog("Digite o telefone:");
        horarios[posicao] = JOptionPane.showInputDialog("Digite o horário de funcionamento:");
        delegados[posicao] = JOptionPane.showInputDialog("Digite o nome do delegado:");
        datas[posicao] = JOptionPane.showInputDialog("Digite a data de início do funcionamento:");
        areas[posicao] = JOptionPane.showInputDialog("Informe a área de abrangência:");
    }

    public void cadastrar() {
        solicitarInformacao(atual);
        atual++;
    }

    public void editar() {

        String busca = JOptionPane.showInputDialog("Digite parte do nome da delegacia para editar:")
                .trim().replace(".", "");
        for (int posicao = 0; posicao < atual; posicao++) {
            if (nomes[posicao].contains(busca)) {
                solicitarInformacao(posicao);
                return;
        }
    }
    }

    public void listar() {

        String texto = "";
        for (int posicao = 0; posicao < atual; posicao++) {
            texto += nomes[posicao] + "   " + areas[posicao] + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);

    }

}
