
import javax.swing.JOptionPane;


public class CadastroAgentes {
    
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
    String[] delegacias = new String[100];
    
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
    
    public void editarAgente(){
        String editar = JOptionPane.showInputDialog("Digite o nome para busca");
        for(int i = 0; i < atual; i++){
            if(nomes[atual].equalsIgnoreCase(editar)){
                solicitarInformacao(atual);
                return;
                
            }}}
    
    public void solicitarInformacao(int posicao){
        nomes[posicao] = JOptionPane.showInputDialog(
            "Nome do Agente: ").trim();
    sexos[posicao] = JOptionPane.showInputDialog(null, 
            "Sexo", null
    ,JOptionPane.QUESTION_MESSAGE, null, new Object[]{
        "", "Masculino", "Feminino"
        },
        ""
        ).toString();
    patentes[posicao] = JOptionPane.showInputDialog("Patente:").trim();
    cpfs[posicao] = JOptionPane.showInputDialog("CPF do Agente:")
            .replace(".", "")
            .replace("-", "")
            .replace("/", "").trim();
    rgs[posicao] = JOptionPane.showInputDialog("RG do Agente:")
            .replace(".", "")
            .replace("/", "")
            .replace("-", "").trim();
    nascimentos[posicao] = JOptionPane.showInputDialog("Data de nascimento:")
            .replace("/", "")
            .replace(".", "")
            .replace("-", "").trim();
    bairros[posicao] = JOptionPane.showInputDialog("Bairro:").trim();
    ruas[posicao] = JOptionPane.showInputDialog(null, "Logradouro:").trim();
    numeros[posicao]= JOptionPane.showInputDialog(null,"Nº:").trim();
    ceps[posicao] = JOptionPane.showInputDialog(null, "CEP:").trim();
    complementos[posicao] = JOptionPane.showInputDialog(null, "Complemento:");
    admissoes[posicao] = JOptionPane.showInputDialog(null, "Data de admissão:")
            .replace("/", "")
            .replace(".", "")
            .replace("-", "").trim();
    
    Object[] delegaciasObject = new Object[CadastroDelegacias.atual];
    
    for(int posicaoAux = 0; posicaoAux < CadastroDelegacias.atual; posicaoAux++){
            delegaciasObject[posicaoAux] = CadastroDelegacias.nomes[posicaoAux];
        }
        
        delegacias[posicao] = JOptionPane.showInputDialog(null,
                "Selecione a delegacia de vinculação:",
                "AGENTES",
                JOptionPane.QUESTION_MESSAGE,
                null,
                delegaciasObject, null).toString();
    
        
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
