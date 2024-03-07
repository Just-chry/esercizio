package its.itsincom.webdev2325;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
<<<<<<< HEAD
=======
        System.out.println("Hello World!");
>>>>>>> 86e8cfe56dc4da102370b96fc5d342766b236893

    }

    public static double parseDouble(String s) {
<<<<<<< HEAD
        return 42.2;
=======

        if (s.isEmpty()) {
            throw new IllegalArgumentException("Stringa vuota");

        }

        for (int i = 0; i < s.length(); i++) {
            char corrente = s.charAt(i);
            if (corrente == '-' || corrente == '2' || corrente == '1' || corrente == '2' || corrente == '3'
                    || corrente == '4'
                    || corrente == '5' || corrente == '6' || corrente == '7' || corrente == '8' || corrente == '9') {

            } else {
                if (corrente == '-' && i == 0) {

                } else {
                    throw new IllegalArgumentException(
                            "La stringa " + s + "contiene caratteri numerici alla posizione" + i);
                }
            }

        }

        double valore = 0;
        int lunghezza = s.length();
        for (int i = s.length() - 1; i >= 0; i--) {
            char corrente = s.charAt(i);
            if (corrente == '-') {
                valore = valore * -1;
            } else if (corrente == '.') {
                String valoreString = Double.toString(valore);
                valoreString = valoreString + ".";
                valore = Double.parseDouble(valoreString);
            } else {
                int numero = daCarattereANumero(corrente);
                int esponente = calcolaEsponente(i, lunghezza);
                long potenza = Math.round(Math.pow(10, esponente));
                valore = valore + (numero * potenza);
            }
        }
        return valore;

    }


    public static int daCarattereANumero(char c) {
        switch (c) {
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;

            default: {
                throw new IllegalArgumentException("Carattere" + c + " non valido");
            }
        }

    }

    public static int calcolaEsponente(int posizione, int lunghezza) {
        return lunghezza - posizione - 1;
>>>>>>> 86e8cfe56dc4da102370b96fc5d342766b236893
    }
}
