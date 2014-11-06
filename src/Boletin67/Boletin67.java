package Boletin67;
//@author dpazolopez/

public class Boletin67 {

    public static void main(String[] args) {
        Productos par1 = new Productos("C1", 24f);
        Productos par2 = new Productos("H23", 234f);
        Productos par3 = new Productos("M30", 109f);
        System.out.println("Codigo1: " + par1.getCodigo() + " Precio: " + par1.getPrecio() + "€");
        System.out.println("Codigo2: " + par2.getCodigo() + " Precio: " + par2.getPrecio() + "€");
        System.out.println("Codigo3: " + par3.getCodigo() + " Precio: " + par3.getPrecio() + "€");
        par2.setCodigo("K123");
        par2.setPrecio(247);
        System.out.println("Codigo2: " + par2.getCodigo() + " Precio: " + par2.getPrecio() + "€");
    }
}
