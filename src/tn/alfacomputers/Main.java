package tn.alfacomputers;
import tn.alfacomputers.kernel.Accordion;
import tn.alfacomputers.kernel.Flute;
import tn.alfacomputers.kernel.Guitar;
import tn.alfacomputers.kernel.IInstrument;

public class Main {

    public static void main(String[] args) {
	   //IInstrument randomInstrument=new Guitar();
		IInstrument randomInstrument=new Flute();
	   playMelody(randomInstrument);
    }

    static void  playMelody(IInstrument instrument){
    	instrument.play("do");
	}
}
