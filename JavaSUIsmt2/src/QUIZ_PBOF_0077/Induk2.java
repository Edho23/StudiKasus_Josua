/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUIZ_PBOF_0077;

/**
 *
 * @author Josua EL
 */

import java.util.*;

public class Induk2 
{


    private void X() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Kode Maskapai Penerbangan Anda : ");
        String kodePenerbangan = scanner.nextLine();
        String maskapai = kodePenerbangan.substring(0, 3);
        String noPenerbangan = kodePenerbangan.substring(4);
        System.out.println("Maskapai: " + maskapai);
        System.out.println("No. Penerbangan: " + noPenerbangan);
        
    }
    
    void menampilkan()
    {
        X();
    }

}
