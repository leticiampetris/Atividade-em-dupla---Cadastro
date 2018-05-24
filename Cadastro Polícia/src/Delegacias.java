
import javax.swing.JOptionPane;

/**
 *
 * @author Leticia
 */
public class Delegacias {

    public void menuDelegacia() {

        CadastroDelegacias registroDelegacias = new CadastroDelegacias();

        int menuDelegacias = JOptionPane.showOptionDialog(null,
                "Selecione a opção desejada:", "DELEGACIAS", 0,
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{
                    "Cadastrar",
                    "Editar",
                    "Listar",
                    "Estatísticas"}, null);

        while (menuDelegacias != JOptionPane.CLOSED_OPTION && menuDelegacias < 4) {
            switch (menuDelegacias) {
                case 0:
                    registroDelegacias.cadastrar();
                    break;
                case 1:
                    registroDelegacias.editar();
                    break;
                case 2:
                    registroDelegacias.listar();
                    break;
                case 3:
                    registroDelegacias.estatistica();
                    break;
                
            }
            
            menuDelegacias = JOptionPane.showOptionDialog(null,
                "Selecione a opção desejada:", "DELEGACIAS", 0,
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{
                    "Cadastrar",
                    "Editar",
                    "Listar",
                    "Estatística"}, null);
        }
    }

    public static void main(String[] args) {
        new Delegacias().menuDelegacia();

    }
}
