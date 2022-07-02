
package logic;


public class CPop extends Cancion{
    private char sexoI;

    public CPop(int id,char sexoI, int tDuracion, String autor, int annoC) {
        super(id,tDuracion, autor, annoC);
        this.sexoI = sexoI;
    }

    public char getSexoI() {
        return sexoI;
    }

    public void setSexoI(char sexoI) {
        this.sexoI = sexoI;
    }
    
    @Override
    public int NivAceptacion(){
        return (annoC * 10);
    }

    @Override
    public String toString() {
        return super.toString() + "\nSexo Interprete: "+ sexoI;
    }
    
}
