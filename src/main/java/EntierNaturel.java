public class EntierNaturel {
    private int val;

    public EntierNaturel(int val) throws NombreNegatifException {
        if(val<0) throw new NombreNegatifException("le nombre est negatif",val);
        this.val = val;
    }

    public int getVal() {
        return val;
    }
    public void setVal(int val) throws NombreNegatifException {
        if(val<0) throw new NombreNegatifException("le nombre est negatif");
        this.val = val;
    }
    public void decrementer() throws NombreNegatifException  {
        if((val-1)<0) throw new NombreNegatifException("tu ne peux pas decrementer");
            val--;

    }
}
