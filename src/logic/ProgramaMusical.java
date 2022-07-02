package logic;

import java.util.ArrayList;

public class ProgramaMusical {
     

    private ArrayList<Cancion> canciones;

    public ProgramaMusical() {
        canciones = new ArrayList<Cancion>();

    }

    public ProgramaMusical(ArrayList<Cancion> canciones) {
        this.canciones = canciones;

    }

    //Se emplea la sobrecarga de métodos
    public void agregarCancion(int id,boolean extranjero, int tDuracion, String autor, int annoC) {
        Cancion cancion = new CRock(canciones.size()+1,extranjero, tDuracion, autor, annoC);
        
        canciones.add(cancion);

    }

    public void agregarCancion(int id,char sexoI, int tDuracion, String autor, int annoC) {
        Cancion cancion = new CPop(canciones.size()+1,sexoI, tDuracion, autor, annoC);
       
        canciones.add(cancion);
    }

    public void agregarCancion(int id,String tInterprete, int tDuracion, String autor, int annoC) {
        Cancion cancion = new CSalsa(canciones.size()+1,tInterprete, tDuracion, autor, annoC);
         
        canciones.add(cancion);

    }

    public void removerCancion(int pos) {
        canciones.remove(pos);
        
    }

    public String MostrarCMasLarga() {
        int pos = 0;
        double mayor = 0;
        int tiempo;

        for (int i = 0; i < canciones.size(); i++) {
            tiempo = canciones.get(i).gettDuracion();
            if (tiempo > mayor) {
                mayor = tiempo;
                pos = i;

            }
        }
        return canciones.get(pos).toString();

    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public int CancionesIMujeres() {
        int cant = 0;
        ArrayList<CPop> cancionM = new ArrayList<>();
        for (int i = 0; i < canciones.size(); i++) {
            if (canciones.get(i) instanceof CPop) {
                cancionM.add((CPop) canciones.get(i));

            }

        }
        for (int i = 0; i < cancionM.size(); i++) {
            if (cancionM.get(i).getSexoI() == 'F') {
                cant++;
            }

        }
        

        return cant;

    }

    public String DatosCRockMayorAceptacion() {
        int pos = 0;
        int mayor = 0;
        int mAceptacion;
        ArrayList<CRock> cancionesRock = new ArrayList<>();

        for (int i = 0; i < canciones.size(); i++) {
            if (canciones.get(i) instanceof CRock) {
                cancionesRock.add((CRock) canciones.get(i));

            }

        }
        for (int i = 0; i < cancionesRock.size(); i++) {
            mAceptacion = cancionesRock.get(i).NivAceptacion();
            if (mAceptacion > mayor) {
                mayor = mAceptacion;
                pos = i;
            }

        }
        return cancionesRock.get(pos).toString();

    }

    public int SumarTiempo() {
        int suma = 0;
        for (int i = 0; i < canciones.size(); i++) {
            suma += canciones.get(i).gettDuracion();
        }
        return suma;
    }

    

}
