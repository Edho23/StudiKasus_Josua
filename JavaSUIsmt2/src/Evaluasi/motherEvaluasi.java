package Evaluasi;

import java.util.Scanner;

public class motherEvaluasi {
    
    protected static int evalCount(String kalimat) {
        String[] word = kalimat.split(" ");
        return word.length;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Kalimat: ");
        String kalimat = scan.nextLine();
        
        int jumlahKata = evalCount(kalimat);
        
        System.out.println("Kalimat: " + kalimat);
        System.out.println("Jumlah Kata: " + jumlahKata);
    }
}
