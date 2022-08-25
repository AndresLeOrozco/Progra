
public class Cifrado {
    private final char[] abecedario;
    private final char[] abecedarioMayus;

    Cifrado() {

        abecedario = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        abecedarioMayus = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        //crear arreglo
        //tabla ASCII
    }

    public String CifrarPalabra(int espacios, String palabra) {
        String cif = "";
        char[] vec = new char[palabra.length()];
        int k = 0;
        int LargoPalabra = palabra.length();
        while (k < LargoPalabra) {
            vec[k] = palabra.charAt(k);
            k++;
        }
        int can = 0;
        while (can < LargoPalabra) {
            for (int i = 0; i < 26; i++) {
                if (vec[can] == abecedario[i]) {
                    if (i + espacios > 25) {
                        int cNueva = (i + espacios) - 25;
                        vec[can] = abecedario[cNueva - 1];
                        break;
                    } else if (i + espacios < 25) {
                        vec[can] = abecedario[i + espacios];
                        break;
                    }
                }

                if (vec[can] == abecedarioMayus[i]) {
                    if (i + espacios > 25) {
                        int cNueva = (i + espacios) - 25;
                        vec[can] = abecedarioMayus[cNueva - 1];
                        break;
                    } else if (i + espacios < 25) {
                        vec[can] = abecedarioMayus[i + espacios];
                        break;
                    }
                }
            }
            can++;
        }
        for (int i = 0; i < can; i++) {
            cif += String.valueOf(vec[i]);
        }
        return cif;
    }

    public String Descifrado(String palabra, int espacios) {
        String cif = "";
        char[] vec = new char[palabra.length()];
        int k = 0;
        int LargoPalabra = palabra.length();
        while (k < LargoPalabra) {
            vec[k] = palabra.charAt(k);
            k++;
        }
        int can = 0;
        while (can < LargoPalabra) {
            for (int i = 0; i < 26; i++) {
                if (vec[can] == abecedario[i]) {
                    if (i - espacios < 0) {
                        int cNueva = 26 + (i - espacios);
                        vec[can] = abecedario[cNueva];
                        break;
                    } else if (i - espacios >= 0) {
                        vec[can] = abecedario[i - espacios];
                        break;
                    }
                }

                if (vec[can] == abecedarioMayus[i]) {
                    if (i - espacios < 0) {
                        int cNueva = 26 + (i - espacios);
                        vec[can] = abecedarioMayus[cNueva];
                        break;
                    } else if (i - espacios >= 0) {
                        vec[can] = abecedarioMayus[i - espacios];
                        break;
                    }
                }
            }
            can++;
        }
        for (int i = 0; i < can; i++) {
            cif += String.valueOf(vec[i]);
        }
        return cif;
    }
}


