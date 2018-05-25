
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Ocorrencias {
    
    CadastroOcorrencias cadastroOcorrencias = new CadastroOcorrencias();
    
    public void menuOcorrencias(){
        int ocorrencias = JOptionPane.showOptionDialog(null,
                "Selecione a opção desejada:", "OCORRÊNCIAS",
                0,
                JOptionPane.QUESTION_MESSAGE,
                new ImageIcon(Menu.class.getResource("imagens/security.png")),
                new Object[]{
                    "Cadastrar", "Editar", "Listar", "Estatística"
                }, null
        );
        
        while(ocorrencias != JOptionPane.CLOSED_OPTION && ocorrencias < 4){
            
            switch(ocorrencias){
                case 0: cadastroOcorrencias.cadastrarOcorrencia();
                    break;
                case 1: cadastroOcorrencias.editar();
                    break;
                case 2: cadastroOcorrencias.listar();
                    break;
                case 3: cadastroOcorrencias.estatistica();
                    break;
                default: JOptionPane.showMessageDialog(null, "Sistema Encerrado");
                    }
            ocorrencias = JOptionPane.showOptionDialog(null,
                "Selecione a opção desejada", "OCORRÊNCIAS",
                0,
                JOptionPane.QUESTION_MESSAGE,
                new ImageIcon(Menu.class.getResource("imagens/security.png")),
                new Object[]{
                    "Cadastrar", "Editar", "Listar"
                }, null
        );
            
        }
    }

}
