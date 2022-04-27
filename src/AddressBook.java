import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AddressBook {

        //Scanner para pedir datos
        private Scanner sc;

        public AddressBook() {
            sc = new Scanner(System.in);
            sc.useDelimiter("\n"); //Usado para nextLine()
            sc.useLocale(Locale.US); // Para double
        }



        public String pedirString() {

            System.out.println("Introduce una cadena");
            String cadena = sc.next();

            return cadena;

        }


        public String pedirString(String mensaje) {

            System.out.println(mensaje);
            String cadena = sc.next();

            return cadena;

        }


        public long pedirLong() {

            long num = 0;
            boolean correcto;
            do {
                correcto = true;
                try {
                    System.out.println("Introduce un numero entero long");
                    num = sc.nextLong();
                } catch (InputMismatchException ex) {
                    // En caso de error, se marca como incorrecto
                    correcto = false;
                    sc.next();
                }

                //En caso de error, muestro el error
                if (!correcto) {
                    System.out.println("Error, introducce un numero entero long");
                }

            } while (!correcto);

            return num;
        }


        public long pedirLong(String mensaje) {

            long num = 0;
            boolean correcto;
            do {
                correcto = true;
                try {
                    System.out.println(mensaje);
                    num = sc.nextLong();
                } catch (InputMismatchException ex) {
                    // En caso de error, se marca como incorrecto
                    correcto = false;
                    sc.next();
                }

                //En caso de error, muestro el error
                if (!correcto) {
                    System.out.println("Error, introducce un numero entero long");
                }

            } while (!correcto);

            return num;
        }



    }

