package Errors;

public class EmptyDataStructureException extends RuntimeException{

    String DSName = null;

    public EmptyDataStructureException(String DSName){
        this.DSName = DSName;
    }

    public String getMessage(){
        return String.format("The '%s' is empty!", DSName);
    }

}
