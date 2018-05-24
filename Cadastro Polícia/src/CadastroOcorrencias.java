
import javax.swing.JOptionPane;

public class CadastroOcorrencias {
    
    
    String[] data = new String[100];
    String[] periodo = new String[100];
    String[] tipo = new String[100];
    String[] descricao = new String[100];
    String[] bairro = new String[100];
    String[] endereco = new String[100];
    String[] delegacias = new String[100];
    int[] boletim = new int[100];

    int atual = 0;
   
    
    public void cadastrarOcorrencia(){
        solicitarInformacoes(atual);
        atual++;
        
    }
        
    public void listar(){
        int busca = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite o código do B.O para buscar"));
        for(int i = 0; i < atual; i++){
            if(boletim[i]==busca){
                apresentarInformacoes(i);       
            }
    }
    
    }
    
    public void editar(){
        int editar = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite o código do B.O que dejesa editar:"));
        for(int i = 0; i < atual; i++){
            if(boletim[atual]==editar){
                solicitarInformacoes(i);
            }
        }
    }
    
    public void estatistica(){
        String maiorOcorrencias = "";   int assalto = 0; int homicidio = 0; int paz =0; int roubo =0; int td =0; int vd =0; 
        String maiorPeriodo = "";      
        String maiorRegiao = "";        
        
        for(int i = 0; i < atual; i++){
            if(tipo[atual].equals("Assalto")){
                assalto ++;
                
            }else if(tipo[atual].equals("Homicídio")){
                homicidio ++;
                    
            }else if(tipo[atual].equals("Pertubação da Paz")){
                paz++;
                
            }else if(tipo[atual].equals("Trafico de Drogas")){
                td++;
            }else if(tipo[atual].equals("Violência Doméstica")){
                vd++;
            }         
            
            
            
            
            
        }
        
        
    }
    
    public void solicitarInformacoes(int posicao){
        
        data[posicao] = JOptionPane.showInputDialog(null, "Data da ocorrência:", "OCORRÊNCIAS");
        periodo[posicao] = JOptionPane.showInputDialog(null, "Período", "OCORRENCIAS",
                JOptionPane.QUESTION_MESSAGE,
                null, new Object[]{
                    "", "Manhã", "Tarde", "Noite", "Madrugada"
                },
                ""
        ).toString();
        tipo[posicao] = JOptionPane.showInputDialog(null, "Classificação", "OCORRÊNCIAS",
                JOptionPane.QUESTION_MESSAGE,
                null, new Object[]{
                    "", "Assalto", "Homicídio","Pertubação da Paz", "Roubo", "Tráfico de Drogas", 
                    "Violência Doméstica", 
                },
                ""
        ).toString();
        descricao[posicao] = JOptionPane.showInputDialog("Descrição dos fatos: ");
        bairro[posicao] = JOptionPane.showInputDialog("Bairro: ");
        endereco[posicao] = JOptionPane.showInputDialog("Endereço: ");
        delegacias[posicao] = JOptionPane.showInputDialog("Delegacia: ");
        boletim[posicao] = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite o código do boletim de ocorrência:"));
        
        Object[] delegaciasObject = new Object[CadastroDelegacias.atual];
        
        for (int posicaoAux = 0; posicaoAux < CadastroDelegacias.atual; posicaoAux++){
            delegaciasObject[posicaoAux] = CadastroDelegacias.nomes[posicaoAux];
        }
        
        delegacias[posicao] = JOptionPane.showInputDialog(null,
                "Selecione a delegacia de vinculação:",
                "VIATURAS",
                JOptionPane.QUESTION_MESSAGE,
                null,
                delegaciasObject, null).toString();
     
    }
    
    public void apresentarInformacoes(int posicao){
        JOptionPane.showMessageDialog(null, "Informações sobre a Ocorrência: "
        + "\nData da Ocorrência:" + data[posicao]
        + "\nPeríodo: " + periodo[posicao]
        + "\nClassificação:" + tipo[posicao]
        + "\nDescrição:" + descricao[posicao]
        + "\nBairro:" + bairro[posicao]
        + "\nEndereço:" + endereco[posicao]
        + "\nDelegacia:");
    }
   
        
        
        
    
        
    
        
    

}
