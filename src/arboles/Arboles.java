/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;
import  java.util.*;
/**
 *
 * @author user
 */
public class Arboles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        ArrayList<Arb> arb= new ArrayList();
        Scanner teclado = new Scanner(System.in);
        Scanner tec = new Scanner(System.in);
        boolean salir=false;
        do{
        System.out.println("*************************");
        System.out.println("*   1.Agregar Arbol     *");
        System.out.println("*   2.Mostrar Arboles   *");
        System.out.println("*   3.Salir             *");
        System.out.println("*************************");
        do{
        System.out.println("Ingrese una opcion: ");
        op=tec.nextInt();
        }while(op<=0||op>3);
        switch(op){
               case 1:
                   int a;
                   do{
                    System.out.println("ingrese cantidad de arboles a crear");
                    a = tec.nextInt();
                    }while(a<=0);
                    for(int i=0;i<a;i++){
                        Arb arbol =new Arb();
                        System.out.println("Ingrese el nombre");
                        arbol.setNombre(teclado.nextLine());
                        System.out.println("Ingrese familia");
                        arbol.setFamilia(teclado.nextLine());
                        System.out.println("Ingrese tipo de suelo");
                        arbol.setTipo_suelo(teclado.nextLine());
                        System.out.println("Ingrese zona");
                        arbol.setZona(teclado.nextLine());
                         arb.add(arbol);
                    }
                 break;
               case 2:
                for(int i=0;i<arb.size();i++){
                    System.out.println("");
                    System.out.println("arbol: "+(i+1));
                    System.out.println("nombre: "+arb.get(i).getNombre());
                    System.out.println("familia: "+arb.get(i).getFamilia());
                    System.out.println("tipo de suelo: "+arb.get(i).getTipo_suelo());
                    System.out.println("zona: "+arb.get(i).getZona());

                }
                break;
               case 3:
                   salir=true;
                   break; 
            }
        }while(!salir);
    }
    
}
