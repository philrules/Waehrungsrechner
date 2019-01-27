package Waehrungsrechner;

import java.util.Stack;

public class UndoRedo {

    protected Stack<UmrechnenCommand> thingsToUndo;
    protected Stack<UmrechnenCommand> betterRedoIt;

    public UndoRedo(){
        thingsToUndo = new Stack<UmrechnenCommand>();
        betterRedoIt = new Stack<UmrechnenCommand>();
    }

    public void execute(UmrechnenCommand uc){
        thingsToUndo.push(uc);
        betterRedoIt.clear();
        uc.execute();
    }

    public void undo(){
        if (!thingsToUndo.isEmpty()){
            UmrechnenCommand uc = thingsToUndo.pop();
            uc.undo();
            betterRedoIt.push(uc);
        }

        else{
            System.out.println("Stack ist leer.");
        }
    }

    public void redo(){
        if (!betterRedoIt.isEmpty()) {
            UmrechnenCommand uc = betterRedoIt.pop();
            uc.execute();
            thingsToUndo.push(uc);
        }
        else{
            System.out.println("Stack ist leer.");
        }
    }
}


