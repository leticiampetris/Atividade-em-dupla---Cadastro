
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
    String[] admissoes = new String[100];
    int atual = 0;
    
    
    
    public void cadastrarAgente(){
         nomes[atual] = JOptionPane.showInputDialog(null, 
            "Nome do Agente: ", "CADASTRAR AGENTE");
    sexos[atual] = JOptionPane.showInputDialog(null, 
            "Sexo", "CADASTRAR AGENTE"
    ,JOptionPane.QUESTION_MESSAGE, null, new Object[]{
        "", "Masculino", "Feminino"
        },
        ""
        ).toString();
    patentes[atual] = JOptionPane.showInputDialog(null, 
            nomes[atual], ", digite sua patente:");
    cpfs[atual] = JOptionPane.showInputDialog(null, 
            nomes[atual], ", o seu CPF por favor:")
            .replace(".", "")
            .replace("-", "");
    rgs[atual] = JOptionPane.showInputDialog(null, 
            nomes[atual], ", o seu RG por favor:");
    nascimentos[atual] = JOptionPane.showInputDialog(null, 
            nomes[atual], ", digite a sua data de nascimento:");
    bairros[atual] = JOptionPane.showInputDialog(null, 
            nomes[atual], ", qual o seu CEP:");
    ruas[atual] = JOptionPane.showInputDialog(null, 
            nomes[atual], ", digite o logradouro:");
    numeros[atual]= JOptionPane.showInputDialog(null, 
            nomes[atual], ", o número da sua residência:");
    ceps[atual] = JOptionPane.showInputDialog(null, 
            nomes[atual], ", o CEP por favor:");
    complementos[atual] = JOptionPane.showInputDialog(null, 
            nomes[atual], ", o complemento:");
    admissoes[atual] = JOptionPane.showInputDialog(null, 
            nomes[atual], ", data de admissão:");
        atual++;
    }
    
    public void listarAgentes(){
        String texto = "";
        for(int i = 0; i < atual; i++){
            texto += nomes[i] + " " + patentes[i] + "\n"; 
        }
        
        JOptionPane.showMessageDialog(null, "Agentes Cadastrados" 
                + "\n" + texto);
    }
    
    public void bucarAgentes(){
        String busca = JOptionPane.showInputDialog("Digite o nome parcial para busca:");
        for(int i = 0; i < atual; i++){
            if(nomes[i].contains(busca)){
                
            }
        }
        
    }
    
    public void editarAgente(){
        String editar = JOptionPane.showInputDialog("Digite o nome para busca");
        for(int i = 0; i < atual; i++){
            if(nomes[atual].equalsIgnoreCase(editar)){
                solicitarInformacao(atual);
                return;
                
            }
        
    }
            
    }
    
    public void solicitarInformacao(int posicao){
        nomes[posicao] = JOptionPane.showInputDialog(null, 
            "Nome do Agente: ", "CADASTRAR AGENTE");
    sexos[posicao] = JOptionPane.showInputDialog(null, 
            "Sexo", "CADASTRAR AGENTE"
    ,JOptionPane.QUESTION_MESSAGE, null, new Object[]{
        "", "Masculino", "Feminino"
        },
        ""
        ).toString();
    patentes[posicao] = JOptionPane.showInputDialog(null, 
            nomes[posicao], ", digite sua patente:");
    cpfs[posicao] = JOptionPane.showInputDialog(null, 
            nomes[posicao], ", o seu CPF por favor:")
            .replace(".", "")
            .replace("-", "");
    rgs[posicao] = JOptionPane.showInputDialog(null, 
            nomes[posicao], ", o seu RG por favor:");
    nascimentos[posicao] = JOptionPane.showInputDialog(null, 
            nomes[posicao], ", digite a sua data de nascimento:");
    bairros[posicao] = JOptionPane.showInputDialog(null, 
            nomes[posicao], ", qual o seu CEP:");
    ruas[posicao] = JOptionPane.showInputDialog(null, 
            nomes[posicao], ", digite o logradouro:");
    numeros[posicao]= JOptionPane.showInputDialog(null, 
            nomes[posicao], ", o número da sua residência:");
    ceps[posicao] = JOptionPane.showInputDialog(null, 
            nomes[posicao], ", o CEP por favor:");
    complementos[posicao] = JOptionPane.showInputDialog(null, 
            nomes[posicao], ", o complemento:");
    admissoes[posicao] = JOptionPane.showInputDialog(null, 
            nomes[posicao], ", data de admissão:");
        
    }
    
    
    
    
    
    
        
    
    
    
    
            
            
            
            
            
            
            
            
            
}
