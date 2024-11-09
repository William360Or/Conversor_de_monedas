import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        ConversorMoneda miConversion= new ConversorMoneda();
        double cantidad=0;
        String mensaje="el valor de ";
        while (true){
            System.out.println(
                    """
                            ****************************************
                            Sea bienvenido/a al Conversor de monedas ...
                            
                            1) Dólar ==> Peso Argentino.
                            2) Peso Argentino ==> Dólar.
                            3) Dólar ==> Real Brasileño.
                            4) Real Brasileño ==> Dólar.
                            5) Dólar ==> Peso Colombiano.
                            6) Peso Colombiano ==> Dólar.
                            7) Salir.
                            Elija una opcion valida:
                            ****************************************"""
            );
            int opcion=teclado.nextInt();
            if (opcion==7){
                break;
            }else {
                if (opcion<7 && opcion>0){
                System.out.println("Ingresa el valor que deseas convertir: ");
                cantidad=teclado.nextDouble();
                }
                switch (opcion) {
                    case 1:
                      Moneda conversion1= miConversion.convertirMoneda("USD","ARS",cantidad);
                        System.out.println(mensaje+cantidad+" "+conversion1);
                        break;
                    case 2:
                        Moneda conversion2= miConversion.convertirMoneda("ARS","USD",cantidad);
                        System.out.println(mensaje+cantidad+" "+conversion2);
                        break;
                    case 3:
                        Moneda conversion3= miConversion.convertirMoneda("USD","BRL",cantidad);
                        System.out.println(mensaje+cantidad+" "+conversion3);
                        break;
                    case 4:
                        Moneda conversion4= miConversion.convertirMoneda("BRL","USD",cantidad);
                        System.out.println(mensaje+cantidad+" "+conversion4);
                        break;
                    case 5:
                        Moneda conversion5= miConversion.convertirMoneda("USD","COP",cantidad);
                        System.out.println(mensaje+cantidad+" "+conversion5);
                        break;
                    case 6:
                        Moneda conversion6= miConversion.convertirMoneda("COP","USD",cantidad);
                        System.out.println(mensaje+cantidad+" "+conversion6);
                        break;
                    default:
                        System.out.println("la opción no es valida");
                        break;
                }
            }

        }
        System.out.println("Gracias por usar el sistema de conversión de monedas.");

    }
}
