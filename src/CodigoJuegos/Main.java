package CodigoJuegos;

import CodigoJuegos.RompeLadrillos.raqueta;
import CodigoJuegos.Tractor.Tractor.Principal;

import javax.swing.*;

public class Main {

     boolean salir = false;
        int opcion = 0;
        String s = "si";
        String n = "no";
            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(" Introduce la opción que desee "));
                switch (opcion) {
                    case 1:
                        JOptionPane.showMessageDialog(null, " Has seleccionado la opción 1 ");

                    case 2:
                        JOptionPane.showMessageDialog(null, " Has seleccionado la opción 2 ");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, " Has seleccionado la opción 3 ");
                        Principal.PrimerMinijuego();
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, " FIN DEL MINIJUEGO ");
                        System.exit(0);
                        salir = true;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, " Solo números entre el 1 y el 4 ");
                }
            } while (salir=false);
        }

