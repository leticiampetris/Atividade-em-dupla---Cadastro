/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro.polícia;

/**
 *
 * @author Leticia
 */
public class CadastroViaturas {

    String[] tipos = new String[100];
    String[] marcas = new String[100];
    String[] modelos = new String[100];
    int[] anos = new int[100];
    String[] placas = new String[100];
    String[] licenciamentos = new String[100];
    String[] delegacias = new String[100];
    int atual = 0;
      
    public void solicitarInformacao(){
        
        public void solicitarInformacao(int posicao) {

        tipos[posicao] = 
                
        nomes[posicao] = JOptionPane.showInputDialog("Digite o seu nome");

        idades[posicao] = Integer.parseInt(JOptionPane.showInputDialog(

                nomes[posicao] + " digite a sua idade"));

        sexos[posicao] = JOptionPane.showInputDialog(

                nomes[posicao] + " digite o seu sexo").charAt(0);

        cpfs[posicao] = JOptionPane

                .showInputDialog(nomes[posicao] + " digite o seu CPF")

                .replace(".", "").replace("-", "");

        estados[posicao] = JOptionPane.showInputDialog(

                "Digite o seu estado").trim().toUpperCase();

        cidades[posicao] = JOptionPane.showInputDialog("Digite a sua cidade");

        logradouros[posicao] = JOptionPane.showInputDialog(

                "Digite o seu logradouro");

        bairros[posicao] = JOptionPane.showInputDialog("Digite o seu bairro");

        ceps[posicao] = JOptionPane.showInputDialog("Digite o seu cep");

        numeros[posicao] = JOptionPane.showInputDialog("Digite o seu número");

        complementos[posicao] = JOptionPane.showInputDialog("Digite o complemento");


    }
    
    
    public void cadastrar(){
    
        
        
}
}
