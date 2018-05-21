
import javax.swing.JOptionPane;


public class Agentes {

    String[] nomes = new String[100];
    String[] sexos = new String[100];
    String[] patentes = new String[100];
    String[] cpfs = new String[100];
    String[] rgs = new String[100];
    String[] nascimentos = new String[100];
    String[] bairros = new String[100];
    String[] ruas = new String[100];
    String[] numeros = new String[100];
    String[] ceps = new String[100];
    String[] complementos = new String[100];
    String[] admissao = new String[100];
    int atual = 0;
    
    
    
    public void cadastrarAgentes(){
    
    nomes[atual] = JOptionPane.showInputDialog(null, "Nome do Agente: ", "CADASTRAR AGENTE");
    sexos[atual] = JOptionPane.showInputDialog(null, "Sexo", "CADASTRAR AGENTE"
    ,JOptionPane.QUESTION_MESSAGE, null, new Object[]{
        "", "Masculino", "Feminino"
        },
        ""
        ).toString();
    patentes[atual] = JOptionPane.showInputDialog(null, nomes[atual], " qual a sua patente:");
    cpfs[atual] = JOptionPane.showInputDialog(null, nomes[atual], " o seu CPF por favor:");
    
        
    
    
    
    
            
            
            
            
            
            
            
            
            
}
