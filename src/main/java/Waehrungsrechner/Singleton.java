package Waehrungsrechner;

public class Singleton {

    private static UndoRedo ur = null;

    private Singleton(){

    }

    public static UndoRedo getInstance(){
        if(ur == null){
            ur = new UndoRedo();
        }
        return ur;
    }
}
