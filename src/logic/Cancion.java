
package logic;

import java.io.Serializable;


public  abstract class Cancion implements Serializable {
    protected int tDuracion;
    protected String autor;
    protected int annoC;
    protected int id;
    

  

        public Cancion(int id,int tDuracion, String autor, int annoC) {
        this.tDuracion = tDuracion;
        this.autor = autor;
        this.annoC = annoC;
        this.id = id;
        
        
    }

    public int gettDuracion() {
        return tDuracion;
    }

    public void settDuracion(int tDuracion) {
        this.tDuracion = tDuracion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnnoC() {
        return annoC;
    }

    public void setAnnoC(int annoC) {
        this.annoC = annoC;
    }
    
    public abstract int NivAceptacion();
      
    

    @Override
    public String toString() {
        return  "Tiempo de Duracion= " + tDuracion + "\nAutor= " + autor + "\nAnno de Creacion= " + annoC + "\n";
    }
      public int getId() {
        return id;
    }
}
