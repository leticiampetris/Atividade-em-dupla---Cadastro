/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro.polícia;

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
                case 1: break;                    
                case 2: break;                    
                case 3: break;                    
                default:
                    JOptionPane.showMessageDialog(null, "Sistema encerrado.");
                }
            }
}
