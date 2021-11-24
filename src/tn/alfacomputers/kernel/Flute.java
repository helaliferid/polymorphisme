package tn.alfacomputers.kernel;

public class Flute implements IInstrument{
    @Override
    public void play(String note) {
        System.out.println("play note in Flute mode ");
    }
}
