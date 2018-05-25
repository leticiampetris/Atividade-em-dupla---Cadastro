
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Agentes {
    
    CadastroAgentes cadastroAgentes = new CadastroAgentes();
    
    public void menuAgentes(){
        int opcao = JOptionPane.showOptionDialog(null, 
                "Selecione a opção desejada:", "AGENTES", 
                0,
                JOptionPane.QUESTION_MESSAGE,
                new ImageIcon(Menu.class.getResource("imagens/security.png")),
                new Object[]{
                    "Cadastrar", "Editar", "Listar"
                },null            
        );
        
        while(opcao < 3 && opcao!= JOptionPane.CLOSED_OPTION){
            
            switch(opcao){
                case 0: cadastroAgentes.cadastrarAgente();
                    break;
                case 1: cadastroAgentes.editarAgente();
                    break;
                case 2: cadastroAgentes.listarAgentes();
                    break;
                default: 
                    JOptionPane.showMessageDialog(null, "Sistema Ecerrado");
            }
            
            opcao = JOptionPane.showOptionDialog(null, 
                "Selecione a opção desejada", "AGENTES", 
                0,
                JOptionPane.QUESTION_MESSAGE,
                new ImageIcon(Menu.class.getResource("imagens/security.png")),
                new Object[]{
                    "Cadastrar", "Editar", "Listar"
                },null            
        );
            
        }
        
    }        
    }
    


