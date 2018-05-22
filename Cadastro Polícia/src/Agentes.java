
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
    String[] delegacias = new String[4];
    
    int atual = 0;
    
    public void cadastrarAgente(){
         solicitarInformacao(atual);
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
                apresentarInformacao(i);
                
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
    
    public void apresentarInformacao(int posicao){
        JOptionPane.showMessageDialog(null, "Informção sobre Agente"
        + "\nNome:" + nomes[posicao]
        + "\nSexo:" + sexos[posicao]
        + "\npatente: " + patentes[posicao]
        + "\nCPF: " + cpfs[posicao]
        + "\nRG: " + rgs[posicao]
        + "\nData Nascimento: " + nascimentos[posicao]
        + "\nBairro: " + bairros [posicao]
        + "\nRua: " + ruas [posicao]
        + "\nCEP: " + ceps [posicao]
        + "\nComplento: " + complementos [posicao]
        + "\nData Admissão: " + admissoes [posicao]);
        
    }
    
     }
    
    
    
    
    
    
        
    
    
    
    
            
            
            
            
            
            
            
            
            
}
