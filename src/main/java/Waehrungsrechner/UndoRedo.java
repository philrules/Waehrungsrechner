package Waehrungsrechner;

import java.util.Stack;

public class UndoRedo {

    private Stack<Double> undo;
    private Stack<Double> redo;


    public UndoRedo(){
        undo = new Stack<>();
        redo = new Stack<>();
    }

    public void pushUndo(Double betrag){
        undo.push(betrag);
    }

    public void pushRedo(Double betrag){
        redo.push(betrag);
    }

    public Double undo(){
        if (!undo.isEmpty()){
            Double uc = undo.pop();

            return uc;
        }

        else{
            System.out.println("Stack ist leer.");
            return null;
        }
    }

    public Double redo(){
        if (!redo.isEmpty()) {
            Double uc = redo.pop();
            return uc;
        }
        else{
            System.out.println("Stack ist leer.");
            return null;
        }
    }

    public Stack<Double> getUndo() {
        return undo;
    }

    public void setUndo(Stack<Double> undo) {
        this.undo = undo;
    }

    public Stack<Double> getRedo() {
        return redo;
    }

    public void setRedo(Stack<Double> redo) {
        this.redo = redo;
    }
}


