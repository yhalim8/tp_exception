public class NombreNegatifException extends Exception {
    int nombreException=0;
    public NombreNegatifException (String message){
        super(message);
    }
    public NombreNegatifException (String message,int nombreException){
        super(message);
        this.nombreException=nombreException;
    }

    public int getNombreException() {
        return nombreException;
    }
}
