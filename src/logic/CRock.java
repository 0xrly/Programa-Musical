
package logic;


public class CRock extends Cancion {
    private boolean extranjero;

    public CRock(int id,boolean extranjero, int tDuracion, String autor, int annoC) {
        super(id,tDuracion, autor, annoC);
        this.extranjero = extranjero;
    }

    public boolean isExtranjero() {
        return extranjero;
    }

    public void setExtranjero(boolean extranjero) {
        this.extranjero = extranjero;
    }

    

   
    
    @Override
    public int NivAceptacion(){
       return  isExtranjero() ?  (annoC * 10) + 200 : (annoC * 10) +100;
    }

    @Override
    public String toString() {
        
        String isextranjero = isExtranjero() ? "Si" : "No";
        return super.toString() + "\nEs extranjero?: "+ isextranjero;
                
    }
    
}
