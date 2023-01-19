public class Main {
    public static void main(String[] args) {
        try {
            EntierNaturel entierNaturel = new EntierNaturel(-3);
            entierNaturel.decrementer();
            System.out.println(entierNaturel.getVal());
            entierNaturel.decrementer();
            System.out.println(entierNaturel.getVal());

        }catch (NombreNegatifException e){
            System.out.println(e.getMessage());
            System.out.println(e.getNombreException());

        }


    }
}
