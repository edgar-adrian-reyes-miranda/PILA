package PILA;

import java.util.Scanner;

public class PILA_1 {

    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        int letras = 0;// se inicializa nuestra variable
        int op;//do while y switch
        char le = 'a';
        //char let='A';
        char pila[] = new char[27];///nuestra pila almacena 27 espacios
        do {
            System.out.println("1.-llenar: ");
            System.out.println("2.-Mostrar: ");
            System.out.println("3.-Eliminar");
            System.out.println("4.-Agregar: ");
            System.out.println("5.-Salir: ");

            switch (op = abc.nextInt()) {
                //casos
                case 1:   //lista ya agreagda
                    //en nuestra opcion se debe de llenar de forma automatica sin ingresa datos
                    if(letras ==0){
                    for (le = 'a'; le <= 'z'; le++) {
//nuestro for muestra las letras ya asignadas por defecto
                        System.out.print(" ," + le);
                        System.out.print("\n");
                    }
                    
                    }else{
                        le='a';
                        while(letras<26){
                            pila[letras]=le;
letras++;
le++;                        }
                    }
                    break;
                case 2: //mostrar
                    if (letras > 0) {
                        System.out.println("Elementos almacenados: ");
                        for (int i = letras - 1; i >= 0; i--) {  //ahora mostrara las letras ya agregadas 
                            System.out.println(" " + pila[i]);
                        }

                    } else {  //si no hay nada agregada nos mandara falso
                        System.out.println("No hay elemento ");
                    }
                    break;

                case 3:   //eliminacion de lista datos agregados
                    if (letras != 0) {
                        System.out.println("Eliminar el ultimo valor");
                        letras--;
                    } else {
                        System.out.println("No se puede eliminar nada ");
                    }
                    //eliminacion de elementos va empezar desde atras hacia adelanteen caso de agregar 
                    //valores
                    break;

                case 4: ///daots por asignar de forma manuel y se agregen automaticamente
                    if(letras<26) {
                        System.out.println("Ingresa los datos: ");
                    le=abc.next().charAt(0);
                    //realizacion del incremento y añadir las letras
                    pila[letras]=le;
                    le++;
                    
                    letras++;                       
                        
                } else {
                        System.out.println("La cola esta llena");  
                    }        
                        break;
                


                default:
                    System.out.println("No se encuentra en el menu :)");

            }

        } while (op != 5);

    }

}

