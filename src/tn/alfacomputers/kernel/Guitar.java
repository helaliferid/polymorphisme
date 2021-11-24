package tn.alfacomputers.kernel;

public class Guitar implements IInstrument{
    @Override
    public void play(String note) {
        System.out.println("play note in Guitar mode ");
    }
}
