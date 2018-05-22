
/**
 *
 * @author Leticia e Gabriel B.
 */

import javax.swing.JOptionPane;

public class Menu {
    
    public void menuPrincipal(){
        int principal = JOptionPane.showOptionDialog(null,
                "Selecione a opção desejada:", "SISTEMA POLICIAL", 0,
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{
                "Agentes",
                "Ocorrências",
                "Viaturas",
                "Delegacias"}
                , null);
        
        
        while (principal < 4) {
            switch (principal) {
                case 0: break;                  
                case 1: break;                    
                case 2: break;                    
                case 3: break;                    
                default:
                    JOptionPane.showMessageDialog(null, "Sistema encerrado.");
            }
           
        }
}
}
