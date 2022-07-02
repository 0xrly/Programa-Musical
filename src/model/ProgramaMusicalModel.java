package model;

import logic.Cancion;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sun.swing.FilePane;

/**
 *
 * @author Username
 */
public class ProgramaMusicalModel {

    public static void guardarCancion(ArrayList<Cancion> cancion)  {
        try {
            File f = new File("src/doc/fichero.txt");
            if (f.isFile()) {
                f.delete();
            }
            ObjectOutputStream guardar = new ObjectOutputStream(new FileOutputStream("src/doc/fichero.txt", true));
            guardar.writeObject(cancion);
            guardar.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Se ha producido un error a la hora de guardar cambios", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static ArrayList<Cancion> getCancionGuardada() {
        ArrayList<Cancion> canciones= null;
        
        try {
            ObjectInputStream obtener = new ObjectInputStream(new FileInputStream(("src/doc/fichero.txt")));
            canciones = (ArrayList<Cancion>) obtener.readObject();
            obtener.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace(System.out);
         JOptionPane.showMessageDialog(null, "Se ha producido un error a la hora de obtener la canción", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return canciones;
    }

}