/* Nombre: Mario Pablo Bustos Sanchez
 * Carrera: Analista Programador Computacional
 * Semestre: 2º
 * Numero de telefono: +56965340835
 * Correo Duoc: ma.bustoss@alumnos.duoc.cl
 * Correo per: pabloasd3@gmail.com
 */

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal {

    ArrayList<Integer> mensaje;

    public Principal() {
        this.mensaje = new ArrayList<>();
    }

    public void llenarMensaje() {
        mensaje.add(0, 72);
        mensaje.add(1, 111);
        mensaje.add(2, 108);
        mensaje.add(3, 97);
        mensaje.add(4, 32);
        mensaje.add(5, 77);
        mensaje.add(6, 117);
        mensaje.add(7, 110);
        mensaje.add(8, 100);
        mensaje.add(9, 111);
        mensaje.add(10, 33);
    }

    public String devolverMensaje() {

        String cadena = "";
        for (int caracter : mensaje) {
            char c;
            c = (char) caracter;
            cadena = cadena + c;
        }
        return cadena;
    }

    public static void main(String[] args) {

        Principal hola;
        hola = new Principal();

        hola.llenarMensaje();
        JOptionPane.showMessageDialog(null, hola.devolverMensaje());
    }

}
