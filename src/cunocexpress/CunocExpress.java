
package cunocexpress;

import SQL.ManejoReportes;
import SQL.RegistroPaquete;
import UI.Login;

/**
 *
 * @author Gamcas
 */
public class CunocExpress {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login login=new Login();
        login.setVisible(true);
        ManejoReportes.main();
    }
}
