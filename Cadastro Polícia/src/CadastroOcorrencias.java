
import javax.swing.JOptionPane;

public class CadastroOcorrencias {
    
    
    String[] data = new String[100];
    String[] periodo = new String[100];
    String[] tipo = new String[100];
    String[] descricao = new String[100];
    String[] regiao = new String[100];
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
        
        //Ocorrências
        String ocorrencias = "";
        int assalto = 0; int homicidio = 0; int paz =0; int roubo =0; int td =0; int vd =0; 
        int maiorOcorrencia = 0;
        
        //Período
        String periodoA = "";
        int manha = 0;
        int tarde = 0;
        int noite = 0;
        int madrugada = 0;
        int maiorPeriodo = 0;
        
        //Região
        String regiaoA = "";
        int norte = 0;
        int sul = 0;
        int leste = 0;
        int oeste = 0;
        int centro = 0;
        int maiorRegiao = 0;
        
        
        
        for(int i = 0; i < atual; i++){
            
            //Quantidade de cada crime
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
            
            //Maior indice de criminalidade
            if(assalto > maiorOcorrencia){
                maiorOcorrencia = assalto;
                ocorrencias = "Assalto";
            }else if (assalto == maiorOcorrencia){
                ocorrencias = ocorrencias + ", Assalto";                
            }else if(homicidio > maiorOcorrencia){
                maiorOcorrencia = homicidio;
                ocorrencias = "Homicídio";
            }else if (homicidio == maiorOcorrencia){
                ocorrencias = ocorrencias + ", Homicídio";
            }else if(paz > maiorOcorrencia){
                maiorOcorrencia = paz;
                ocorrencias = "Pertubação da Paz";
            }else if (paz == maiorOcorrencia){
                ocorrencias = ocorrencias + ", Perturbação da Paz";
            }else if(td > maiorOcorrencia){
                maiorOcorrencia = td;
                ocorrencias = "Tráfico de Drogas";
            }else if (td == maiorOcorrencia){
                ocorrencias = ocorrencias + ", Tráfico de Drogas";
            }else if(vd > maiorOcorrencia){
                maiorOcorrencia = vd;
                ocorrencias = "Violência Doméstica";
            }else if (vd == maiorOcorrencia){
                ocorrencias = ocorrencias + ", Violência Doméstica";
            }
            
            //Quantidade de Períodos
            if(periodo[atual].equals("Manhã")){
                manha++;
            }else if(periodo[atual].equals("Tarde")){
                tarde++;
            }else if(periodo[atual].equals("Noite")){
                noite++;
            }else if(periodo[atual].equals("Madrugada")){
                madrugada++;
            }
            
            //Maior periodo
            if(manha > maiorPeriodo){
                maiorPeriodo = manha; 
                periodoA = "Manhã";
	    }else if (manha == maiorPeriodo){
		periodoA = periodoA + ", Manhã";
            }else if(tarde > maiorPeriodo){
                maiorPeriodo = tarde;
                periodoA = "Tarde";
	    }else if (tarde == maiorPeriodo){
		periodoA = periodoA + ", Tarde";
            }else if(noite > maiorPeriodo){
                maiorPeriodo = noite;
                periodoA = "Noite";
	    }else if (noite == maiorPeriodo){
		periodoA = periodoA + ", Noite";
            }else if(madrugada > maiorPeriodo){
                maiorPeriodo = madrugada;
                periodoA = "Madrugada";
	    }else if (madrugada == maiorPeriodo){
		periodoA = periodoA + ", Madrugada";
            }
            
            //Quantidade região
            if(regiao[atual].equals("Norte")){
                norte ++;  
            }else if(regiao[atual].equals("Sul")){
                sul ++;    
            }else if(regiao[atual].equals("Leste")){
                leste++;
            }else if(regiao[atual].equals("Oeste")){
                oeste++;
            }else if(regiao[atual].equals("Centro")){
                centro++;
            }         
            
            //Maior região
            if(norte > maiorRegiao){
                maiorRegiao = norte;
                regiaoA = "Norte";
                           
            }else if(norte == maiorRegiao){
                regiaoA = regiaoA + ", Norte";             
                
            }else if (sul > maiorRegiao){
                maiorRegiao = sul;
                regiaoA = "Sul";
                
            }else if(sul == maiorRegiao){
                regiaoA = regiaoA + ", Sul";
                        
            }else if (leste > maiorRegiao){
                maiorRegiao = leste;
                regiaoA = "Leste";
                
            }else if(leste == maiorRegiao){
                regiaoA = regiaoA + ", Leste";
                
            }else if (oeste > maiorRegiao){
                maiorRegiao = oeste;
                regiaoA = "Oeste";
                
            }else if(oeste == maiorRegiao){
                regiaoA = regiaoA + ", Oeste";
                        
            }else if (centro > maiorRegiao){
                maiorRegiao = centro;
                regiaoA = "Centro";
                
            }else if(norte == maiorRegiao){
                regiaoA = regiaoA + ", Centro";
                
            }
            
        }
        
        JOptionPane.showMessageDialog(null, "Dados da Ocorrências"
         + "\nRegião(ões) com maior registro de ocorrências: " + regiaoA
         + "\nPeríodo(s) com maior registro de ocorrências: " + periodoA
         + "\nTipo(s) mais frequente de ocorrências: " + ocorrencias); 
        
    }
    
    public void solicitarInformacoes(int posicao){
        
        data[posicao] = JOptionPane.showInputDialog(null, "Data da ocorrência:", "OCORRÊNCIAS");
        periodo[posicao] = JOptionPane.showInputDialog(null, "Período", null,
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
        regiao[posicao] = JOptionPane.showInputDialog(null, "Selecione a região: ", null,
                JOptionPane.QUESTION_MESSAGE,
                null, new Object[]{
                    "", "Norte", "Sul", "Oeste", "Leste", "Centro"
                },
                ""
        ).toString();
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
        + "\nRegião:" + regiao[posicao]
        + "\nEndereço:" + endereco[posicao]
        + "\nDelegacia:");
    }
   
        
        
        
    
        
    
        
    

}
