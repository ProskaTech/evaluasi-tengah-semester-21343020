// Created by Budi Prasetyo 21343020
package com.program;

import java.util.Scanner;

public class uts2 {
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);

    System.out.print("masukkan tinggi: ");
    int jumlah = input.nextInt();
    pjpt(jumlah);
    pjp(jumlah);
  }

  public static void pjp(int tinggi){
    for(int i = 1; i <= tinggi; i++){
      for(int j = 1; j <= (tinggi*2)-1; j++){
        if(Math.abs(tinggi-j)<i){
          System.out.print( '*' );
        }
        else{
          System.out.print( ' ' );
        }
      }
      System.out.println();
    }
  }

  public static void pjpt(int tinggi){
    for(int i = tinggi; i>=1;i--){
       for(int j=1;j<=(tinggi*2)-1;j++){
        if(Math.abs(tinggi-j)<i){
          System.out.print( "*" );
        }
        else{
          System.out.print( " " );
        }
      }
      System.out.println();
}
}
}