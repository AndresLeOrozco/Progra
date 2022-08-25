public class main {
    public static void main(String[] args) {
        Cifrado palabrinha = new Cifrado();
       String palCifrada = palabrinha.CifrarPalabra(4,"Z1bra");
       System.out.println(palCifrada);
       System.out.println(palabrinha.Descifrado(palCifrada,4));

    }
}
