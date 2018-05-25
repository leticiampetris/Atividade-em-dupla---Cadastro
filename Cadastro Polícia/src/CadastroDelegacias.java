
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Leticia
 */
public class CadastroDelegacias {

    static String[] nomes = new String[100];
    String[] ruas = new String[100];
    String[] numeros = new String[100];
    String[] complementos = new String[100];
    String[] bairros = new String[100];
    String[] ceps = new String[100];
    String[] telefones = new String[100];
    String[] horarios = new String[100];
    String[] delegados = new String[100];
    String[] datas = new String[100];
    String[] areas = new String[100];
    static int atual = 0;

    public void solicitarInformacao(int posicao) {
        
        nomes[posicao] = JOptionPane.showInputDialog("Digite o nome da delegacia:").trim();
        ruas[posicao] = JOptionPane.showInputDialog("Digite o logradouro:").trim();
        numeros[posicao] = JOptionPane.showInputDialog("Digite o número do imóvel:").trim();
        complementos[posicao] = JOptionPane.showInputDialog("Digite o complemento:").trim();
        bairros[posicao] = JOptionPane.showInputDialog("Digite o bairro:").trim();
        ceps[posicao] = JOptionPane.showInputDialog("Digite o CEP:")
                .replace("-", "")
                .replace("/", "")
                .replace(".", "").trim();
        telefones[posicao] = JOptionPane.showInputDialog("Digite o telefone:")
                .replace("(", "")
                .replace(")", "")
                .replace("-", "").trim();
        horarios[posicao] = JOptionPane.showInputDialog("Digite o horário de funcionamento:");
        delegados[posicao] = JOptionPane.showInputDialog("Digite o nome do delegado:").trim();
        areas[posicao] = JOptionPane.showInputDialog(null, "Informe a área de abrangência:", null,
                JOptionPane.QUESTION_MESSAGE,
                null, new Object[]{
                    "", "Norte", "Sul", "Leste", "Oeste", "Centro"
                },
                ""
        ).toString();
    }

    public void cadastrar() {
        solicitarInformacao(atual);
        atual++;
    }

    public void editar() {

        String busca = JOptionPane.showInputDialog("Digite parte do nome da delegacia para editar:")
                .trim().replace(".", "");
        
        for (int i = 0; i < atual; i++) {
            if (nomes[i].contains(busca)) {
                solicitarInformacao(i);
            }else{
            JOptionPane.showMessageDialog(null, "!! Delegacia não Cadastrada !!");
            return;    
        } 
    }
    }

    public void listar() {

        String texto = "";
        for (int posicao = 0; posicao < atual; posicao++) {
            texto += nomes[posicao] + " | " + areas[posicao] + "\n";
        }
        JOptionPane.showMessageDialog(null, "Delegacias cadastradas:" +
                "\n\nNome | Área de abrangência" + "\n" + texto);

    }
    
    public void estatistica (){
        
        Object[] delegaciasObject = new Object[atual];
        
        for (int posicao = 0; posicao < atual; posicao++){
            delegaciasObject[posicao] = nomes[posicao];
        }
        
        String selecao = JOptionPane.showInputDialog(null,
                "Selecione a delegacia:",
                null,
                JOptionPane.QUESTION_MESSAGE,
                null,
                delegaciasObject, null).toString();
        
        int quantidadeAgentes = 0;

        for (int i = 0; i < CadastroAgentes.atual; i++) {
            if (CadastroAgentes.delegacias[i].equals(selecao)) {
                quantidadeAgentes++;
            }
        }
        int quantidadeOcorrencias = 0;

        for (int i = 0; i < CadastroOcorrencias.atual; i++) {
            if (CadastroOcorrencias.delegacias[i].equals(selecao)) {
                quantidadeOcorrencias++;
            }
        }
        int quantidadeViaturas = 0;

        for (int i = 0; i < CadastroViaturas.atual; i++) {
            if (CadastroViaturas.delegacias[i].equals(selecao)){
                quantidadeViaturas++;
            }
        }

        JOptionPane.showMessageDialog(null,
                selecao + " possui:" +
                "\n" + quantidadeAgentes + " agentes." +
                "\n" + quantidadeOcorrencias + " ocorrências." +
                "\n" + quantidadeViaturas + " viaturas.", null,
                JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon(CadastroDelegacias.class.getResource("imagens/reports.png")));
        }
      
    }
