
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
                    "Listar"}, null);

        while (menuDelegacias != JOptionPane.CLOSED_OPTION && menuDelegacias < 3) {
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
                default:
                    JOptionPane.showMessageDialog(null, "Sistema encerrado.");
            }
            
            menuDelegacias = JOptionPane.showOptionDialog(null,
                "Selecione a opção desejada:", "DELEGACIAS", 0,
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{
                    "Cadastrar",
                    "Editar",
                    "Listar"}, null);
        }
    }

    public static void main(String[] args) {
        new Delegacias().menuDelegacia();

    }
}
