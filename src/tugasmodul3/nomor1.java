/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmodul3;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class nomor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" ***SEQUENTIAL SEARCH *** "+"\n");
        String data [] = {"2, 4, 6, 8, 10, 12, 14, 16, 18, 20"};
        String key;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan data yang dicari: ");
        key =scan.nextLine();
        
        System.out.println("Isi data adalah: ");
        for (int i =0; i<data.length; i++){
            
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        
        for(int i = 0; i <= data.length; i++){
            if (key.equalsIgnoreCase(data[i])){
                System.out.print("data" +key+ "berada pada index - " + i);
                break;
            }
        }
        System.out.println("\n");
        System.out.println();
        System.out.println(" *** TERIMA KASIH *** ");
            }
        }
    

