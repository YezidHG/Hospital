/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Control.CostoHosp; 
import java.util.Scanner; 
/**
 *
 * @author Personal
 */
public class Mostrar {
    public static void main(String[] args) { 

        Scanner sc = new Scanner (System.in); 

        System.out.println("Digite el motivo de hospitalización"); 

        System.out.println("1: Virosis"); 

        System.out.println("2: Cirugia"); 

        System.out.println("3. Quemadura"); 

        int opc = sc.nextInt(); 

        System.out.println("Digite el número de días"); 

        int numDias = sc.nextInt(); 

        CostoHosp costos = new CostoHosp (opc,numDias); 

        costos.menu(); 

    } 
}
