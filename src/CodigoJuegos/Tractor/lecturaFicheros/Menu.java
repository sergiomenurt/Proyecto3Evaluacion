package CodigoJuegos.Tractor.lecturaFicheros;

import CodigoJuegos.Tractor.Tractor.Principal;



import javax.swing.*;

public class Menu {
    boolean salir = false;
    int opcion = 0;
    String s = "si";
    String n = "no";

    public void Menu(){
        JOptionPane.showMessageDialog(null, " El menú tiene 2 opciones : " + " La primera es para el minijuego correspondiente y" +
                " la segunda opción es para salir del juego " + "\n" + "\n" + " Opción 1" + "\n" + "Opción 2 ");
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(" Introduce la opción que desee "));


            switch (opcion) {

                case 1:
                    JOptionPane.showMessageDialog(null, " Has seleccionado la opción 1 ");
                    Principal.PrimerMinijuego();
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, " FIN DEL MINIJUEGO ");
                    salir = true;
                    System.exit(0);
                    break;

                case 3:

                    break;


                default:
                    JOptionPane.showMessageDialog(null, " Solo números entre el 1 y el 3 ");
            }

        } while (salir ==false);
    }
}