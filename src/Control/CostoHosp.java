/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author Personal
 */
public class CostoHosp {
    private int opc; 

    private int numDias; 

    private long costoTotal =0; 

    private String Motivo = ""; 

    //-----------------Constructor 

    public CostoHosp(int opc, int numDias){ 

        this.opc = opc; 

        this.numDias = numDias; 

    } 

    //------------------------Metodos 

    public void menu (){ 

        switch (this.opc) { 

            case 1: 

                costoTotal = this.numDias * 25000; 

                Motivo="Virosis"; 

                break; 

            case 2: 

                costoTotal = this.numDias * 30000; 

                Motivo="Cirugia"; 

                break; 

            case 3: 

                costoTotal = this.numDias * 40000; 

                Motivo="Quemaduras"; 

                break; 

            default: 

                System.out.println("Motivo de hospitalización inválido"); 

                System.exit(0); 

        } 

        System.out.println("El motivo de hospitalizacion es :" + Motivo); 

        System.out.println("El costo total de hospitalizacion es :"+costoTotal); 

    } 
}
