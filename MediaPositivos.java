package caminoBasico;

import java.util.Scanner;

public class MediaPositivos {
    public static void main(String[] args) {
        
        //Declararemos e inicializamos las variables
        int num=0, cont_pos=0, suma_pos=0;
        float media_pos=0;
        
        Scanner entrada = new Scanner(System.in);

        //Pedir un número por consola. 0 para terminar
        do {
            System.out.print ("Introduzca un número mayor que 0: ");
            num = entrada.nextInt();
            if (num>0){
                cont_pos++;
                suma_pos+=num;
            } 
        } while (num!=0);
        
        if(cont_pos != 0) {
            media_pos = suma_pos / cont_pos;
            System.out.println("Media de los números positivos: " + media_pos);
        }
    }
}
