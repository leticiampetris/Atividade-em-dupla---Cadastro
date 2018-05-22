package cadastro.polÃ­cia;

import javax.swing.JOptionPane;

/**
 *
 * @author Leticia
 */
public class Viaturas {
    
    CadastroViaturas registroViaturas = new CadastroViaturas();

    int menuViaturas = JOptionPane.showOptionDialog(null,
                "Selecione a opção desejada:", "VIATURAS", 0,
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{
                "Cadastrar",
                "Editar",
                "Listar"}
                , null);
    
    while (menuViaturas < 3) {
            switch (menuViaturas) {
                case 0: registroViaturas.cadastrar();break;                  
                case 1: registroViaturas.editar();break;                 
                case 2: registroViaturas.listar();break;                
                default:
                    JOptionPane.showMessageDialog(null, "Sistema encerrado.");
                }
            }
}
