
package logic;


public class CSalsa extends Cancion{
    private String tInterprete;

    public CSalsa(int id,String tInterprete, int tDuracion, String autor, int annoC) {
        super(id,tDuracion, autor, annoC);
        this.tInterprete = tInterprete;
    }

    public String gettInterprete() {
        return tInterprete;
    }

    public void settInterprete(String tInterprete) {
        this.tInterprete = tInterprete;
    }
     @Override
    public int NivAceptacion(){
        return (annoC * 10);
    }

    @Override
    public String toString() {
        return super.toString() + "\n Tipo de Interprete: "+ tInterprete;
    }
    
}
