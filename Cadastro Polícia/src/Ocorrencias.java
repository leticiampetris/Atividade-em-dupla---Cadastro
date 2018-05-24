
import javax.swing.JOptionPane;


public class Ocorrencias {
    
    CadastroOcorrencias cadastroOcorrencias = new CadastroOcorrencias();
    
    public void menuOcorrencias(){
        int ocorrencias = JOptionPane.showOptionDialog(null,
                "Selecione a opção desejada", "OCORRÊNCIAS",
                0,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{
                    "Cadastrar", "Editar", "Listar"
                }, null
        );
        
        while(ocorrencias != JOptionPane.CLOSED_OPTION && ocorrencias < 3){
            
            switch(ocorrencias){
                case 0: cadastroOcorrencias.cadastrarOcocrrencia();
                    break;
                case 1: cadastroOcorrencias.editar();
                    break;
                case 2: cadastroOcorrencias.buscar();
                    break;
                default: JOptionPane.showMessageDialog(null, "Sistema Encerrado");
                    }
            ocorrencias = JOptionPane.showOptionDialog(null,
                "Selecione a opção desejada", "OCORRÊNCIAS",
                0,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{
                    "Cadastrar", "Editar", "Listar"
                }, null
        );
            
        }
    }

}
