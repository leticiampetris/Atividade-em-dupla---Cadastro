
/**
 *
 * @author Leticia e Gabriel B.
 */

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Menu {
    
    Ocorrencias ocorrencias = new Ocorrencias();
    Agentes agentes = new Agentes();
    Viaturas viaturas = new Viaturas();
    Delegacias delegacias = new Delegacias();
    
    
    public void menuPrincipal(){
        int principal = JOptionPane.showOptionDialog(null,
                "Bem Vindo!! "
              + "\nSelecione a opção desejada:", null, 
                0,
                JOptionPane.INFORMATION_MESSAGE, 
                new ImageIcon(Menu.class.getResource("imagens/security.png")),
                new Object[]{
                "Agentes",
                "Ocorrências",
                "Viaturas",
                "Delegacias"}
                , null);
        
        
        while (principal < 4 && principal != JOptionPane.CLOSED_OPTION) {
            switch (principal) {
                case 0: agentes.menuAgentes();
                    break;                  
                case 1: ocorrencias.menuOcorrencias();
                    break;                    
                case 2: viaturas.menuViatura();
                    break;                    
                case 3: delegacias.menuDelegacia();
                    break;                    
                default:
                    JOptionPane.showMessageDialog(null, "Sistema encerrado.");
            }
           principal = JOptionPane.showOptionDialog(null,
                "Selecione a opção desejada:", "SISTEMA POLICIAL", 0,
                JOptionPane.INFORMATION_MESSAGE, 
                new ImageIcon(Menu.class.getResource("imagens/security.png")),
                new Object[]{
                "Agentes",
                "Ocorrências",
                "Viaturas",
                "Delegacias"}
                , null);
        }
}
}
